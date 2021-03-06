package fr.ubx.poo.model.go;

import fr.ubx.poo.game.Game;
import fr.ubx.poo.game.Position;

public class Explosion extends GameObject {
	long start;
	boolean exploded=false;
	
	public Explosion(Game game, Position position, long start) {
		super(game,position);
		this.start=start;
	}
	
	/**
	 * 
	 * @return the moment when the explosion has started
	 */
	public long getStart() {
		return start;
	}
	
	/**
	 * 
	 * @return true if the explosion is finished, false else
	 */
	public boolean getExplosed() {
		return exploded;
	}
	
	
	/**
	 * 
	 * @param now
	 * An explosion lasts one second.
	 */
	public void update(long now) {
		if(now-  start>=1*Math.pow(10,9)) {
			exploded=true;
		}
	}
		
}

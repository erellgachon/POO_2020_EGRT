package fr.ubx.poo.model.decor;

import fr.ubx.poo.game.Position;

public class DoorOpen extends Decor{
private Position position;
	
	@Override
    public String toString() {
        return "NbBombMoins";
    }
	
	public Position getPosition() {
		return this.position;
	}
	
	public void setPosition(Position p) {
		this.position=p;
	}
}
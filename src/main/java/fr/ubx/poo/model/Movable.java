/*
 * Copyright (c) 2020. Laurent Réveillère
 */

package fr.ubx.poo.model;

import java.io.IOException;

import fr.ubx.poo.game.Direction;

public interface Movable {
	
    boolean canMove(Direction direction);
    void doMove(Direction direction, long now) throws IOException;
}

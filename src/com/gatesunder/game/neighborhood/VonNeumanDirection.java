package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.Direction;

public enum VonNeumanDirection
	implements Direction
{
	NORTH	(0),
	EAST	(1),
	SOUTH	(2),
	WEST	(3);

	private final int _value;

	public VonNeumanDirection(int value) {_value = value;}
	
	public int value() {return _value;}
	public static int size() {return 4;}
}

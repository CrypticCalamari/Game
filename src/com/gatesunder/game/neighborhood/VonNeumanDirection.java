package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.IDirection;

public enum VonNeumanDirection
	implements IDirection
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

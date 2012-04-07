package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.Direction;

public enum MooreDirection
	implements Direction
{
	NORTH_WEST	(0),
	NORTH		(1),
	NORTH_EAST	(2),
	EAST		(3),
	SOUTH_EAST	(4),
	SOUTH		(5),
	SOUTH_WEST	(6),
	WEST		(7);

	private final int _value;

	public MooreDirection(int value) {_value = value;}

	public int value() {return _value;}
	public static int size() {return 8;}
}

package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.IDirection;

public enum HexDirection
	implements IDirection
{
	UP			(0),
	RIGHT_UP	(1),
	RIGHT_DOWN	(2),
	DOWN		(3),
	LEFT_DOWN	(4),
	LEFT_UP		(5);

	private final int _value;

	public HexDirection(int value) {_value = value;}

	public int value() {return _value;}
	public static int size() {return 6;}
}

package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.IDirection;

public enum TriDirection
	implements IDirection
{
	LEFT	(0),
	RIGHT	(1),
	CENTER	(2);

	private final int _value;

	public TriDirection(int value) {_value = value;}
	
	public int value() {return _value;}
	public static int size() {return 4;}
}

package com.gatesunder.game.location;

import com.gatesunder.game.location.ILocation;

public class LinearLocation
	implements ILocation
{
	private int x;

	public int getX() {return x;}

	public Location setX(int x) {this.x = x; return this;}

	public int hashCode() {return x;}
	public boolean equals(Object obj)
	{
		return (
			x == ((LinearLocation)obj).x
		);
	}
}

package com.gatesunder.game.location;

import com.gatesunder.game.location.Location;

public class LinearLocation
	implements Location
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

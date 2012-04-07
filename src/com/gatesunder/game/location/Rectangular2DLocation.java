package com.gatesunder.game.location;

import com.gatesunder.game.location.ILocation;

public class Rectangular2DLocation
	implements ILocation
{
	private int x;
	private int y;

	public int getX() {return x;}
	public int getY() {return y;}

	public Location setX(int x) {this.x = x; return this;}
	public Location setY(int y) {this.y = y; return this;}

	public int hashCode() {return y + 31*x;}
	public boolean equals(Object obj)
	{
		return (
			x == ((Location)obj).x &&
			y == ((Location)obj).y
		);
	}
}

package com.gatesunder.game;

import com.gatesunder.game.location.Location;

public class Rectangular3DLocation
	implements Location
{
	private int x;
	private int y;
	private int z;

	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}

	public Rectangular3DLocation setX(int x) {this.x = x; return this;}
	public Rectangular3DLocation setY(int y) {this.y = y; return this;}
	public Rectangular3DLocation setZ(int z) {this.z = z; return this;}

	public int hashCode() {return z + 31*(y + 31*x);}
	public boolean equals(Object obj)
	{
		return (
			x == ((Rectangular3DLocation)obj).x && 
			y == ((Rectangular3DLocation)obj).y &&
			z == ((Rectangular3DLocation)obj).z
		);
	}
}

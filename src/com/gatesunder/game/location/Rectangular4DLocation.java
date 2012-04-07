package com.gatesunder.game;

import com.gatesunder.game.location.Location;

public class Rectangular4DLocation
	implements Location
{
	private int x;
	private int y;
	private int z;
	private int w;

	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	public int getW() {return w;}

	public Rectangular4DLocation setX(int x) {this.x = x; return this;}
	public Rectangular4DLocation setY(int y) {this.y = y; return this;}
	public Rectangular4DLocation setZ(int z) {this.z = z; return this;}
	public Rectangular4DLocation setW(int w) {this.w = w; return this;}

	public int hashCode() {return w + 31*(z + 31*(y + 31*x);}
	public boolean equals(Object obj)
	{
		return (
			x == ((Rectangular4DLocation)obj).x && 
			y == ((Rectangular4DLocation)obj).y &&
			z == ((Rectangular4DLocation)obj).z &&
			w == ((Rectangular4DLocation)obj).w
		);
	}
}

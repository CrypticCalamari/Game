package com.gatesunder.game.location;

import com.gatesunder.game.location.ILocation;

import java.util.Iterator;

public class GenericLocation
	implements ILocation, Iterable<Integer>
{
	private int[] coordinates;

	public GenericLocation(int... coordinates)
	{
		this.coordinates = coordinates;
	}

	public int get(int i) {return coordinates[i];}
	public int size() {return coordinates.length;}

	public class GenericLocationIterator
		implements Iterator<Integer>
	{
		private int i = 0;
		private int[] coor = coordinates;
		public boolean hasNext()
		{
			return (i < coor.length - 1);
		}
		public Integer next() {return Integer.valueOf(coor[i++]);}
		public void remove() {}
	}

	public Iterator<Integer> iterator() {return new GenericLocationIterator();}

	public int hashCode()
	{
		int h = 0;
		for (int i: coordinates)
			h = 31*h + i;

		return h;
	}
	public boolean equals( Object obj )
	{
		Iterator<Integer> it = ((GenericLocation)obj).iterator();
		for (int i: coordinates)
			if (!Integer.valueOf(i).equals(it.next()))
				return false;
		return true;
	}
}






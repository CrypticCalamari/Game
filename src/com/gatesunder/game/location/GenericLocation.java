package com.gatesunder.game.location;

import com.gatesunder.game.location.Location;

import java.util.Iterator;

public class GenericLocation
	implements Location, Iterable<Integer>
{
	private Integer[] coordinates;

	public GenericLocation(Integer... coordinates)
	{
		this.coordinates = coordinates;
	}

	public int get(int i) {return coordinates[i].intValue();}
	public int size() {return coordinates.length;}

	public class GenericLocationIterator implements Iterator<Integer>
	{
		private int i = 0;
		private Integer[] coor = coordinates;
		public boolean hasNext()
		{
			return (i < coor.length - 1);
		}
		public Integer next() {return coor[i++];}
		public void remove() {}
	}

	public Iterator<Integer> iterator() {return new GenericLocationIterator();}

	public int hashCode()
	{
		int h = 0;
		for (Integer i: coordinates)
			h = 31*h + i.intValue();

		return h;
	}
	public boolean equals( Object obj )
	{
		Iterator<Integer> it = obj.iterator();
		for (Integer i: coordinates)
			if (!i.equals(it.next()))
				return false;
		return true;
	}
}






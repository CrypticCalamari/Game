package com.gatesunder.game.neighborhood;

import com.gatesunder.game.Cell;
import com.gatesunder.game.neighborhood.Direction;

///////////////////////////////////////////////////////////////////////////////
///////			BEGIN: Class			///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
public class Neighborhood <D extends Direction>
{
	//	Variables	-----------------------------------------------------------
	private Cell[] neighbors = new Cell[ D.size() ];


	//	Methods	---------------------------------------------------------------
	public Cell getNeighbor( Direction direction )
	{
		return neighbor[ direction.value() ];
	}
	public Neighborhood setNeighbor(Direction direction, Cell neighbor)
	{
		neighbors[ direction.value() ] = neighbor;
		return this;
	}
}
///////////////////////////////////////////////////////////////////////////////
///////			END: Class			///////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////

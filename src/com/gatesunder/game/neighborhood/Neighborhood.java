package com.gatesunder.game.neighborhood;

import com.gatesunder.game.neighborhood.INeighbor;
import com.gatesunder.game.neighborhood.IDirection;

///////////////////////////////////////////////////////////////////////////////
///////			BEGIN: Class			///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
public class Neighborhood <D extends IDirection>
{
	//	Variables	-----------------------------------------------------------
	private INeighbor[] neighbors = new INeighbor[ D.size() ];

	//	Methods	---------------------------------------------------------------
	public INeighbor getNeighbor( IDirection direction )
	{
		return neighbor[ direction.value() ];
	}
	public Neighborhood setNeighbor(IDirection direction, INeighbor neighbor)
	{
		neighbors[ direction.value() ] = neighbor;
		return this;
	}
}
///////////////////////////////////////////////////////////////////////////////
///////			END: Class			///////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////

package com.gatesunder.game;

import com.gatesunder.game.board.ICellType;
import com.gatesunder.game.location.ILocation;
import com.gatesunder.game.neighborhood.Neighborhood;
import com.gatesunder.game.IPiece;

public class Cell
	implements ICell
{
	private Neighborhood neighborhood;
	private ICellType type;
	private ILocation location;
	private IPiece piece;

	public ICellType getType()		{return type;}
	public ILocation getLocation()	{return location;}
	public ICell getNeighbor( IDirection d ) {return neighborhood.getNeighbor(d);}
	public IPiece getPiece()		{return piece;}

	public ICell setType( ICellType type )
	{
		this.type = type;
		return this;
	}
	public ICell setLocation( ILocation location )
	{
		this.location = location;
		return this;
	}
	public ICell setPiece( IPiece piece )
	{
		this.piece = piece;
		return this;
	}
}

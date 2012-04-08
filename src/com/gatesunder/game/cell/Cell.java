package com.gatesunder.game.cell;

import com.gatesunder.game.location.ILocation;
import com.gatesunder.game.cell.ICellType;
import com.gatesunder.game.neighborhood.Neighborhood;
import com.gatesunder.game.neighborhood.IDirection;
import com.gatesunder.game.IPiece;

public final class Cell <D extends IDirection>
	implements ICell
{
	private ILocation		L;
	private ICellType		CT;
	private Neighborhood<D>	N;
	private IPiece			P;

	public ILocation	getLocation()				{return L;}
	public ICellType	getCellType()				{return CT;}
	public ICell		getNeighbor(IDirection D)	{return N.getNeighbor(D);}
	public IPiece		getPiece()					{return P;}

	public ICell setLocation( ILocation L )
	{
		this.L = L;
		return this;
	}
	public ICell setCellType( ICellType CT )
	{
		this.CT = CT;
		return this;
	}
	public ICell setNeighbor( ICell C, IDirection D )
	{
		this.N.setNeighbor(C, D);
		return this;
	}
	public ICell setPiece( IPiece P )
	{
		this.P = P;
		return this;
	}
}

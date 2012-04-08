package com.gatesunder.game.cell;

import com.gatesunder.game.cell.ICellType;
import com.gatesunder.game.location.ILocation;
import com.gatesunder.game.neighborhood.INeighbor;
import com.gatesunder.game.neighborhood.IDirection;
import com.gatesunder.game.IPiece;

public interface ICell
	extends INeighbor
{
	public ILocation	getLocation();
	public ICellType	getCellType();
	public ICell		getNeighbor( IDirection D );
	public IPiece		getPiece();

	public ICell setLocation( ILocation L );
	public ICell setCellType( ICellType CT );
	public ICell setNeighbor( ICell C, IDirection D );
	public ICell setPiece( IPiece P );
}

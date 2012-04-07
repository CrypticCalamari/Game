package com.gatesunder.game.board;

import com.gatesunder.game.board.ICellType;
import com.gatesunder.game.location.ILocation;
import com.gatesunder.game.neighborhood.INeighbor;
import com.gatesunder.game.IPiece;

public interface ICell
	extends INeighbor
{
	public ILocation getLocation();
	public IPiece getPiece();
	public ICellType getType();

	public ICell setLocation( ILocation location );
	public ICell setPiece( IPiece piece );
	public ICell setType( ICellType type );
}

package com.gatesunder.game;

import com.gatesunder.game.board.ICell;
import com.gatesunder.game.IPlayer;

public interface IPiece
{
	public ICell getCell();
	public IPlayer getOwner();

	public IPiece setCell(ICell cell);
	public IPiece setOwner(IPlayer owner);
}

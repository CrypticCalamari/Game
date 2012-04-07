package com.gatesunder.game.board;

import com.gatesunder.game.board.ICell;

import com.gatesunder.game.location.ILocation;

public abstract class IBoard
{
	public ICell getCell( ILocation location );
}

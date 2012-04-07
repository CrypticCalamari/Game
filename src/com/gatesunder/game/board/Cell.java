package com.gatesunder.game;

import com.gatesunder.game.location.Location;

import com.gatesunder.game.ICellType;
import com.gatesunder.game.Piece;

public class Cell
	implements ICell
{
	private ICellType type;
	private Location location;
	private Piece piece;

	public ICellType getType() {return type;}
	public Location getLocation() {return location;}
	public Piece getPiece() {return piece;}

	public Cell setType(ICellType type) {this.type = type; return this;}
	public Cell setLocation(Location location) {this.location = location; return this;}
	public Cell setPiece(Piece piece) {this.piece = piece; return this;}
}

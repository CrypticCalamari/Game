package com.gatesunder.game;

import java.threads.Runnable;

import com.gatesunder.game.Board;
import com.gatesunder.game.Cell;
import com.gatesunder.game.Piece;
import com.gatesunder.game.Player;

public class Game
	implements IGame, Runnable
{
	private Board board;
	private Player[] player;
	private boolean gameOver = false;
	private int turn = 0;

	public void run()
	{
		while (!gameOver)
		{
			player[i].takeTurn();
		}
	}
}

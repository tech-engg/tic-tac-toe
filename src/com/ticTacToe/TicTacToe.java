package com.ticTacToe;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("welocme to tic-tac-toe");
		char[] board = createBoard();
    }
	public static char[] createBoard()
	{
		char[] board = new char[10];
		for(int i=1; i < 10; i++)
		{
			board[i] =  ' ';
			
		}
		return board;
      }

}

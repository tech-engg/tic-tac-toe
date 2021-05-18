package com.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
           static char player;
	public static void main(String[] args) {
		System.out.println("welocme to tic-tac-toe");
		char[] board = createBoard();
		char computerVariable ;
		player = playerCharacter();
        if(player == 'X')
        {
        	computerVariable = 'O';
        }
        else
        {
        	computerVariable = 'X';
        }
        System.out.println("player chioce" + player);
        System.out.println("Computer variable"  + computerVariable);
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
	   public static char playerCharacter()
			{
		Scanner sc=new Scanner(System.in);
		System.out.println("select a character 'X' or 'O' :");
		char choice =sc.next().charAt(0);
		return choice;
			}
}

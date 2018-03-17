
//import java.util.*;
//import java.lang.*;
//import java.io.*;

class TicTacToe
{

	public static int ticTacToe(int[][] matrix, int row, int col, int player) {
        matrix[row][col]=player;
 
        //check row
        boolean winner=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[row][i]!=player){
                winner=false;
                break;
            }
        }
 
        if(winner) return player;
 
        //check column
        winner=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][col]!=player){
                winner=false;
                break;
            }
        }
 
        if(winner) return player;
 
        //check back diagonal
        winner=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][i]!=player){
                winner=false;
                break;
            }
        }
 
        if(winner) return player;
 
        //check forward diagonal
        winner=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix.length-i-1]!=player){
                winner=false;
                break;
            }
        }
 
        if(winner) return player;
 
        return 0;
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] matrix = new int[][]{{1,0,1},{0,1,0},{0,0,2}};
		int row = 2;
		int colm = 2; 
		int player = 1;
		int winner = ticTacToe(matrix, row, colm, player);
		System.out.println("The winner after the last move is : " + winner);
		// your code goes here
	}
}


##Question##: 
Design a Tic-tac-toe game that is played between two players on a n x n grid.

You may assume the following rules:

A move is guaranteed to be valid and is placed on an empty block.
Once a winning condition is reached, no more moves is allowed.
A player who succeeds in placing n of their marks in a horizontal, vertical, or diagonal row wins the game.
Example:
Given n = 3, assume that player 1 is "X" and player 2 is "O" in the board.

TicTacToe toe = new TicTacToe(3);

toe.move(0, 0, 1); -> Returns 0 (no one wins)
|X| | |
| | | | // Player 1 makes a move at (0, 0).
| | | |

toe.move(0, 2, 2); -> Returns 0 (no one wins)
|X| |O|
| | | | // Player 2 makes a move at (0, 2).
| | | |

toe.move(2, 2, 1); -> Returns 0 (no one wins)
|X| |O|
| | | | // Player 1 makes a move at (2, 2).
| | |X|

toe.move(1, 1, 2); -> Returns 0 (no one wins)
|X| |O|
| |O| | // Player 2 makes a move at (1, 1).
| | |X|

toe.move(2, 0, 1); -> Returns 0 (no one wins)
|X| |O|
| |O| | // Player 1 makes a move at (2, 0).
|X| |X|

toe.move(1, 0, 2); -> Returns 0 (no one wins)
|X| |O|
|O|O| | // Player 2 makes a move at (1, 0).
|X| |X|

toe.move(2, 1, 1); -> Returns 1 (player 1 wins)
|X| |O|
|O|O| | // Player 1 makes a move at (2, 1).
|X|X|X|
Follow up:
Could you do better than O(n2) per move() operation?

Hint:

Could you trade extra space such that move() operation can be done in O(1)?
You need two arrays: int rows[n], int cols[n], plus two variables: diagonal, anti_diagonal.

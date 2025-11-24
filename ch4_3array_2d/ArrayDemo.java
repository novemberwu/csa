package ch4_3array_2d;

public class ArrayDemo {
    public static int[][] board;

    //board[i][j] == 0 this is an empty space
    //board[i][j] == 1 a queue is placed here

    public static void placeQueue(){
        board = new int[8][8];// initialization
        for(int row = 0; row < board.length; row++){
            int col = (int)(Math.random() * 8);
            board[row][col] = 1;
        }
    }

    public static void printBoard(){
        for(int row = 0 ; row < board.length; row++){
            for(int col = 0 ; col < board[row].length; col++){
                System.out.print(board[row][col]+ " ");
            }
            System.out.println();
        }

    }
}

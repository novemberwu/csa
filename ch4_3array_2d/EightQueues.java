package ch4_3array_2d;

public class EightQueues {
    public static void main(String[] args){

        int[][] board = new int[8][8];

        for(int i = 0; i < board.length; i++){
            int col = (int)(Math.random() * 8);
            board[i][col] = 1;
        }

        for(int[] row: board) {
            for (int col : row) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

    }
}

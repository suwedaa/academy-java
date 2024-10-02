package com.bptn.course.game_board;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    // add instance variables
    private String[][] board;
    private Scanner scanner = new Scanner(System.in); 

    public void boardSetUp() {
        System.out.println("------ Board Set up -------");
        System.out.println("Number of rows: ");
        int row = scanner.nextInt(); // receive user input
        System.out.println("Number of cols: ");
        int column = scanner.nextInt(); 
        // receive column value
        this.board = new String[row][column]; 
        		// initialize a row by column array;

        // initialize empty board with dashes (-)
        for (String[] row1 : board) {
            for(int i=0; i<row1.length; i++){
                row1[i] = "-"; 
            }
            // fill up each row of the board with dashes
        }
    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean columnFull(int col) {
        for(int row = 0; row < board.length; row++){
            if (board[row][col].equals("-")) {  // check if the column is full by just checking the 0'th row's value) {
            return false;
            }
        }
        
        return true;
    }

    public boolean boardFull() {
        // True understanding this code.
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean addToken(int colToAddToken, String token) {
        int rowToAddToken = board.length - 1;

        while (rowToAddToken >=0) {// what condition should be here to allow you to keep searching for the right row level of the board to place the token? ) {
            if (board[rowToAddToken][colToAddToken].equals("-")) {
               // You now know the right row and column to place the token. Place it and then return true.
               board[rowToAddToken][colToAddToken] = token;
                return true;
            } else {
                rowToAddToken -= 1;
            }
            
        }
        return false;

        
    }

    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        if (checkHorizontal(playerNumber)) {
            return true;
        } else if (checkVertical(playerNumber)) {
            return true;
        }
        else if (checkLeftDiagonal(playerNumber)) {
            return true;
        }
        else if (checkRightDiagonal(playerNumber)) {
            return true;
        }
        // what other conditions should we include here?
        return false;
    }

    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
            // length - 3 here because we are comparing 4 in a row items
            for (int row = 0; row < board.length - 3; row++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col]
                            && board[row][col] == board[row + 2][col]
                            && board[row][col] == board[row + 3][col]) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public boolean checkHorizontal(String playerNumber) {
        for (int col = 0; col < board[0].length - 3; col++) {
            for(int row = 0; row<board.length; row++){
                if (board[row][col].equals(playerNumber)){
                    if(board[row][col] == board[row][col + 1]
                        && board[row][col] == board[row][col + 2]
                        && board[row][col] == board[row][col + 3]){
                            return true; }
                }

            }
           // try implementing this by being inspired by the checkVertical logic. Note avoid off by 1 errors. Also remember that you are now checking across columns within each row this time. 
        }
        return false;
    }

     public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col + 1]
                            && board[row][col] == board[row + 2][col + 2]
                            && board[row][col] == board[row + 3][col + 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkRightDiagonal(String playerNumber) {
    for (int row = 0; row < board.length - 3; row++) { 
        for (int col = 3; col < board[0].length; col++) { 
            if (board[row][col].equals(playerNumber)) {
                if (board[row + 1][col - 1] == board[row][col] && 
                    board[row + 2][col - 2] == board[row][col] && 
                    board[row + 3][col - 3] == board[row][col]) {
                    return true; 
                }
            }
        }
    }
    return false; 
    }
}
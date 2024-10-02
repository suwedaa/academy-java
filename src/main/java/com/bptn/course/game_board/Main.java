package com.bptn.course.game_board;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // TODO: Uncomment this to test your board class in isolation. 
    // This is just a small set of tests for our board class for now. We will
    // delete this when we have the TestClass and Game class created.
    // We should have only one "main" method in the program at the end of the entire
    // challenge otherwise Java will freak out if there are multiple main classes in
    // the different classes it looks into.
    // A main method acts as the Java entry point into your program and Java expects
    // only one entry point.
    
    //Uncomment below to see if you've done the job:
     public static void main(String[] args) {
         Board board1 = new Board();
         board1.boardSetUp();
         board1.printBoard();

         board1.addToken(0, "x");
         board1.addToken(0, "x");
         board1.addToken(0, "x");
         board1.addToken(1, "y");
         board1.addToken(1, "z");
         board1.addToken(1, "w");
         board1.addToken(0, "x");

         System.out.println("Board for testing checkVertical");
         System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
         System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));

         board1.printBoard();

         Board board2 = new Board();
         // Test with at least a 4-by-4 size board.
         board2.boardSetUp();
         board2.printBoard();

         board2.addToken(0, "x");
         board2.addToken(0, "x");
         board2.addToken(0, "w");
         board2.addToken(0, "w");
         board2.addToken(1, "y");
         board2.addToken(1, "x");
         board2.addToken(1, "w");
         board2.addToken(2, "y");
         board2.addToken(2, "w");
         board2.addToken(2, "x");
         board2.addToken(3, "w");
         board2.addToken(3, "w");
         board2.addToken(3, "w");
         board2.addToken(3, "x");

         System.out.println("Board for testing diagonals");
         System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
         System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
         System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));

         board2.printBoard();
     }
}

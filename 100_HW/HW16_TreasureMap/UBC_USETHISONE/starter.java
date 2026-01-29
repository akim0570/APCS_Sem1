/*
	Author:
	Date:
	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a row: ");
        int row = sc.nextInt();

        System.out.print("Please enter a column: ");
        int column = sc.nextInt();

        System.out.println("Come find the treasure! X marks the spot!");
        System.out.println("Given the map below, you need to dig for the treasure!");
        System.out.println("- 0 means, the spot is untouched");
        System.out.println("- 1 means, the spot has been dug up");
        System.out.println("- 2 means, that's the spot you're currently on");
        System.out.println("- 3 means, that spot has been dug and you're on it");
        System.out.println("- 5 is the treasure!");

        Map merp = new Map(row, column);
        merp.generateTreasure();
        merp.printMap();

        while(true) {
            System.out.println("What action would you like to take? Type the number in:");
            System.out.println("1 - Move Single");
            System.out.println("2 - Move Row/Column");
            System.out.println("3 - Dig");
            System.out.println("4 - Print Map");
            System.out.println("5 - Print Instructions");
            System.out.println("9 - Give Up");
            System.out.println();

            int ans = sc.nextInt();
            System.out.println();

            if(ans == 1) {
                System.out.println("What direction would you like to move in?");
                System.out.println("1 - Up");
                System.out.println("2 - Down");
                System.out.println("3 - Left");
                System.out.println("4 - Right");
                System.out.println("5 - LeftUp");
                System.out.println("6 - RightUp");
                System.out.println("7 - LeftDown");
                System.out.println("8 - RightDown");
                System.out.println();

                int m = sc.nextInt();
                System.out.println();

                if(merp.move(m)) {
                    System.out.println("You moved successfully!");
                } else {
                    System.out.println("Invalid move, try again!");
                }
            }
            else if(ans == 2) {
                System.out.println("Remember we start counting at 0!");
                System.out.print("What row would you like to move to? ");
                int r = sc.nextInt();
                System.out.print("What column would you like to move to? ");
                int c = sc.nextInt();

                if(merp.move(r, c)) {
                    System.out.println("You moved successfully!");
                } else {
                    System.out.println("Invalid move, try again!");
                }
            }
            else if(ans == 3) {
                if(merp.dig()) {
                    System.out.println("You found the treasure!");
                    merp.printTreasureLoc();
                    return;
                } else {
                    System.out.println("You didn't find the treasure. Keep trying!");
                }
            }
            else if(ans == 4) {
                merp.printMap();
            }
            else if(ans == 5) {
                System.out.println("- 0 means, the spot is untouched");
                System.out.println("- 1 means, the spot has been dug up");
                System.out.println("- 2 means, that's the spot you're currently on");
                System.out.println("- 3 means, that spot has been dug and you're on it");
                System.out.println("- 5 is the treasure!");
            }
            else if(ans == 9) {
                System.out.println("Sad to see you go!");
                merp.printTreasureLoc();
                return;
            }
            else {
                System.out.println("Wrong Input, try again!");
            }

            System.out.println("------------------------------");
            System.out.println();
        }
    }
}

class Map {

    int[][] map;
    int rows; 
    int cols;
    int playerRow;
    int playerCol;
    int treasureRow; 
    int treasureCol;

    public Map(int r, int c) {

        rows = r;
        cols = c;

        map = new int[rows][cols];

        playerRow = 0;
        playerCol = 0;

        map[playerRow][playerCol] = 2;

    }

    public void generateTreasure() {

    treasureRow = (int)(Math.random() * rows);
    treasureCol = (int)(Math.random() * cols);

}

    public void printMap() {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(map[i][j] + " ");

            }

            System.out.println();

        }

    }

    public void printTreasureLoc() {

        System.out.println("Treasure Location:");
        System.out.println("Row: " + treasureRow);
        System.out.println("Column: " + treasureCol);

        int original = map[treasureRow][treasureCol];
        map[treasureRow][treasureCol] = 5;

        System.out.println("Map with treasure revealed:");
        printMap();

        map[treasureRow][treasureCol] = original;

    }

    public boolean dig() {

        if (playerRow == treasureRow && playerCol == treasureCol) {

            map[playerRow][playerCol] = 5;
            return true;

        }

        if (map[playerRow][playerCol] == 2) {

            map[playerRow][playerCol] = 3;

        } 
        else {

            map[playerRow][playerCol] = 1;

        }

        return false;

    }

    public boolean move(int dir) {

        int r = playerRow;
        int c = playerCol;

        if (dir == 1) {

            r--;

        } 
        else if (dir == 2) {

            r++;

        } 
        else if (dir == 3) {

            c--;

        } 
        else if (dir == 4) {

            c++;

        } 
        else if (dir == 5) {

            r--;
            c--;

        } 
        else if (dir == 6) {

            r--;
            c++;

        } 
        else if (dir == 7) {

            r++;
            c--;

        } 
        else if (dir == 8) {

            r++;
            c++;

        } 
        else {

            return false;

        }

        return move(r, c);

    }

    public boolean move(int r, int c) {

        if (r < 0 || r >= rows || c < 0 || c >= cols) {

            return false;

        }

        if (map[playerRow][playerCol] == 2) {

            map[playerRow][playerCol] = 0;

        } 
        else if (map[playerRow][playerCol] == 3) {

            map[playerRow][playerCol] = 1;

        }

        playerRow = r;
        playerCol = c;

        if (map[playerRow][playerCol] == 1) {

            map[playerRow][playerCol] = 3;

        } 
        else {

            map[playerRow][playerCol] = 2;

        }

        return true;

    }

}
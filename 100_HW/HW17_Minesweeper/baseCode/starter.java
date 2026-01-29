import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);
        printGrid(guessGrid);
        System.out.println("-------------------------------------");

        boolean alive = true;
        while(alive){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){           
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    /*
        This method should completely generate a grid of bombs and adjacent values
        EX:
            0 1 9 1 0 2 9 2 0 0 
            0 1 1 1 0 2 9 2 1 1 
            0 0 0 0 0 2 2 2 1 9 
            0 0 0 0 0 1 9 2 3 3 
            1 1 1 0 0 1 1 2 9 9 
            1 9 1 0 0 0 0 1 2 2 
            1 1 1 0 0 0 0 0 0 0 
            0 0 1 1 1 0 0 0 0 0 
            1 1 2 9 1 0 0 0 0 0 
            1 9 2 1 1 0 0 0 0 0 
            
        Start by defining how many bombs the difficulty states.
        
        There are 2 steps to this:
        1. Generate bombs randomly
        2. Generate all the adjacent values in a grid
        
        For step 1:
        - Create a loop that goes until there are no more bombs to place
        - Within that, iterate through the entire 2D array and place bombs
            - To place a bomb randomly, this should be a 1 in 10 chance to place a bomb
                - All bombs should be the value 9
            - Make sure to not place bombs on bombs that are already there
            - When a bomb is placed, make sure to track that for your outer loop
        - This should loop through the 2D array over and over until ALL bombs have been placed
        
        For step 2:
        - Loop through the 2D array
            - For every bomb, call the add adjacent method,  
    */
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int bombs;
        if(diff == 1) {
            bombs = 10;
        }
        else if(diff == 2){ 
            bombs = 25;
        }
        else if(diff == 3){
            bombs = 40;
        }
        else{
            bombs = 99;
        }
        
        while(bombs > 0){
        for(int i = 0; i < bombProxGrid.length && bombs > 0; i++){
            for(int j = 0; j < bombProxGrid[0].length && bombs > 0; j++){
                if((int)(Math.random() * 10) == 0 && bombProxGrid[i][j] != 9){
                    bombProxGrid[i][j] = 9;
                    bombs--;
                }
            }
        }
        }
        
        for(int i = 0; i < bombProxGrid.length; i++){
            for(int j = 0; j < bombProxGrid[0].length; j++){
                if(bombProxGrid[i][j] == 9){
                    addAdj(i, j, bombProxGrid);
                 }
            }
         }
      }
        public static void addAdj(int r, int c, int [][] bombProxGrid){
        for(int i = r - 1; i <= r + 1; i++){
         for(int j = c - 1; j <= c + 1; j++){
            if(i >= 0 && i < bombProxGrid.length &&
                 j >= 0 && j < bombProxGrid[0].length &&
                bombProxGrid[i][j] != 9){
                bombProxGrid[i][j]++;
                }
            }
         }
      }
        public static boolean move(int r, int c, int [][] bombProxGrid){
             return bombProxGrid[r][c] == 9;
        }
        
        public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
            for(int i = r - 1; i <= r + 1; i++){
            for(int j = c - 1; j <= c + 1; j++){
                if(i >= 0 && i < guessGrid.length && j >= 0 && j < guessGrid[0].length){
                    guessGrid[i][j] = bombProxGrid[i][j];
                }
            }
        }
             printGrid(guessGrid);
        }
        public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
            for(int i = 0; i < guessGrid.length; i++){
                for(int j = 0; j < guessGrid[0].length; j++){
                if(bombProxGrid[i][j] != 9 && guessGrid[i][j] == 9){
            return false;
                }
            }
        }
            return true;
        }
        public static void printGrid(int [][] grid){
            System.out.println("_________________________________________");
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
            System.out.print("| " + grid[i][j] + " | ");
        }
            System.out.println();
        }
            System.out.println("_________________________________________");
           }
            }
/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {

    public static boolean checkPrime(int num) {
        int x = 2;
        if (num < 2) {
        	return false;
        }

        while (x < num) {
            if (num % x == 0) {
                return false;
            }
            x++;
        }
        return true;
    }

    public static void printPrimes(int max) {
        int y = 2;
        while (y < max) {
            if (checkPrime(y)) {
                System.out.println(y);
            }
            y++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number and we'll print out every prime until that number: ");
        int num = input.nextInt();

        printPrimes(num);
    }
}


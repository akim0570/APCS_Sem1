/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [1000];
		int i = 0;
		int s = (int)(Math.random() * 1000); 
		while (i<arr.length){
			arr[i] = s;
			s = (int)(Math.random() * 1000);
			i++;
		}
		i = 0;
		while (i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
}

}

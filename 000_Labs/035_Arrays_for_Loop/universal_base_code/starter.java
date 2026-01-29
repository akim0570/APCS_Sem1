/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		for (int i = 0; i<1000; i++){
			int [] arr = new int [1000];
			int s = (int)(Math.random() * 1000); 
			arr[i] = s;
			s = (int)(Math.random() * 1000);
		}
		i = 0;
		while (i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
}
	
}

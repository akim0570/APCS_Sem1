/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1001];
		int i = 0;
		int s =3;
		while (i<arr.length){
			arr[i] = s;
			s = s+3;
			i++;
		}
		i = 0;
		while (i<arr.length){
			System.out.print(arr[i] + ", ");
			i++;
		}
		
		int [] arr1 = new int [1001];
		int q = 0;
		int w =1000;
		while (q<arr1.length){
			arr[q] = w; 
			w = w-1;
			q++;
		}
		q = 0; 
		while (q<arr1.length){
			System.out.print(arr[q] + ", ");
			q++;
		}
		 
	}
}



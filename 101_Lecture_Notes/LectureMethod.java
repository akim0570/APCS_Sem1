/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Number 2:");
        int num2 = sc.nextInt();
        
        add(num1, num2);
        
        int y = sqr(num1);
        System.out.println(y);
        System.out,println(sqr(num1));
        
        int z = abs(num1-num2);
        System.out.println(z);
        
        
	}
	
	public static int abs(int value){
	    if (value < 0){
	       return value * (-1);
	    } 
	    else {
	        return value;
	    }
	}
	
	public static int sqr(int a){
	    int answer = a * a;
	    return answer;
} 
	
	
	public static void add(int a, int b){
	    int sum = a + b;
	    System.out.println(sum);
	    return;
	}
}
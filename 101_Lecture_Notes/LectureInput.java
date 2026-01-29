/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double pink = 4.97;
        double milk = 5.50;
        double matcha = 6.35;
        System.out.println("🧋 Welcome to Abob! 🍓");
        System.out.println("Here is out menu: ");
        System.out.println("1.🥤 Pink Drink - $" + pink);
        System.out.println("2.🧋 Tiger Surgar Milk Tea - $" + milk );
        System.out.println("3.🍵🍓Strawberry Matcha Latte  - $" + matcha);
        System.out.println();
        
        System.out.println("What's the name of your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Pink Drinks would you like?");
        int quantity1 = sc.nextInt();
        
        System.out.println("How many Tiger Sugar Milk Teas would you like?");
        int quantity2 = sc.nextInt();
        
        
        System.out.println("How many Strawberry Matcha Lattes would you like?");
        int quantity3 = sc.nextInt();
        
        double total1 = pink * quantity1;
        double total2 = milk * quantity2;
        double total3 = matcha * quantity3;
        double all_total = total1 + total2 + total3;
        
        System.out.println();
        System.out.println("Your current total is: $" + all_total);
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = all_total *(tipPercent/100);
        
        double grand_total = tip + all_total;
        System.out.println();
        
        System.out.println("-------------------------");
        System.out.println(name + "'s Receipt: ");
        System.out.println(quantity1 + " x Pink Drink = $" + total1);
        System.out.println(quantity2 + " x Tiger Sugar Milk Tea = $" + total2);
        System.out.println(quantity3 + " x  Strawberry Matcha = $" + total3);
        System.out.println("Tip (" + tipPercent + "%) = $" + tip);
        System.out.println("-------------------------");
        System.out.println("Grand Total = " + "$" + grand_total);
        System.out.println("-------------------------");
        System.out.println("Thank you for ordering with us at Abob!");

	}
	
}

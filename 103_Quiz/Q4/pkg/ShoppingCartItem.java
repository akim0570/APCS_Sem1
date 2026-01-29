package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;

public ShoppingCartItem(){
    itemName = "Nothing";
    itemCost = 0;
    quantity = 0;
}
public ShoppingCartItem(String n, double i, int q){
    itemName = n;
    itemCost = i;
    quantity = q;
}

public String getItemName(){
    return itemName;
}
public int getQuantity(){
    return quantity;
}
public double getTotalCost(){
    return itemCost * quantity;
}

public double getTotalWithTax(){
    return itemCost * quantity * 1.12;
}
public double quantityToCostCalculator(int q){
    return q * itemCost;
}
public void cartToString(){
    System.out.println("You have" + quantity + " of" + itemName + "for $" + itemCost+ "each.");
}
}
package com.sri.Streams;
import java.util.*;  
import java.util.stream.Collectors;  
class Product7{  
    int id;  
    String name;  
    float price;  
    public Product7(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample6 {  
    public static void main(String[] args) {  
        List<Product7> Product7sList = new ArrayList<Product7>();  
        //Adding Product7s  
        Product7sList.add(new Product7(1,"HP Laptop",25000f));  
        Product7sList.add(new Product7(2,"Dell Laptop",30000f));  
        Product7sList.add(new Product7(3,"Lenevo Laptop",28000f));  
        Product7sList.add(new Product7(4,"Sony Laptop",28000f));  
        Product7sList.add(new Product7(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = Product7sList.stream()  
                        .collect(Collectors.summingDouble(Product7->Product7.price));  
        System.out.println(totalPrice3);  
          
    }  
}  
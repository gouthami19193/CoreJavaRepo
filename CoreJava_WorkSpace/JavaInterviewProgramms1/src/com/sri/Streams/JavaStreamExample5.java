package com.sri.Streams;
import java.util.*;  
class Product6{  
    int id;  
    String name;  
    float price;  
    public Product6(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample5 {  
    public static void main(String[] args) {  
        List<Product6> Product6sList = new ArrayList<Product6>();  
        //Adding Product6s  
        Product6sList.add(new Product6(1,"HP Laptop",25000f));  
        Product6sList.add(new Product6(2,"Dell Laptop",30000f));  
        Product6sList.add(new Product6(3,"Lenevo Laptop",28000f));  
        Product6sList.add(new Product6(4,"Sony Laptop",28000f));  
        Product6sList.add(new Product6(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        Float totalPrice = Product6sList.stream()  
                    .map(Product6->Product6.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        // More precise code   
        float totalPrice2 = Product6sList.stream()  
                .map(Product6->Product6.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
          
    }  
}  
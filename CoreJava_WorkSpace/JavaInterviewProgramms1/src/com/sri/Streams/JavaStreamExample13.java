package com.sri.Streams;
import java.util.*;  
class Product15{  
    int id;  
    String name;  
    float price;  
    public Product15(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample13 {  
    public static void main(String[] args) {  
        List<Product15> Product15sList = new ArrayList<Product15>();  
        //Adding Product15s  
        Product15sList.add(new Product15(1,"HP Laptop",25000f));  
        Product15sList.add(new Product15(2,"Dell Laptop",30000f));  
        Product15sList.add(new Product15(3,"Lenevo Laptop",28000f));  
        Product15sList.add(new Product15(4,"Sony Laptop",28000f));  
        Product15sList.add(new Product15(5,"Apple Laptop",90000f));  
        Product15sList.stream()  
                    .filter(p ->p.price> 30000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .forEach(System.out::println);  // iterating price  
    }  
}  
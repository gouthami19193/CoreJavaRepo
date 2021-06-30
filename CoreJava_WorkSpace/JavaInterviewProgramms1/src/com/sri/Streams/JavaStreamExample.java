package com.sri.Streams;
import java.util.*;  
class Product16{  
    int id;  
    String name;  
    float price;  
    public Product16(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product16> Product16sList = new ArrayList<Product16>();  
        //Adding Product16s  
        Product16sList.add(new Product16(1,"HP Laptop",25000f));  
        Product16sList.add(new Product16(2,"Dell Laptop",30000f));  
        Product16sList.add(new Product16(3,"Lenevo Laptop",28000f));  
        Product16sList.add(new Product16(4,"Sony Laptop",28000f));  
        Product16sList.add(new Product16(5,"Apple Laptop",90000f));  
        Product16sList.stream()  
                    .filter(p ->p.price> 30000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .forEach(System.out::println);  // iterating price  
    }  
}  
package com.sri.Streams;
import java.util.*;  
class Product4{  
    int id;  
    String name;  
    float price;  
    public Product4(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample4 {  
    public static void main(String[] args) {  
        List<Product4> Product4sList = new ArrayList<Product4>();  
        //Adding Product4s  
        Product4sList.add(new Product4(1,"HP Laptop",25000f));  
        Product4sList.add(new Product4(2,"Dell Laptop",30000f));  
        Product4sList.add(new Product4(3,"Lenevo Laptop",28000f));  
        Product4sList.add(new Product4(4,"Sony Laptop",28000f));  
        Product4sList.add(new Product4(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        Product4sList.stream()  
                             .filter(Product4 -> Product4.price == 30000)  
                             .forEach(Product4 -> System.out.println(Product4.name));    
    }  
}  
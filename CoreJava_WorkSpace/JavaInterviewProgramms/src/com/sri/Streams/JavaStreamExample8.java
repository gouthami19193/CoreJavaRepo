package com.sri.Streams;
import java.util.*;  
class Product9{  
    int id;  
    String name;  
    float price;  
    public Product9(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample8 {  
    public static void main(String[] args) {  
        List<Product9> Product9sList = new ArrayList<Product9>();  
        //Adding Product9s  
        Product9sList.add(new Product9(1,"HP Laptop",25000f));  
        Product9sList.add(new Product9(2,"Dell Laptop",30000f));  
        Product9sList.add(new Product9(3,"Lenevo Laptop",28000f));  
        Product9sList.add(new Product9(4,"Sony Laptop",28000f));  
        Product9sList.add(new Product9(5,"Apple Laptop",90000f));  
        // count number of Product9s based on the filter  
        long count = Product9sList.stream()  
                    .filter(Product9->Product9.price<30000)  
                    .count();  
        System.out.println(count);  
    }  
}  
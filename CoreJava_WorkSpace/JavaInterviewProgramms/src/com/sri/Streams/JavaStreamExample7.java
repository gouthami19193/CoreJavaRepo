package com.sri.Streams;
import java.util.*;  
class Product8{  
    int id;  
    String name;  
    float price;  
    public Product8(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample7 {  
    public static void main(String[] args) {  
        List<Product8> Product8sList = new ArrayList<Product8>();  
        //Adding Product8s  
        Product8sList.add(new Product8(1,"HP Laptop",25000f));  
        Product8sList.add(new Product8(2,"Dell Laptop",30000f));  
        Product8sList.add(new Product8(3,"Lenevo Laptop",28000f));  
        Product8sList.add(new Product8(4,"Sony Laptop",28000f));  
        Product8sList.add(new Product8(5,"Apple Laptop",90000f));  
        // max() method to get max Product8 price   
        Product8 Product8A = Product8sList.stream()  
                        .max((Product81, Product82)->   
                        Product81.price > Product82.price ? 1: -1).get();  
          
        System.out.println(Product8A.price);  
        // min() method to get min Product8 price  
        Product8 Product8B = Product8sList.stream()  
                .max((Product81, Product82)->   
                Product81.price < Product82.price ? 1: -1).get();  
        System.out.println(Product8B.price);  
          
    }  
}  
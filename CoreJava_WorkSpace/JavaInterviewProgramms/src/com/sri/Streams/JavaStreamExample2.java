package com.sri.Streams;
import java.util.*;  
import java.util.stream.Collectors;  
class Product2{  
    int id;  
    String name;  
    float price;  
    public Product2(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample2 {  
    public static void main(String[] args) {  
        List<Product2> Product2sList = new ArrayList<Product2>();  
        //Adding Product2s  
        Product2sList.add(new Product2(1,"HP Laptop",25000f));  
        Product2sList.add(new Product2(2,"Dell Laptop",30000f));  
        Product2sList.add(new Product2(3,"Lenevo Laptop",28000f));  
        Product2sList.add(new Product2(4,"Sony Laptop",28000f));  
        Product2sList.add(new Product2(5,"Apple Laptop",90000f));  
        List<Float> Product2PriceList2 =Product2sList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(Product2PriceList2);  
    }  
}  
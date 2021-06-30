package com.sri.collections;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  
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
public class CollectorsExample3 {  
    public static void main(String[] args) {  
        List<Product2> Product2sList = new ArrayList<Product2>();  
        //Adding Product2s  
        Product2sList.add(new Product2(1,"HP Laptop",25000f));  
        Product2sList.add(new Product2(2,"Dell Laptop",30000f));  
        Product2sList.add(new Product2(3,"Lenevo Laptop",28000f));  
        Product2sList.add(new Product2(4,"Sony Laptop",28000f));  
        Product2sList.add(new Product2(5,"Apple Laptop",90000f));  
        Double average = Product2sList.stream()  
                         .collect(Collectors.averagingDouble(p->p.price));  
        System.out.println("Average price is: "+average);  
    }  
}  
package com.sri.collections;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  
class Product1{  
    int id;  
    String name;  
    float price;  
      
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class CollectorsExample2 {  
    public static void main(String[] args) {  
        List<Product1> Product1sList = new ArrayList<Product1>();  
        //Adding Product1s  
        Product1sList.add(new Product1(1,"HP Laptop",25000f));  
        Product1sList.add(new Product1(2,"Dell Laptop",30000f));  
        Product1sList.add(new Product1(3,"Lenevo Laptop",28000f));  
        Product1sList.add(new Product1(4,"Sony Laptop",28000f));  
        Product1sList.add(new Product1(5,"Apple Laptop",90000f));  
        Double sumPrices =   
                Product1sList.stream()  
                            .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
        System.out.println("Sum of prices: "+sumPrices);  
        Integer sumId =   
                Product1sList.stream().collect(Collectors.summingInt(x->x.id));  
        System.out.println("Sum of id's: "+sumId);  
    }  
}  
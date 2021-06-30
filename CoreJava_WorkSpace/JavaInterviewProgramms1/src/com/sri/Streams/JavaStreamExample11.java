package com.sri.Streams;
import java.util.*;  
import java.util.stream.Collectors;  
  
class Product13{  
    int id;  
    String name;  
    float price;  
      
    public Product13(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class JavaStreamExample11 {  
  
    public static void main(String[] args) {  
          
        List<Product13> Product13sList = new ArrayList<Product13>();  
          
        //Adding Product13s  
        Product13sList.add(new Product13(1,"HP Laptop",25000f));  
        Product13sList.add(new Product13(2,"Dell Laptop",30000f));  
        Product13sList.add(new Product13(3,"Lenevo Laptop",28000f));  
        Product13sList.add(new Product13(4,"Sony Laptop",28000f));  
        Product13sList.add(new Product13(5,"Apple Laptop",90000f));  
          
        List<Float> Product13PriceList =   
                Product13sList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product13::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(Product13PriceList);  
    }  
}  
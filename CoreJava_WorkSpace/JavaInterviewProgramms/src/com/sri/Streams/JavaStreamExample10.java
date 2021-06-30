package com.sri.Streams;
import java.util.*;  
import java.util.stream.Collectors;  
class Product12{  
    int id;  
    String name;  
    float price;  
    public Product12(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  
public class JavaStreamExample10 {  
    public static void main(String[] args) {  
        List<Product12> Product12sList = new ArrayList<Product12>();  
  
        //Adding Product12s  
        Product12sList.add(new Product12(1,"HP Laptop",25000f));  
        Product12sList.add(new Product12(2,"Dell Laptop",30000f));  
        Product12sList.add(new Product12(3,"Lenevo Laptop",28000f));  
        Product12sList.add(new Product12(4,"Sony Laptop",28000f));  
        Product12sList.add(new Product12(5,"Apple Laptop",90000f));  
          
        // Converting Product12 List into a Map  
        Map<Integer,String> Product12PriceMap =   
            Product12sList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(Product12PriceMap);  
    }  
}  
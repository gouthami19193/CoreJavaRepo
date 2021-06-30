package com.sri.Streams;
import java.util.*;  
import java.util.stream.Collectors;  
class Product11{  
    int id;  
    String name;  
    float price;  
    public Product11(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  
public class JavaStreamExample9 {  
    public static void main(String[] args) {  
        List<Product11> Product11sList = new ArrayList<Product11>();  
  
        //Adding Product11s  
        Product11sList.add(new Product11(1,"HP Laptop",25000f));  
        Product11sList.add(new Product11(2,"Dell Laptop",30000f));  
        Product11sList.add(new Product11(3,"Lenevo Laptop",28000f));  
        Product11sList.add(new Product11(4,"Sony Laptop",28000f));  
        Product11sList.add(new Product11(5,"Apple Laptop",90000f));  
          
        // Converting Product11 List into Set  
        Set<Float> Product11PriceList =   
            Product11sList.stream()  
            .filter(Product11->Product11.price < 30000)   // filter Product11 on the base of price  
            .map(Product11->Product11.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(Product11PriceList);  
    }  
}  
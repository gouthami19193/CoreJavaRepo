package com.sri.impQuestions;

import java.util.HashMap;
import java.util.Map;
/*
 * Hashcode method compares hashcode values and Equals method compares content 
 */
public class HashcodeAndEqualsDiffClass {
	

	public static void main(String[] args) {
     
		Employee emp=new Employee(1l);
		Employee emp1=new Employee(1l);
		
		Integer i=new Integer(1);
		Integer i1=new Integer(1);
		
		Map< Employee, String> map=new HashMap<Employee, String>();
		map.put(emp, "sri");
		map.put(emp1, "sri");
		System.out.println(map.size());//size is 2 if u dont add hashcode and equals methods in Employee class
		//If u add hashcode and equals method in Employee class then size will be 1
		
		Map<Integer, String> map1=new HashMap<>();
		map1.put(i, "sri");
		map1.put(i1, "sri");
		
		System.out.println(map1.size());
		

	}

}

class Employee{
	Long id;
	public Employee(Long id){
		
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

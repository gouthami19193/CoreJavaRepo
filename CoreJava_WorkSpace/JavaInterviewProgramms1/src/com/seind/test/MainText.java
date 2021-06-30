package com.seind.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class MainText {

	public ArrayList<Customer> getAllCustomers(boolean status) throws FileNotFoundException {

		File file = new File("C:\\Users\\segge\\OneDrive\\Desktop\\Customer.txt");
		Scanner sc = new Scanner(file);

		List<Customer> customerlist = new ArrayList<Customer>();

		while (sc.hasNextLine()) {
			String[] tokens = sc.nextLine().split("~");

			Customer customer = new Customer();

			customer.setCustid(tokens[0]);
			customer.setName(tokens[1]);
			customer.setMobileno(tokens[2]);
			customer.setEmailid(tokens[3]);
			customer.setDob(tokens[4]);
			customer.setAdderes(tokens[5]);
			customer.setCardnum(tokens[6]);
			customer.setCvv(tokens[7]);
			customer.setExdate(tokens[8]);
			customer.setBalance(tokens[9]);

			customerlist.add(customer);

		}

		if (status == true) {

			for (Customer customer : customerlist) {
				System.out.println("CustId=" + customer.getCustid());
				System.out.println("CustName=" + customer.getName());
				System.out.println("Mobile=" + customer.getMobileno());
				System.out.println("emailid=" + customer.getEmailid());
				System.out.println("dob=" + customer.getDob());
				System.out.println("adderes=" + customer.getAdderes());
				System.out.println("cardnum=" + customer.getCardnum());
				System.out.println("cvv=" + customer.getCvv());
				System.out.println("exdate=" + customer.getExdate());
				System.out.println("balance=" + customer.getBalance());

				System.out.println("====================================================");
			}

		}
		return (ArrayList<Customer>) customerlist;

	}  // method closed
	
     public void getHighestBalance(ArrayList<Customer> clist,int salaryStatus){
    	 int count=0;
         String highestBalance="";
         
    	 TreeSet<String> ts=new TreeSet<>();
    	 
    	 //store all balance values into treeset for sorting purpose
    	 for (Customer cust : clist) {
    		 ts.add(cust.getBalance());
		}
    	// get highest balance value from treeset
    	 for (String string : ts) {
    		 count++;
    		 if(count==ts.size()+1-salaryStatus){
    			 highestBalance=string;
    		 }
		}
    	 
    	 //print customer who is having highest balance
    	 for (Customer cust : clist) {
    		 if (highestBalance.equalsIgnoreCase(cust.getBalance())) {
    			 System.out.println("CustId=" + cust.getCustid());
 				System.out.println("CustName=" + cust.getName());
 				System.out.println("Mobile=" + cust.getMobileno());
 				System.out.println("emailid=" + cust.getEmailid());
 				System.out.println("dob=" + cust.getDob());
 				System.out.println("adderes=" + cust.getAdderes());
 				System.out.println("cardnum=" + cust.getCardnum());
 				System.out.println("cvv=" + cust.getCvv());
 				System.out.println("exdate=" + cust.getExdate());
 				System.out.println("balance=" + cust.getBalance());
 				System.out.println("====================================================");
				
			}
		}
    	
     }
	public static void main(String[] args) throws FileNotFoundException {
		MainText mt = new MainText();
		//mt.getAllCustomers(true);
		ArrayList<Customer> clist=mt.getAllCustomers(false);
		mt.getHighestBalance(clist,1);    //if you want first highest salary give 1
		                                  //if you want second highest salary give 2
		                                 //if you want third highest salary give 3
		                               //if you want fourth highest salary give 4
		                                //if you want fifth highest salary give 5
		
	}
}

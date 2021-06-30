package gouthami;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoJdbc2 {
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			Statement st=con.createStatement();
			int x=st.executeUpdate("insert into employee values (5,'junnu','m',4000)");
					
						System.out.println("the no of rows effected : "+x);
						
					
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

package gouthami;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatment {  
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
					pst.setInt(1, 5);
			pst.setString(2, "ammu");
			pst.setString(3,"c");
			pst.setInt(4, 5000);
			int i=pst.executeUpdate();
			System.out.println(i+" records inserted");
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

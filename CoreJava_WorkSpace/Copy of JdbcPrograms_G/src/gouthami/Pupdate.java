package gouthami;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Pupdate {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			
			PreparedStatement pst=con.prepareStatement("update employee set ename=? where eno=?");
					pst.setString(1,"srikanth");
					pst.setInt(2,101);
			int i=pst.executeUpdate();
			System.out.println(i+" records inserted");
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
			

}

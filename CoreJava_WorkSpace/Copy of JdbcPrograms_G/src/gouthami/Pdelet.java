package gouthami;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Pdelet {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			
			PreparedStatement pst=con.prepareStatement("delete from employee where eno=?");
			
					pst.setInt(1,4);
					
			int i=pst.executeUpdate();
			System.out.println(i+" records deleted");
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}

}
}

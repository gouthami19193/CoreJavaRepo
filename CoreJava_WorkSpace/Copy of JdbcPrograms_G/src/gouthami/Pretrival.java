package gouthami;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pretrival {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			
			PreparedStatement pst=con.prepareStatement("select * from employee");
		
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}

}
}

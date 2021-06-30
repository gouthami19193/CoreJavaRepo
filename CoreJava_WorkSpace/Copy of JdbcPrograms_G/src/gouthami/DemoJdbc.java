package gouthami;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DemoJdbc {
	public static void main(String args[]){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			
	}
		
		con.close();
	}
catch(Exception e){
	System.out.println(e);
}
}
}

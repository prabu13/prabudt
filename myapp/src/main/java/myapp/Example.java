package myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {
	
	public static void main(String aar[]){
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM TAB");
			if(rs.next()){
				System.out.println(rs.getString("id"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}

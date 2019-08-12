package database;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc 
{
	public static void main(String[] args) throws Exception
	{
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://ATMECSINLT-083\\SQLEXPRESS;database=Employee;integratedSecurity=true;";
		Connection con = DriverManager.getConnection(connectionUrl);
		System.out.println("connected");
		stmt = con.createStatement();
		ResultSet rs1 = stmt.executeQuery("select * from List1");
		while (rs1.next())
			System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getInt(3));
		con.close();
	}
}
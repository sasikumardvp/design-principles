package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database
{
public void data(int first,int second ,String value,int output)
{
	try {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","BEAST");
		PreparedStatement pp=con.prepareStatement("insert into Resultdata values(?,?,?,?) ");
		pp.setInt(1,first);
		pp.setInt(2,second);
		pp.setString(3,value);
		pp.setInt(4, output);
		pp.executeUpdate();
		pp.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}
}

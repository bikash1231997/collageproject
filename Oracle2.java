import java.sql.*;
import java.io.*;
public class Oracle
{
 public static void main(String args[]) throws ClassNotFoundException,SQLException,IOException
 {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
	
	
		DataInputStream dis=new DataInputStream(System.in);

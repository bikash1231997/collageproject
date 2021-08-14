import java.sql.*;
import java.io.*;
public class Oracle
{
 public static void main(String args[]) throws ClassNotFoundException,SQLException,IOException
 {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
	
	
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("1. Insert");
		System.out.println("2. UPdate ");
		System.out.println("3. Delete");
		System.out.println("4. View One Record present or not ");
		System.out.println("5. View All Record ");
		System.out.println("6. View one Selected Record ");
		
		
		System.out.print("Select Number  you want to Operation : ");
		int i=Integer.parseInt(dis.readLine());
		
		if(i==1)
		{
		System.out.print("Enter Employee ID ");
		int id=Integer.parseInt(dis.readLine());
		System.out.print("Enter Employee Name ");
		String name=dis.readLine();
		System.out.print("Enter Employee Job ");
		String job=dis.readLine();
		System.out.println("Enter Employee Salary ");
		double sal=Double.parseDouble(dis.readLine());
		//these variable data set into the query.
		//then pass the query to the DB.
		String s="insert into employee10 values("+id+",'"+name+"','"+job+"',"+sal+")";
		Statement st=con.createStatement();
		int k=st.executeUpdate(s);
		if(k>=1)
		System.out.println("Record Inserted...");
		else
		System.out.println("Record NOT Inserted...");
		
		st.close();
		con.close();
		}
		
		
		else if(i==2)
		{
		System.out.print("Enter Employee ID  You want to Update");
		int id=Integer.parseInt(dis.readLine());
		System.out.println("Enter Employee Salary to be Updated ");
		double sal=Double.parseDouble(dis.readLine());
		String s=("update employee10 set sal = "+sal+" where id ="+id);
		Statement st=con.createStatement();
		int k=st.executeUpdate(s);
		if(k>=1)
		System.out.println("Record Updated");
		else
		System.out.println("Record NOT Updated...");
		
		st.close();
		con.close();
		}
		
		
		else if(i==3)
		{
		System.out.print("Enter Employee ID which you want to delete: ");
		int id=Integer.parseInt(dis.readLine());
		String s=" delete from employee10 where id ="+id;
		Statement st=con.createStatement();
		int k=st.executeUpdate(s);
		if(k>=1)
		System.out.println("Record Deleted...");
		else
		System.out.println("Record NOT Deleted...");
		
		st.close();
		con.close();
		}
		else if(i==4)
		{
		System.out.print("Enter Employee ID which you want to search ");
		int id=Integer.parseInt(dis.readLine());
		String s="select * from employee10 where id ="+id;
		Statement st=con.createStatement();
		int k=st.executeUpdate(s);
		if(k>=1)
		System.out.println("Record Found...");
		else
		System.out.println("Record NOT Found...");
		
		st.close();
		con.close();
		}
		
		
		else if(i==5)
		{
			
		String s="select * from employee10";
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(s);
		
		while(rs.next()==true)
		{
		int id =rs.getInt("id");
		String name=rs.getString("name");
		String job=rs.getString("job");
		double sal=rs.getDouble("sal");
		
		System.out.println(id+" "+name+" "+job+" "+sal);
		}
		
		rs.close();
		st.close();
		con.close();
		}
		
		else if(i==6)
		{
			
		System.out.print("Enter Employee ID which you want to search ");
		int id=Integer.parseInt(dis.readLine());
		
		String s="select * from employee10 where id ="+id;
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(s);
		
		if(rs !=null)
		{
			if(rs.next()==true)
			{
			int vid =rs.getInt("id");
			String name=rs.getString("name");
			String job=rs.getString("job");
			double sal=rs.getDouble("sal");
			
			System.out.println(vid+" "+name+" "+job+" "+sal);
			}
			else{}
		}
		else
		{
			System.out.println("Record not found");
		}
		
		rs.close();
		st.close();
		con.close();
		}
		
 }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.sql.*;

class school extends JFrame implements ActionListener
{
	
	JButton b1,b2,b3,b4,b5;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15;
	JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9;
	JLabel w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13,w14,lday,lmonth,lyear;
	JList l1,l2,l3,l4;
	//JMenu menu, submenu;  
    //JMenuItem i1, i2, i3, i4, i5;  
	JProgressBar jb;    
	int i=0,num=0;  
		
			
	school()
	{
			
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(10,1));
		
		
		/*JMenuBar mb=new JMenuBar();  
        menu=new JMenu("Menu");  
        submenu=new JMenu("Sub Menu");  
        i1=new JMenuItem("Item 1");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5");  
        menu.add(i1); menu.add(i2); menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu);  
		add(mb);
			*/	
		Font f= new Font("Arial",Font.PLAIN,15);
		Font g= new Font("Arial",Font.BOLD,15);
		
		w1=new JLabel("Enter the Sl.no");
		w2=new JLabel("Enter the Admission No.");
        w3=new JLabel("Enter the Admission date");
		w4=new JLabel("Enter the School No.");
        w5=new JLabel("Enter the Class");
		w6=new JLabel("Enter the Student Name");
        w7=new JLabel("Enter the Fathers Name");
		w8=new JLabel("Enter the Mothers Name");
        w9=new JLabel("Enter the Guardian Name");
		w10=new JLabel("Enter the D.O.B"); 	
		w11=new JLabel("Enter the Category");
        w12=new JLabel("Enter the Cast");
		w13=new JLabel("Enter the Religion");
        w14=new JLabel("Enter the Sex");
		
		lday=new JLabel("Day");
		lmonth=new JLabel("Month");
		lyear= new JLabel("Year");
  
		
		
		String[] a1={"Nalco","L.D.P","Other"};
		String[] a2={"S.C","S.T","O.B.C","General"};
		String[] a3={"Hindu","Muslim","Cristian"};
		String[] a4={"Male","Female","Other"};
		
		String[] month={"Jan","Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String year[]={"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003","2004", "2005","2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
		

		
				
		JComboBox cmonth =new JComboBox(month);
		JComboBox cday =new JComboBox(day);
	    JComboBox cyear =new JComboBox(year);
  
			
		
		w1.setFont(f);	w2.setFont(f);
		w3.setFont(f);	w4.setFont(f);
		w5.setFont(f);	w6.setFont(f);
		w7.setFont(f);	w8.setFont(f);
		w9.setFont(f);	w10.setFont(f);
		w11.setFont(f);	w12.setFont(f);
		w13.setFont(f);	w14.setFont(f);
		
		f1=new JTextField(10); 	f2=new JTextField(10);
		f3=new JTextField(10);	f4=new JTextField(10);
		f5=new JTextField(10);	f6=new JTextField(10);
		f7=new JTextField(10);	f8=new JTextField(10);
		f9=new JTextField(10);	
		 
		
		l1=new JList(a1);	l2=new JList(a2);
		l3=new JList(a3);	l4=new JList(a4);
				
		
			
		f1.setFont(f);	f2.setFont(f);
		f3.setFont(f);	f4.setFont(f);
		f5.setFont(f);	f6.setFont(f);
		f7.setFont(f);	f8.setFont(f);
		f9.setFont(f);	
		
		
		b1=new JButton("Clear");
		b2=new JButton("Save");
		b3=new JButton("Update");
		b4=new JButton("Delete");
		b5=new JButton("Show");
		
		b1.setFont(g);
		b2.setFont(g);
		b3.setFont(g);
		b4.setFont(g);
		b5.setFont(g);
		
		
				
		p1=new JPanel(); p2=new JPanel();
		p3=new JPanel(); p4=new JPanel();
		p5=new JPanel(); p6=new JPanel();
		p7=new JPanel(); p8=new JPanel();
		p9=new JPanel(); p10=new JPanel();
		p11=new JPanel(); p12=new JPanel();
		p13=new JPanel(); p14=new JPanel();
		p15=new JPanel(); 
			
		p1.add(w1); p1.add(f1);
		p2.add(w2); p2.add(f2);
		p3.add(w3); p3.add(f3);
		p4.add(w4); p4.add(f4);
		p5.add(w5); p5.add(f5);
		p6.add(w6); p6.add(f6);
		p7.add(w7); p7.add(f7);
		p8.add(w8); p8.add(f8);
		p9.add(w9); p9.add(f9);
		
		p10.add(w10);  p10.add(lday); p10.add(cday); 
		p10.add(lmonth); p10.add(cmonth); 
		p10.add(lyear); p10.add(cyear);
		
		p11.add(w11); p11.add(l1);
		p12.add(w12); p12.add(l2);
		p13.add(w13); p13.add(l3);
		p14.add(w14); p14.add(l4);
		p15.add(b1); p15.add(b2);
		p15.add(b3); p15.add(b4);
		p15.add(b5);
		
				
		
		add(p1);add(p2);add(p3);
		add(p4);add(p5);add(p6);
		add(p7);add(p8);add(p9);
		add(p10);add(p11);add(p12);
		add(p13);add(p14);add(p15);
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	f1.addKeyListener(new KeyAdapter()
	{
 
		public void keyPressed(KeyEvent E1)
		{
			String value = f1.getText();
				int l = value.length();
				if (E1.getKeyChar() >= '0' && E1.getKeyChar() <= '9')
				{
				   f1.setEditable(true);
				   w1.setText("Enter Sl.no");
				} 
				else
				{
				   //f1.setEditable(false);
				   w1.setText("* Enter only numeric digits(0-9)");
				}
		
			
		}
	});
	
	
	f2.addKeyListener(new KeyAdapter()
	{
 
		public void keyPressed(KeyEvent E2)
		{
			String value = f2.getText();
				int l = value.length();
				if (E2.getKeyChar() >= '0' && E2.getKeyChar() <= '9')
				{
				   f2.setEditable(true);
				   w2.setText("Enter Admission No.");
				} 
				else
				{
				   ///f2.setEditable(false);
				   w1.setText("* Enter only numeric digits(0-9)");
				}
		
			
		}
	});
	
	
	
	
	
	f4.addKeyListener(new KeyAdapter()
	{
 
		public void keyPressed(KeyEvent E4)
		{
			String value = f4.getText();
				int l = value.length();
				if (E4.getKeyChar() >= '0' && E4.getKeyChar() <= '9')
				{
				   f4.setEditable(true);
				   w4.setText("Enter School No.");
				} 
				else
				{
				  // f4.setEditable(false);
				   w4.setText("* Enter only numeric digits(0-9)");
				}
		
			
		}
	});
	
	
	f3.addKeyListener(new KeyAdapter()
	{
 
		public void keyPressed(KeyEvent E3)
		{
			String value = f3.getText();
				int l = value.length();
				if (E3.getKeyChar() >= '0' && E3.getKeyChar() <= '9' || E3.getKeyChar() == '.' || E3.getKeyChar() == '/' || E3.getKeyChar() =='-' )
				{
				   f3.setEditable(true);
				   w3.setText("Admission date");
				} 
				else
				{
				  // f3.setEditable(false);
				   w3.setText("* Enter only numeric digits(0-9)");
				}
		
			
		}
	});
	
	
     
		 
	}
	public void clear()
	{
		f1.setText(" "); f2.setText(" ");
		f3.setText(" "); f4.setText(" ");
		f5.setText(" "); f6.setText(" ");
		f7.setText(" "); f8.setText(" ");
		f9.setText(" ");
	}
		
	
	public void actionPerformed(ActionEvent E)
	{
		if (E.getSource()==b1)
		{
			clear();
		}
		
		else if (E.getSource()==b2)
		{
			JFrame s= new JFrame();
			JOptionPane.showMessageDialog(s,"Your file is Saved");
			
		}
		
		else if (E.getSource()==b3)
		{
			int input = JOptionPane.showConfirmDialog(null, "Do you like to update?");
			// 0=yes, 1=no, 2=cancel
			System.out.println(input); 
			
			if(input==0)
			{
				System.out.println("enter the student id which is to updated");
			}
			
			//JFrame s= new JFrame();
 
			/*int name1 =JOptionPane.showInputDialog(s,"Enter the Student id"); 
			if(name1=JOptionPane.YES_OPTION)
			{			

			JOptionPane.showMessageDialog(s,"Your file is Update");
			}
			*/
		}
		
		else if (E.getSource()==b4)
		{
			JFrame s= new JFrame();
			JOptionPane.showMessageDialog(s,"Your file is Delete");
			
		}
		
		else if (E.getSource()==b5)
		{
			JFrame s= new JFrame();
			JOptionPane.showMessageDialog(s,"Press OK to Show the Data");
			
		}
		
		
	}

	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			if(con==null)
			{
				System.out.println("Notconnected");
			}
			else
			{
				System.out.println("connected");
			}
			con.close();
			
			new school();
		} 

}
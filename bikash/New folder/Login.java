import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class Login extends JFrame implements ActionListener
 { 
  	JLabel l1,l2,l3;
  	JTextField t1;
  	JPasswordField t2;
   	 JButton login;
	JComboBox cb;
	Connection con;
	PreparedStatement stat;
  	 public Login(String title)
  	 {
    	super(title);
    	Container content= getContentPane();
   	 content.setBackground(Color.red);
    	setLayout(null);
	JLabel ban = new JLabel("User Login");
	ban.setFont(new Font("Times New Roman" ,Font.BOLD + Font.ITALIC,32));
	ban.setForeground(Color.blue);
	//ban.setBackground()
	//ban.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    	JPanel p1,p2,p3,p4,p5;
	
   	 p1=new JPanel();
   	p1.setBackground(Color.pink);
   	 p1.setLayout(new FlowLayout());
    	l1=new JLabel("User Category   ");
	String[] cmb ={"SENIOR SUPERENTEND","SENIOR ASSISTANT","CASHIER"};
   	cb = new JComboBox(cmb);
   	p1.add(l1);
    	p1.add(cb);
    
    	p2=new JPanel();
    	p2.setBackground(Color.pink);
   	 p2.setLayout(new FlowLayout());
    	l2=new JLabel("User Name       ");
    	t1=new JTextField(15);
   	 p2.add(l2);
   	 p2.add(t1);

	 p3=new JPanel();
    	p3.setBackground(Color.pink);
    	p3.setLayout(new FlowLayout());
    	l3=new JLabel("Password         ");
    	t2=new JPasswordField(15);
   	 p3.add(l3);
    	p3.add(t2);
    
    
   	 p4=new JPanel();
   	p4.setBackground(Color.pink);
    	p4.setLayout(new FlowLayout());
    	login=new JButton(" LOGIN ",new ImageIcon("pictures/click.gif"));
     	p4.add(login);

    
    	p5=new JPanel();
	p5.setBackground(Color.pink);
    	p5.setLayout(new GridLayout(3,1));
	p5.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0,0,0)),BorderFactory.createEmptyBorder(10,10,10,10)));
    	p5.add(p1);
	p5.add(p2);
    	p5.add(p3);
    		
	ban.setBounds(160,30,200,70);
	  p5.setBounds(80,125,320,130);
	 p4.setBounds(150,270,170,60);
	 add(p5); 
	 add(p4);
	add(ban);
	login.addActionListener(this);
	t1.requestFocus();
	try
		   {
			// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// con = DriverManager.getConnection("jdbc:odbc:KSEB","sa","");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
		
		   }catch(Exception e)
			{
				System.out.println(e);
			}
  
  
    addWindowListener(new WindowAdapter()
      {
       public void windowClosing(WindowEvent ex)
         	{
 	  System.exit(0);
  	}
      });

}
	
	public void actionPerformed(ActionEvent e)
	{
		Toolkit tool= Toolkit.getDefaultToolkit();
		Dimension d= tool.getScreenSize();
		String mod=""+cb.getSelectedItem();
		if(e.getSource()==login)
		{
			try{
				stat= con.prepareStatement("select * from login where username=? and password=? and mode=?");
				
				stat.setString(1,t1.getText().trim());
   				stat.setString(2,t2.getText().trim());
				stat.setString(3, mod);
				ResultSet rs = stat.executeQuery();
				if(rs.next())
				{
					System.out.println("inside user login");
				
					int selected = cb.getSelectedIndex();
					System.out.println("index -> "+selected);
					switch(selected)
					{

						
						case 0:
							System.out.println("Inside 1");
							SeniorManagerLogon ss = new SeniorManagerLogon("Administration");
                     						ss.setSize((int)d.getWidth(),(int)d.getHeight());
							//ss.setOpaque(true);
						
							ss.setBackground(Color.white);
							ss.setVisible(true);
							this.setVisible(false);
							
							break; 
						case 1:
							System.out.println("Inside 2");
							SeniorManagerLogonsa sa = new SeniorManagerLogonsa("Administration -1");
							System.out.println("Inside 21");
							sa.setSize((int)d.getWidth(),(int)d.getHeight());
					System.out.println("Inside 22");
							sa.setBackground(Color.white);
							System.out.println("Inside 23");
							sa.setVisible(true);
							System.out.println("Inside 24");
							this.setVisible(false);
							System.out.println("Inside 25");
							break; 
						case 2:

							System.out.println("Inside 3");
							SeniorManagerLogonca sca = new SeniorManagerLogonca("Administration -2");
							
							sca.setSize((int)d.getWidth(),(int)d.getHeight());
							//ss.setOpaque(true);
						
							sca.setBackground(Color.white);
							sca.setVisible(true);
							this.setVisible(false);
							break; 
					}
					
				}else
			 	{
					JOptionPane.showMessageDialog(this,"Invalid Category/User !","Error",JOptionPane.WARNING_MESSAGE); 	
					t1.setText("");
					t1.requestFocus();
				}
			}catch(Exception ex)
			{
				System.out.println(ex);

			}

		}
	}
	
	public static void main(String arg[])
  	{
    		Login log=new Login("User Logon");
       
     		log.setSize(500,400);
		log.setLocation(300,180);
     		log.setVisible(true);
  	}
}

     
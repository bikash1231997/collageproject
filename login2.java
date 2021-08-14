/* import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login2 extends JFrame implements ActionListener 
{
	
   JPanel p1;
   JLabel user, password_l, message;
   JTextField UserName;
   JPasswordField password;
   JButton b1,b2;
   login2() 
   {
	   
	   Font f= new Font("Arial",Font.PLAIN,15);
	   Font g= new Font("Arial",Font.BOLD,15);
	   
	   user = new JLabel("User Name :");
	   password_l = new JLabel("Password :");
	   
	   user.setFont(f);
	   password_l.setFont(f);
	   
	   UserName = new JTextField(10);
	   password = new JPasswordField(5);
     
	   UserName.setFont(f);
	   password.setFont(f);
	   
	   b1=new JButton("submit");
	   b2=new JButton("cancel");
      
	   b1.setFont(g);
	   b2.setFont(g);
		
      p1 = new JPanel();
	  
      p1.add(user, BorderLayout.NORTH);
      p1.add(UserName, BorderLayout.NORTH);
      p1.add(password_l,BorderLayout.CENTER);
      p1.add(password,BorderLayout.CENTER);
	  
      message = new JLabel();
      p1.add(message);
	  
      p1.add(b1,BorderLayout.SOUTH);
	  p1.add(b2,BorderLayout.SOUTH);
	  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
      b1.addActionListener(this);
	  b2.addActionListener(this);
	  
      add(p1, BorderLayout.CENTER);
	  
      setTitle("Please Login Here !");
	  
      setSize(500,500);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent E)
   { 
	if (E.getSource()==b1)
	{
      String userName1 = UserName.getText();
      String password1 = password.getText();
      if (userName1.equals("admin") && password1.equals("admin")) 
	  {
		message.setText(" Thank you for Login ");
		
		
		JFrame s= new JFrame();
		JOptionPane.showMessageDialog(s,"Thank you for Login");
		// school s=new school();
		// s.setVisible(true);
      }
	  else 
	  {
         message.setText(" Invalid username please try again ");
      }
	}
	else if (E.getSource()==b2)
	{
		System.exit(0);
	}
   }
   
   
   public static void main(String[] args)
   {
      new login2();
   }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

class HomePage extends JFrame implements ActionListener
{
	JMenuBar menubar;
	JMenuItem home,about,signin,signup,contact,developer,rules;	
	JLabel logo,logo1,logo2,logo3;
	JMenuItem login,newreg,home1,aboutus,contactus,developerus;
	Container c;
	HomePage()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);

		ImageIcon i=new ImageIcon("cricketlogo1.jpg");

		logo=new JLabel(i);
		logo.setBounds(0,0,1400,200);
		c.add(logo);

				
		

		menubar=new JMenuBar();
		menubar.setBackground(Color.RED);
		menubar.setBounds(0,200,1400,60);
		c.add(menubar);
		
		ImageIcon i1=new ImageIcon("cricket5.jpg");

		logo1=new JLabel(i1);
		logo1.setBounds(0,460,1400,240);
		c.add(logo1);

		logo2=new JLabel("      SUN-SKY ");
		logo2.setBounds(400,260,600,80);
		logo2.setForeground(Color.RED);
		logo2.setBackground(Color.GREEN);
		logo2.setFont(new Font("Cooper",Font.BOLD,70));
		c.add(logo2);
		
		logo3=new JLabel("  PLAY WITH CRICKET TOURNAMENT SOFTWARE ");
		logo3.setBounds(50,340,1300,100);
		logo3.setForeground(Color.BLUE);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,50));
		c.add(logo3);
	
	
		home=new JMenu("          Home     ");
		home.setBackground(Color.YELLOW);
		home.setForeground(Color.WHITE);
		home.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(home);



		home1=new JMenuItem("                home            ");
		home1.setBackground(Color.BLACK);
		home1.addActionListener(this);
		home1.setForeground(Color.WHITE);
		home1.setFont(new Font("Cooper",Font.BOLD,16));
		home.add(home1);

		about=new JMenu("          About Us     ");
		about.setBackground(Color.YELLOW);
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(about);

		aboutus=new JMenuItem("                aboutus            ");
		aboutus.setBackground(Color.BLACK);
		aboutus.addActionListener(this);
		aboutus.setForeground(Color.WHITE);
		aboutus.setFont(new Font("Cooper",Font.BOLD,16));
		about.add(aboutus);

		
		signin=new JMenu("         Sign In    ");
		signin.setBackground(Color.YELLOW);
		signin.setForeground(Color.WHITE);
		signin.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(signin);

		signup=new JMenu("          Sign Up     ");
		signup.setBackground(Color.YELLOW);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		signup.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(signup);

		contact=new JMenu("          Tools     ");
		contact.setBackground(Color.YELLOW);
		contact.setForeground(Color.WHITE);
		contact.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(contact);

		contactus=new JMenuItem("                Tools           ");
		contactus.setBackground(Color.BLACK);
		contactus.addActionListener(this);
		contactus.setForeground(Color.WHITE);
		contactus.setFont(new Font("Cooper",Font.BOLD,16));
		contact.add(contactus);


		rules=new JMenu("           Developer    ");
		rules.setBackground(Color.YELLOW);
		rules.setForeground(Color.WHITE);
		rules.setFont(new Font("Cooper",Font.BOLD,26));
		menubar.add(rules);

		developerus=new JMenuItem("                developer            ");
		developerus.setBackground(Color.BLACK);
		developerus.addActionListener(this);
		developerus.setForeground(Color.WHITE);
		developerus.setFont(new Font("Cooper",Font.BOLD,16));
		rules.add(developerus);
                
		
		login=new JMenuItem("                Login            ");
		login.setBackground(Color.BLACK);
		login.addActionListener(this);
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Cooper",Font.BOLD,16));
		signin.add(login);

	        newreg=new JMenuItem("       New Registration      ");
		newreg.setBackground(Color.BLACK);
		newreg.addActionListener(this);
		newreg.setForeground(Color.WHITE);
		newreg.setFont(new Font("Cooper",Font.BOLD,16));
		signup.add(newreg);
		
		
		setTitle("new Frame");
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setLocationRelativeTo(null);

		

	}
	
	public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==newreg)
			{
			 
				 new TournamentRegistration();
		
			}
			if(e.getSource()==login)
			{
			 
				new TournamentLogin();
		
			}
			if(e.getSource()==aboutus)
			{
			 
				new AboutUs();
		
			}

			if(e.getSource()==contactus)
			{
			 
				new Contact();
		
			}
			if(e.getSource()==developerus)
			{
			 
				new Developer();
		
			}
			
			
			
		
	
		}
	
	public static void main(String[] args)
	{
		
		new HomePage();
	
	
	
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Developer extends JFrame
{
	JLabel logo3,logo;
	Container c;
	Developer()
	{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);

		
		ImageIcon i=new ImageIcon("deve.jpg");

		logo=new JLabel(i);
		logo.setBounds(300,0,400,200);
		c.add(logo);

		logo3=new JLabel("SUN-SKY TOURNAMENT SOFTWARE IS DESKTOP APLLICATION TO BUILD WITH JAVA LANGUAGE");
		logo3.setBounds(30,280,1300,30);
		logo3.setForeground(Color.blue);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(logo3);

		logo3=new JLabel("     TO MANAGE THE ALL DETAILS OF TURNAMENT,MATCH,PLAYER,AND LIVE SCORING");
		logo3.setBounds(30,310,1300,40);
		logo3.setForeground(Color.blue);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(logo3);

		logo3=new JLabel("AKASH KUMAR(COMPUTER SCIENCE(2016-20))");
		logo3.setBounds(220,200,900,30);
		logo3.setForeground(Color.red);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(logo3);


		logo3=new JLabel("(FET-GKV HARIDWAR)");
		logo3.setBounds(370,230,500,40);
		logo3.setForeground(Color.red);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(logo3);

		setTitle("new Frame");
		setVisible(true);
		setSize(600,300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setLocationRelativeTo(null);
	}	


		public static void main(String[] args)
	{
		
		new Developer();
	
	
	
	}
}



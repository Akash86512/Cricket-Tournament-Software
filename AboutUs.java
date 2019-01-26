
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class AboutUs extends JFrame 
{
	 JTextField tournamentname;
	JButton submit;
	JLabel logo,logo1,logo2,logo3;
	Container c;
	AboutUs()
	{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		
		ImageIcon i=new ImageIcon("cricketlogo1.jpg");

		logo=new JLabel(i);
		logo.setBounds(0,0,1400,200);
		c.add(logo);
		
		ImageIcon i1=new ImageIcon("cricket5.jpg");

		logo1=new JLabel(i1);
		logo1.setBounds(0,430,1400,240);
		c.add(logo1);

		logo2=new JLabel("      SUN-SKY ");
		logo2.setBounds(400,200,600,80);
		logo2.setForeground(Color.RED);
		logo2.setBackground(Color.GREEN);
		logo2.setFont(new Font("Cooper",Font.BOLD,70));
		c.add(logo2);
		
		logo3=new JLabel("  PLAY WITH CRICKET TOURNAMENT SOFTWARE ");
		logo3.setBounds(50,255,1300,100);
		logo3.setForeground(Color.BLUE);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,50));
		c.add(logo3);


		logo3=new JLabel("sunsky Tournament Software is Desktop Application for play cricket Tournament.feature of this software ");
		logo3.setBounds(20,340,1400,30);
		logo3.setForeground(Color.black);
		
		logo3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(logo3);

		logo3=new JLabel("management the all details of Tournament,Match,Player and Live Scoring");
		logo3.setBounds(200,375,1000,40);
		logo3.setForeground(Color.black);
		
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
		
		new AboutUs();
	
	
	
	}
}



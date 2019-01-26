import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;

class MatchDetails extends JFrame  implements ActionListener
{
	Container c;
	JLabel matchid1,playerid1;
	
		
	JButton showmatchid,showplayerid,newmatch;
	JTable t;
	JTextField matchid,playerid;
	 MatchDetails()
	{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		

		
		matchid1=new JLabel(" ENTER MARCH ID ");
		matchid1.setBounds(50,50,200,30);
		matchid1.setForeground(Color.BLUE);
		matchid1.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(matchid1);
		
		playerid1=new JLabel(" ENTER PLAYER ID ");
		playerid1.setBounds(50,100,200,30);
		playerid1.setForeground(Color.BLUE);
		playerid1.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(playerid1);
		

                matchid=new JTextField();
		matchid.setBounds(260,50,250,30);
		matchid.setForeground(Color.BLUE);
		matchid.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(matchid);

		playerid=new JTextField();
		playerid.setBounds(260,100,250,30);
		playerid.setForeground(Color.BLUE);
		playerid.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(playerid);

		
		
		showmatchid=new JButton("show match details");
		showmatchid.setBounds(520,50,300,30);
		showmatchid.setForeground(Color.WHITE);
		showmatchid.addActionListener(this);
		showmatchid.setFont(new Font("Red",Font.BOLD,20));
		showmatchid.setBackground(Color.GREEN);
		c.add(showmatchid);


		showplayerid=new JButton("show player details");
		showplayerid.setBounds(520,100,300,30);
		showplayerid.setForeground(Color.WHITE);
		showplayerid.addActionListener(this);
		showplayerid.setFont(new Font("Red",Font.BOLD,20));
		showplayerid.setBackground(Color.GREEN);
		c.add(showplayerid);

		newmatch=new JButton(" NEW MATCH STARTE click me");
		newmatch.setBounds(300,150,400,30);
		newmatch.setForeground(Color.WHITE);
		newmatch.addActionListener(this);
		newmatch.setFont(new Font("Red",Font.BOLD,20));
		newmatch.setBackground(Color.GREEN);
		c.add(newmatch);

       		
		
		setTitle(" my first name");
		setSize(900,250);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setVisible(true);
		

	}

		public void actionPerformed(ActionEvent e)
		{

			
			if(e.getSource()==showmatchid)
			{

			new TableDemobyoneplayer(matchid.getText().trim());
			}

			if(e.getSource()==showplayerid)
			{
				
				 
			  new TableDemo(" ");

			}
			if(e.getSource()==newmatch)
			{
				new TeamEntery();
			
			}
	
		}
	public static void main(String args[])
	{
	
	 new  MatchDetails();
	
	}

}





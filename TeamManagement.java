import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;  
import java.time.LocalTime; 
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

public class TeamManagement extends JFrame implements ActionListener
{
		


		JComboBox team1,team2;
		JComboBox day,month,year;
		String et,et1;
		String eid1="P1000";
		JLabel vs,vs1,vs2,vs3,date;
		int old_id,old_id1;
		String formatDateTime;
	
		 static String new_id1;
		 String new_id;
		JButton submit,start;
		JTextField team1player1,team1player2,team1player3,team1player4,team1player5,team1player6,team1player7,team1player8,team1player9,team1player10,team1player11;
		
		Container c;
		static int i=1;
		TeamManagement()
		{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);








		    		
		String eid="M1000";


		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from MatchInfo");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					 eid=rs.getString(1);
					//System.out.println(eid);
					
				}
				if(eid.equals("M1000"))
				{
					old_id=Integer.parseInt(eid.substring(1,5));
					new_id="M"+String.valueOf(++old_id);
					System.out.println(new_id);
				}
				else
				{
				       old_id=Integer.parseInt(eid.substring(1,5));
					new_id="M"+String.valueOf(++old_id);
					System.out.println(new_id);
				}

				


				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		



		   


		     



		vs3=new JLabel("PLAYER ID  ");
		vs3.setBounds(20,120,250,30);
	 	vs3.setForeground(Color.BLUE);
		vs3.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(vs3);

		vs1=new JLabel("MATCH ID    "+new_id);
		vs1.setBounds(10,10,250,40);
	 	vs1.setForeground(Color.BLUE);
		vs1.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(vs1);

			


		vs2=new JLabel("ENTER PLAYER NAME");
		vs2.setBounds(150,90,300,25);
	 	vs2.setForeground(Color.BLUE);
		vs2.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(vs2);	

		 LocalDateTime datetime1 = LocalDateTime.now();  
             	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    		formatDateTime = datetime1.format(format); 
		vs=new JLabel("DATE  "+formatDateTime);
		vs.setBounds(20,60,400,25);
	 	vs.setForeground(Color.BLUE);
		vs.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(vs);
		
		 


		 team1= new JComboBox();
		 team1.setBounds(270,10,250,40);
		 team1.setForeground(Color.BLUE);
		 team1.setFont(new Font("Cooper",Font.BOLD,20));
		 team1.addItem("choose First team");
		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Teamentry");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					 
					 
					team1.addItem(rs.getString(2));
					
					
				}
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}


		  c.add(team1);
	
				




		team1player1=new JTextField();
		team1player1.setBounds(280,120,250,30);
		team1player1.setForeground(Color.BLUE);
		team1player1.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team1player1);

		


		submit=new JButton("ADD");
		submit.setBounds(50,160,100,30);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Red",Font.BOLD,25));
		submit.setBackground(Color.GREEN);
		c.add(submit);
		
		start=new JButton("started");
		start.setBounds(160,160,140,30);
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		start.setFont(new Font("Red",Font.BOLD,25));
		start.setBackground(Color.GREEN);
		c.add(start);
		
		
		setTitle("new Frame");
		setVisible(true);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(600,300);
		setLocationRelativeTo(null);
		

		}

		public void actionPerformed(ActionEvent e)
		{
			String teamname1=team1.getSelectedItem().toString();
			String teamname2;

			
			if(i<=11)
			{
			if(e.getSource()==submit)
			{
			et=team1player1.getText();
			team1player1.setText("");


			  String eid1="P1000";


		String eid="P1000";


		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from MatchInfo");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					 eid1=rs.getString(3);
					//System.out.println(eid);
					
				}
				if(eid1.equals("P1000"))
				{
					old_id1=Integer.parseInt(eid1.substring(1,5));
					new_id1="P"+String.valueOf(++old_id1);
					System.out.println(new_id1);
				}
				else
				{
				       old_id1=Integer.parseInt(eid1.substring(1,5));
					new_id1="P"+String.valueOf(++old_id1);
					System.out.println(new_id1);
					vs3.setText("PLAYER ID  "+new_id1);
				}

				


				con.close();
			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}		
		



			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into Matchinfo values(?,?,?,?,?)");
				ps.setString(1,new_id);
				ps.setString(2,teamname1);
				ps.setString(3,new_id1);
				ps.setString(4,et);
				ps.setString(5,formatDateTime);
				
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
			

			

			
			
			
			

			
			}
			
			
			}
			i++;
			
			
			if(i==12)
			{
				JOptionPane.showMessageDialog(this,"player list full");
			}
				
			
		
			if(i>=13&&i<=23)
			
			{
			teamname2=team1.getSelectedItem().toString();		

			if(e.getSource()==submit)
			{
			et1=team1player1.getText();
			team1player1.setText("");
			
		 
		 String eid1="P1000";


		try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					 eid1=rs.getString(3);
					//System.out.println(eid);
					
				}
				if(eid1.equals("P1000"))
				{
					old_id1=Integer.parseInt(eid1.substring(1,5));
					new_id1="P"+String.valueOf(++old_id1);
					System.out.println(new_id1);
					vs3.setText("PLAYER ID  "+new_id1);
				}
				else
				{
				       old_id1=Integer.parseInt(eid1.substring(1,5));
					new_id1="P"+String.valueOf(++old_id1);
					System.out.println(new_id1);
					vs3.setText("PLAYER ID  "+new_id1);

				}

				


				con.close();
			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}		
		

			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into Matchinfo values(?,?,?,?,?)");
				ps.setString(1,new_id);
				ps.setString(2,teamname2);
				ps.setString(3,new_id1);
				ps.setString(4,et1);
				ps.setString(5,formatDateTime);
				
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}


		//playerid .....
			
			
			
			}
		}
		
			if(i==24)
			{
				JOptionPane.showMessageDialog(this,"player list full ");
			}

			if(i>=25)
			{
			
			if(e.getSource()==start)
			{
			
				new FirstMatch(new_id);
			}
			
			
			}
			
				
		}

		public static void main(String args[])
		{
 			new TeamManagement();
		}

}
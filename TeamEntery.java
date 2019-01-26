import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;

 public class TeamEntery extends JFrame implements ActionListener
{
	Container c;
	JTextField team1,team2,team3,team4,team5,team6,team7,team8,tid;
	JLabel reg;
	JComboBox tournamentid1;
	JButton submit,startmatch;
	
	TeamEntery()
	{
	 	c=this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(Color.ORANGE);
		
		reg=new JLabel("TournamentID ");
		reg.setBounds(20,10,180,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
		
		
		  tournamentid1= new JComboBox();
		 tournamentid1.setBounds(200,10,250,30);
		 tournamentid1.addItem("SELECT TOURNAMENT_ID");
			//String[] eid=new String[];
		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Registration");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					 
					 
					tournamentid1.addItem(rs.getString(1));
					
					
				}
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		

		c.add( tournamentid1);
		
		
		

		reg=new JLabel("Enter Team Name ");
		reg.setBounds(40,60,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		/*reg=new JLabel("1.");
		reg.setBounds(20,95,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);*/
	
		/*reg=new JLabel("2.");
		reg.setBounds(20,130,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("3.");
		reg.setBounds(20,165,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("4.");
		reg.setBounds(20,200,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("5.");
		reg.setBounds(20,235,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("6.");
		reg.setBounds(20,270,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("7.");
		reg.setBounds(20,305,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("8.");
		reg.setBounds(20,340,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);*/

		team1=new JTextField();
		team1.setBounds(50,95,350,30);
		team1.setForeground(Color.BLUE);
		team1.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team1);

		/*team2=new JTextField();
		team2.setBounds(50,130,250,30);
		team2.setForeground(Color.BLUE);
		team2.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team2);


		team3=new JTextField();
		team3.setBounds(50,165,250,30);
		team3.setForeground(Color.BLUE);
		team3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team3);

		team4=new JTextField();
		team4.setBounds(50,200,250,30);
		team4.setForeground(Color.BLUE);
		team4.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team4);

		team5=new JTextField();
		team5.setBounds(50,235,250,30);
		team5.setForeground(Color.BLUE);
		team5.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team5);

		team6=new JTextField();
		team6.setBounds(50,270,250,30);
		team6.setForeground(Color.BLUE);
		team6.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team6);

		team7=new JTextField();
		team7.setBounds(50,305,250,30);
		team7.setForeground(Color.BLUE);
		team7.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team7);
                
		team8=new JTextField();
		team8.setBounds(50,340,250,30);
		team8.setForeground(Color.BLUE);
		team8.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team8);*/
		
		submit=new JButton("ADD");
		submit.setBounds(40,140,150,40);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Red",Font.BOLD,35));
		submit.setBackground(Color.GREEN);
		c.add(submit);

		startmatch=new JButton("started match");
		startmatch.setBounds(200,140,300,40);
		startmatch.setForeground(Color.WHITE);
		startmatch.addActionListener(this);
		startmatch.setFont(new Font("Red",Font.BOLD,35));
		startmatch.setBackground(Color.GREEN);
		c.add(startmatch);
		
		setTitle("new Frame");
		setVisible(true);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(550,250);
		setLocationRelativeTo(null);
	
	}

	public void actionPerformed(ActionEvent e)
		{
	
		
	
	    String tornaid=tournamentid1.getSelectedItem().toString();
	    String  temaname=team1.getText();

			
			if(e.getSource()==submit)
			{

			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into teamentry values(?,?)");
				ps.setString(1,"M1001");
				ps.setString(2,temaname);
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"enter "+temaname,"inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}	
			
			team1.setText("");
			
			}
		
			
			if(e.getSource()==startmatch)
			{

			new TeamManagement();
			}

		}
	
	
	public static void main(String[] args)
	{
		new TeamEntery();
	
	}
	
}
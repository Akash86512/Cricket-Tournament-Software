import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;

 public class TournamentRegistration extends JFrame implements ActionListener
{
	JLabel reg; 
	JButton submit,a,start;
	int old_id;
	
	
	String new_id;
	JComboBox day,month,year;
	JTextField tournamentname,username,password,confpassword,noofteam,noofover,price,gift;
	JTextField team1,team2,team3,team4,team5,team6,team7,team8;
	Container c;

	
	     TournamentRegistration()
		{
	
		 c=this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(Color.ORANGE);
		
	
	
	
	
			String eid="E1000";


			try
			
				{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from registration");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					 eid=rs.getString(1);
					//System.out.println(eid);
					
				}
				if(eid.equals("E1000"))
				{
					old_id=Integer.parseInt(eid.substring(1,5));
					new_id="E"+String.valueOf(++old_id);
					System.out.println(new_id);
				}
				else
				{
				       old_id=Integer.parseInt(eid.substring(1,5));
					new_id="E"+String.valueOf(++old_id);
					System.out.println(new_id);
				}



				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		




		
		reg=new JLabel("PLAY WITH TOURNAMENT REGISTRATION FORM ");
		reg.setBounds(50,10,800,40);
		reg.setForeground(Color.BLUE);
		reg.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(reg);

		reg=new JLabel("Tournament NAME ");
		reg.setBounds(70,60,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
		
		reg=new JLabel("Tournament_Userid");
		reg.setBounds(70,95,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("Password ");
		reg.setBounds(70,130,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("Conf_password");
		reg.setBounds(70,165,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("No-Of-Team ");
		reg.setBounds(70,200,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("No-Of-Over ");
		reg.setBounds(70,235,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("Wining Price ");
		reg.setBounds(70,270,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("Wining Gifts ");
		reg.setBounds(70,305,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("Date ");
		reg.setBounds(70,340,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		/*reg=new JLabel("Enetr Team Name ");
		reg.setBounds(590,60,250,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("1.");
		reg.setBounds(590,95,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("2.");
		reg.setBounds(590,130,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("3.");
		reg.setBounds(590,165,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("4.");
		reg.setBounds(590,200,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("5.");
		reg.setBounds(590,235,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("6.");
		reg.setBounds(590,270,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);

		reg=new JLabel("7.");
		reg.setBounds(590,305,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);
	
		reg=new JLabel("8.");
		reg.setBounds(590,340,30,30);
		reg.setForeground(Color.BLACK);
		reg.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(reg);*/

		
		tournamentname=new JTextField();
		tournamentname.setBounds(330,60,250,30);
		tournamentname.setForeground(Color.BLUE);
		tournamentname.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(tournamentname);

		username=new JTextField(""+new_id);
		username.setBounds(330,95,250,30);
		username.setForeground(Color.BLUE);
		username.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(username);

		password=new JTextField();
		password.setBounds(330,130,250,30);
		password.setForeground(Color.BLUE);
		password.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(password);


		confpassword=new JTextField();
		confpassword.setBounds(330,165,250,30);
		confpassword.setForeground(Color.BLUE);
		confpassword.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(confpassword);

		noofteam=new JTextField();
		noofteam.setBounds(330,200,250,30);
		noofteam.setForeground(Color.BLUE);
		noofteam.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(noofteam);

		noofover=new JTextField();
		noofover.setBounds(330,235,250,30);
		noofover.setForeground(Color.BLUE);
		noofover.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(noofover);

		price=new JTextField();
		price.setBounds(330,270,250,30);
		price.setForeground(Color.BLUE);
		price.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(price);

		gift=new JTextField();
		gift.setBounds(330,305,250,30);
		gift.setForeground(Color.BLUE);
		gift.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(gift);
	


		/*team1=new JTextField();
		team1.setBounds(630,95,250,30);
		team1.setForeground(Color.BLUE);
		team1.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team1);

		team2=new JTextField();
		team2.setBounds(630,130,250,30);
		team2.setForeground(Color.BLUE);
		team2.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team2);


		team3=new JTextField();
		team3.setBounds(630,165,250,30);
		team3.setForeground(Color.BLUE);
		team3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team3);

		team4=new JTextField();
		team4.setBounds(630,200,250,30);
		team4.setForeground(Color.BLUE);
		team4.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team4);

		team5=new JTextField();
		team5.setBounds(630,235,250,30);
		team5.setForeground(Color.BLUE);
		team5.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team5);

		team6=new JTextField();
		team6.setBounds(630,270,250,30);
		team6.setForeground(Color.BLUE);
		team6.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team6);

		team7=new JTextField();
		team7.setBounds(630,305,250,30);
		team7.setForeground(Color.BLUE);
		team7.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team7);
                
		team8=new JTextField();
		team8.setBounds(630,340,250,30);
		team8.setForeground(Color.BLUE);
		team8.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(team8);*/
	
		submit=new JButton("submit");
		submit.setBounds(280,400,200,40);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Red",Font.BOLD,35));
		submit.setBackground(Color.GREEN);
		c.add(submit);

		
		
		

		 day= new JComboBox();
		day.setBounds(330,340,70,30);
		day.addItem("day");
		for(int i=1;i<=31;i++)
		{
			day.addItem(""+i);
		}
		c.add(day);
		
		 month= new JComboBox();
		month.setBounds(410,340,70,30);
		month.addItem("month");
		for(int i=1;i<=12;i++)
		{
			month.addItem(""+i);
		}
		c.add(month);

		year= new JComboBox();
		year.setBounds(490,340,70,30);
		year.addItem("year");
		for(int i=1975;i<=2060;i++)
		{
			year.addItem(""+i);
		}
		c.add(year);
		
	
		
					
		setTitle("new Frame");
		setVisible(true);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(800,500);
		setLocationRelativeTo(null);


		}
	      
		
		public void actionPerformed(ActionEvent e)
		{
	
			if(e.getSource()==submit)
			{
					
			String dob=day.getSelectedItem().toString()+"/"+month.getSelectedItem().toString()+"/"+year.getSelectedItem().toString();
			if(tournamentname.getText().equals("")||password.getText().equals("")||confpassword.getText().equals("")||noofteam.getText().equals("")||noofover.getText().equals("")||price.getText().equals("")||gift.getText().equals(""))
			{
				
				JOptionPane.showMessageDialog(this,"fill all requirement");
			}else
			{
					
					
					
					String tournamentname1=tournamentname.getText();
					String password1=password.getText();
					String con_pass=confpassword.getText();
					String no_of_team=noofteam.getText();
					String no_of_over=noofover.getText();
					String wingift=gift.getText();

					String winprice=price.getText();
				
			
			
					
	
		
				
			
		
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into Registration values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1,new_id);
				ps.setString(2,tournamentname1);
				ps.setString(3,password1);
				ps.setString(4,con_pass);
				ps.setString(5,no_of_team);
				ps.setString(6,no_of_over);
				ps.setString(7,winprice);
				ps.setString(8,wingift);
				ps.setString(9,dob);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"succsesfull registration","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}

			new TeamEntery();
		}
			
		

		
			

		}
		
	        }
			


	public static void main(String args[])
	{
		new TournamentRegistration();
	
	}
	
}
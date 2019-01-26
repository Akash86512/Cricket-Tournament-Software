import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;

class TournamentLogin extends JFrame implements ActionListener
{
	JLabel login;
	JButton submit;
	JTextField username,password;
	Container c;

	TournamentLogin()
	{
	         c=this.getContentPane();
		 c.setLayout(null);
		 c.setBackground(Color.ORANGE);
	
		login=new JLabel(" USER LOGIN FORM ");
		login.setBounds(50,10,250,30);
		login.setForeground(Color.BLACK);
		login.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(login);
	

		login=new JLabel("USER-NMAE");
		login.setBounds(20,50,130,20);
		login.setForeground(Color.BLACK);
		login.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(login);

		login=new JLabel("PASSWORD");
		login.setBounds(20,80,130,20);
		login.setForeground(Color.BLACK);
		login.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(login);


		username=new JTextField();
		username.setBounds(140,50,200,20);
		username.setForeground(Color.BLUE);
		username.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(username);
	
		password=new JTextField();
		password.setBounds(140,80,200,20);
		password.setForeground(Color.BLUE);
		password.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(password);	
	

		submit=new JButton("submit");
		submit.setBounds(100,110,150,30);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		submit.setFont(new Font("Red",Font.BOLD,25));
		submit.setBackground(Color.GREEN);
		c.add(submit);

		setTitle("new Frame");
		setVisible(true);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(400,200);
		setLocationRelativeTo(null);
	
	}


	public void actionPerformed(ActionEvent e)
		{
	

			
			if(e.getSource()==submit)
			{

				new MatchDetails();
			}


		}
	public static void main(String[] args)
	{
	 new TournamentLogin();
	
	}
	
}


 
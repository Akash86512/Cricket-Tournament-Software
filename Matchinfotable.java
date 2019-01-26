import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Matchinfotable extends JFrame
{
	Container c;
	JTable t;
	Matchinfotable (String msg)
	{
		super(msg);
		c=this.getContentPane();
		c.setLayout(new BorderLayout());
		String heading[]={"Match_ID","Team_Name","Player_Id","Player_Name","Match_Date"};
		
		String data[][]=new String[900][5];
		int r=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("select * from Matchinfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				data[r][0]=rs.getString(1);
				data[r][1]=rs.getString(2);
				data[r][2]=rs.getString(3);
				data[r][3]=rs.getString(4);
				data[r][4]=rs.getString(5);
				
				r++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t=new JTable(data,heading);
		t.setBackground(Color.white);
		t.setForeground(Color.black);
		
		t.setFont(new Font("Red",Font.BOLD,15));	
		JScrollPane jsp=new JScrollPane(t);
		c.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
		c.add(jsp,BorderLayout.CENTER);
		setSize(850,650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new Matchinfotable ("Table Frame");
	}
}
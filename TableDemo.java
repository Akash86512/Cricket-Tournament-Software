import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class TableDemo extends JFrame
{
	Container c;
	JTable t;
	TableDemo(String msg)
	{
		super(msg);
		c=this.getContentPane();
		c.setLayout(new BorderLayout());
		String heading[]={"PLAYER_ID","PLAYER_NAME"," BATING_RUN","BALL","BATING_SIX"," BATING_FOUR","BOLLING_RUN","BOLLING_OVER","BOLLING_WICKET","MATCH_DATE"};
		
		String data[][]=new String[200][10];
		int r=0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("select * from player_id_details");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				data[r][0]=rs.getString(1);
				data[r][1]=rs.getString(2);
				data[r][2]=rs.getString(3);
				data[r][3]=rs.getString(4);
				data[r][4]=rs.getString(5);
				data[r][5]=rs.getString(6);
				data[r][6]=rs.getString(7);
				data[r][7]=rs.getString(8);
				data[r][8]=rs.getString(9);
				data[r][9]=rs.getString(10);
				
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
		new TableDemo("Table Frame");
	}
}
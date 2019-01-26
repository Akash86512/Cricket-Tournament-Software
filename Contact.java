
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Contact extends JFrame
{
	Container c;
	 Contact()
	{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);

		
		


		setTitle("new Frame");
		setVisible(true);
		setSize(600,300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setLocationRelativeTo(null);
	}	


		public static void main(String[] args)
	{
		
		new  Contact();
	
	
	
	}
}



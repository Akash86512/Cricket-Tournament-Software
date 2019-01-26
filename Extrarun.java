
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;
public class Extrarun extends JFrame implements ActionListener
{
		JButton btzero,btone,bttwo,btthree,btfour,btfive,btsix;
		Container c;
		int zero;
		JLabel print; 
		Extrarun()
		{
	
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
	
	

		
		btzero=new JButton(" 7 ");
		btzero.setBounds(20,20,100,40);
		btzero.setForeground(Color.WHITE);
		btzero.addActionListener(this);
		btzero.setFont(new Font("Red",Font.BOLD,35));
		btzero.setBackground(Color.GREEN);
		c.add(btzero);
	
		btone=new JButton(" 1 ");
		btone.setBounds(130,20,100,40);
		btone.setForeground(Color.WHITE);
		btone.addActionListener(this);
		btone.setFont(new Font("Red",Font.BOLD,35));
		btone.setBackground(Color.GREEN);
		c.add(btone);
		
		bttwo=new JButton(" 2 ");
		bttwo.setBounds(240,20,100,40);
		bttwo.setForeground(Color.WHITE);
		bttwo.addActionListener(this);
		bttwo.setFont(new Font("Red",Font.BOLD,35));
		bttwo.setBackground(Color.GREEN);
		c.add(bttwo);
	
		btthree=new JButton(" 3 ");
		btthree.setBounds(20,70,100,40);
		btthree.setForeground(Color.WHITE);
		btthree.addActionListener(this);
		btthree.setFont(new Font("Red",Font.BOLD,35));
		btthree.setBackground(Color.GREEN);
		c.add(btthree);

		btfour=new JButton(" 4 ");
		btfour.setBounds(130,70,100,40);
		btfour.setForeground(Color.WHITE);
		btfour.addActionListener(this);
		btfour.setFont(new Font("Red",Font.BOLD,35));
		btfour.setBackground(Color.GREEN);
		c.add(btfour);
		
		btfive=new JButton(" 5 ");
		btfive.setBounds(240,70,100,40);
		btfive.setForeground(Color.WHITE);
		btfive.addActionListener(this);
		btfive.setFont(new Font("Red",Font.BOLD,35));
		btfive.setBackground(Color.GREEN);
		c.add(btfive);

		btsix=new JButton(" 6 ");
		btsix.setBounds(350,70,100,40);
		btsix.setForeground(Color.WHITE);
		btsix.addActionListener(this);
		btsix.setFont(new Font("Red",Font.BOLD,35));
		btsix.setBackground(Color.GREEN);
		c.add(btsix);
		
		print=new JLabel();
		print.setBounds(350,20,100,40);
		print.setForeground(Color.WHITE);
		print.setFont(new Font("Red",Font.BOLD,35));
		print.setBackground(Color.GREEN);
		c.add(print);



		setTitle("new Frame");
		setVisible(true);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setSize(550,250);
		setLocationRelativeTo(null);
	
	
		}
	
	
		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==btzero)
			{
				zero=7;
				print.setText(""+zero);
				FirstMatch.cheakvalue(zero);
				dispose();
			
			}
	
			if(e.getSource()==btone)
			{
				zero=1;
				print.setText(""+zero);
				//new FirstMatch("",zero);
				FirstMatch.cheakvalue(zero);
				dispose();
			}
			
			if(e.getSource()==bttwo)
			{
				zero=2;
				print.setText(""+zero);
				FirstMatch.cheakvalue(zero);
				dispose();
			}
			
			if(e.getSource()==btthree)
			{
				zero=3;
				print.setText(""+zero);
				FirstMatch.cheakvalue(zero);
				dispose();
				
				
			
			}
			if(e.getSource()==btfour)
			{
			zero=4;
			print.setText(""+zero);
			FirstMatch.cheakvalue(zero);
			
				dispose();
			
			}
			if(e.getSource()==btfive)
			{
			zero=5;
			print.setText(""+zero);
			FirstMatch.cheakvalue(zero);
				dispose();
			}
			if(e.getSource()==btsix)
			{
			zero=6;
			print.setText(""+zero);
			FirstMatch.cheakvalue(zero);
				dispose();
			}
		
	
		}
	/*public static void main(String[] args)
	{
	
		new Extrarun();
	
	
	}*/
	
	
} 
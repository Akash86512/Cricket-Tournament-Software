import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;  
import java.time.LocalTime; 
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

public class FirstMatch extends JFrame implements ActionListener
{
	
	JLabel ining,date,time,vs,firstteam,secondteam,run,wicket,over,runrate,batsix,batfour,batrun,batball,batsrate,batout;
	JTextField  btplay1,btplay2,btplay3,btplay4,btplay5,btplay6,btplay7,btplay8,btplay9,btplay10,btplay11;
	JLabel batingteamname,bollingteamname;
	JLabel ballsix,ballfour,ballrun,ballover,ballwicket;
	JTextField ballpaly1,ballpaly2,ballpaly3,ballpaly4,ballpaly5,ballpaly6,ballpaly7,vs111;
	JLabel setrun,setball;
	JTextField player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11;
	JTextField player111,player21,player31,player41,player51,player61,player71;
	JButton btzero,btone,bttwo,btthree,btfour,btfive,btsix,out,runout,refres,finish,rotete,no,wide,bye,freehit;
	JTextArea disrun,diswicket,disover,disrunrate;
	JTextArea sixplayer1,sixplayer2,sixplayer3,sixplayer4,sixplayer5,sixplayer6,sixplayer7,sixplayer8,sixplayer9,sixplayer10,sixplayer11;
	JTextArea fourplayer1,fourplayer2,fourplayer3,fourplayer4,fourplayer5,fourplayer6,fourplayer7,fourplayer8,fourplayer9,fourplayer10,fourplayer11;	
	JTextArea runplayer1,runplayer2,runplayer3,runplayer4,runplayer5,runplayer6,runplayer7,runplayer8,runplayer9,runplayer10,runplayer11;
	JTextArea ballplayer1,ballplayer2,ballplayer3,ballplayer4,ballplayer5,ballplayer6,ballplayer7,ballplayer8,ballplayer9,ballplayer10,ballplayer11;
	JButton srateplayer1,srateplayer2,srateplayer3,srateplayer4,srateplayer5,srateplayer6,srateplayer7,srateplayer8,srateplayer9,srateplayer10,srateplayer11;
	JTextArea sixboller1,sixboller2,sixboller3,sixboller4,sixboller5,sixboller6,sixboller7;
	JTextArea fourboller1,fourboller2,fourboller3,fourboller4,fourboller5,fourboller6,fourboller7;
	JTextArea runboller1,runboller2,runboller3,runboller4,runboller5,runboller6,runboller7;
	JTextArea overboller1,overboller2,overboller3,overboller4,overboller5,overboller6,overboller7;
	JTextArea wicketboller1,wicketboller2,wicketboller3,wicketboller4,wicketboller5,wicketboller6,wicketboller7;
	JButton wicketboller11,wicketboller21,wicketboller31,wicketboller41,wicketboller51,wicketboller61,wicketboller71;
	JComboBox strike,nonstrike,chooseboller;
	Container c;
	int j=1,k=1,l=1,m=1,playrun1=0,playrun2=0,playrun3=0,playrun4=0,playrun5=0,playrun6=0,playrun7=0,playrun8=0,playrun9=0,playrun10=0,playrun11=0;
	String s1;
	int mainwicket=0,bollerwicket1=0,bollerwicket2=0,bollerwicket3=0,bollerwicket4=0,bollerwicket5=0,bollerwicket6=0,bollerwicket7=0;
	int dk;
	String matchid;
	static int extrarun;
	String formatDateTime;
	int batingsix1=0,batingsix2=0,batingsix3=0,batingsix4=0,batingsix5=0,batingsix6=0,batingsix7=0,batingsix8=0,batingsix9=0,batingsix10=0,batingsix11=0;
	int bollingsix1=0,bollingsix2=0,bollingsix3=0,bollingsix4=0,bollingsix5=0,bollingsix6=0,bollingsix7=0;

	int batingfour1=0,batingfour2=0,batingfour3=0,batingfour4=0,batingfour5=0,batingfour6=0,batingfour7=0,batingfour8=0,batingfour9=0,batingfour10=0,batingfour11=0;
	int bollingfour1=0,bollingfour2=0,bollingfour3=0,bollingfour4=0,bollingfour5=0,bollingfour6=0,bollingfour7=0;
	int sk1=0,sk2=0,sk3=0,sk4=0,sk5=0,sk6=0,sk7=0,sk8=0,sk9=0,sk10=0,sk11=0;
	int pk1=0,pk2=0,pk3=0,pk4=0,pk5=0,pk6=0,pk7=0;
	String s2;


	int ballrunboller1=0,ballrunboller2=0,ballrunboller3=0,ballrunboller4=0,ballrunboller5=0,ballrunboller6=0,ballrunboller7=0;
	int ballboller1=0,ballboller2=0,ballboller3=0,ballboller4=0,ballboller5=0,ballboller6=0,ballboller7=0; 



	int ballrunplayer1=0, ballrunplayer2=0, ballrunplayer3=0, ballrunplayer4=0, ballrunplayer5=0, ballrunplayer6=0, ballrunplayer7=0, ballrunplayer8=0, ballrunplayer9=0, ballrunplayer10=0, ballrunplayer11=0;
	int mainover=0,mainball=0,mainrun=0;		


	int bolleronerun1=0,bolleronerun2=0,bolleronerun3=0,bolleronerun4=0,bolleronerun5=0,bolleronerun6=0,bolleronerun7=0;

	

	
	FirstMatch(String newid)
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		repaint();
		
		

		matchid=newid;
		


		


		LocalDateTime datetime1 = LocalDateTime.now();  
             	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    		formatDateTime = datetime1.format(format); 
		vs111=new JTextField("DATE  "+formatDateTime);
		vs111.setBounds(1070,5,400,25);
	 	vs111.setForeground(Color.BLUE);
		vs111.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(vs111);



	
		ining=new JLabel(" first inning match ");
		ining.setBounds(500,5,500,40);
		ining.setForeground(Color.BLUE);
		ining.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(ining);

		

		
		
		firstteam=new JLabel(" Team1 ");
		firstteam.setBounds(350,45,200,50);
		firstteam.setForeground(Color.BLUE);
		firstteam.setFont(new Font("Cooper",Font.BOLD,40));
		c.add(firstteam);
	
		vs=new JLabel("VS");
		vs.setBounds(560,45,60,50);
		vs.setForeground(Color.BLUE);
		vs.setFont(new Font("Cooper",Font.BOLD,40));
		c.add(vs);
	
		secondteam=new JLabel(" Team2 ");
		secondteam.setBounds(650,45,200,50);
		secondteam.setForeground(Color.BLUE);
		secondteam.setFont(new Font("Cooper",Font.BOLD,40));
		c.add(secondteam);
		
		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select distinct team_name from Matchinfo where match_id=?");
				ps.setString(1,matchid);
		
				ResultSet rs=ps.executeQuery();
				
							

				while(rs.next())
				{
				

					 if(j==1)
					{
					secondteam.setText(rs.getString(1));
					 j++;
					}
					if(j==2)
					{
					firstteam.setText(rs.getString(1));
						
					}

			
					
				}
			
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		


		batingteamname=new JLabel(" BATING PLAYER  ");
		batingteamname.setBounds(10,90,400,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);

		batingteamname=new JLabel("PLAYER_ID");
		batingteamname.setBounds(0,130,200,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(batingteamname);
		
		batsix=new JLabel("6s");
		batsix.setBounds(320,140,40,25);
	 	batsix.setForeground(Color.BLUE);
		batsix.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batsix);
	
		batfour=new JLabel("4s");
		batfour.setBounds(360,140,40,25);
	 	batfour.setForeground(Color.BLUE);
		batfour.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batfour);
		
		batrun=new JLabel(" run ");
		batrun.setBounds(400,140,60,25);
	 	batrun.setForeground(Color.BLUE);
		batrun.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batrun);
		
		batball=new JLabel(" ball ");
		batball.setBounds(460,140,60,25);
	 	batball.setForeground(Color.BLUE);
		batball.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batball);

		
	 	btplay1=new JTextField("1.");
		btplay1.setBounds(0,170,70,30);
	 	btplay1.setForeground(Color.BLUE);
		btplay1.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay1);
		
		btplay2=new JTextField("2.");
		btplay2.setBounds(0,205,70,30);
	 	btplay2.setForeground(Color.BLUE);
		btplay2.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay2);
		
		btplay3=new JTextField("3.");
		btplay3.setBounds(0,240,70,30);
	 	btplay3.setForeground(Color.BLUE);
		btplay3.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay3);
		
		btplay4=new JTextField("4.");
		btplay4.setBounds(0,275,70,30);
	 	btplay4.setForeground(Color.BLUE);
		btplay4.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay4);

		btplay5=new JTextField("5.");
		btplay5.setBounds(0,310,70,30);
	 	btplay5.setForeground(Color.BLUE);
		btplay5.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay5);


		btplay6=new JTextField("6.");
		btplay6.setBounds(0,345,70,30);
	 	btplay6.setForeground(Color.BLUE);
		btplay6.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay6);


		btplay7=new JTextField("7.");
		btplay7.setBounds(0,380,70,30);
	 	btplay7.setForeground(Color.BLUE);
		btplay7.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay7);

		btplay8=new JTextField("8.");
		btplay8.setBounds(0,415,70,30);
	 	btplay8.setForeground(Color.BLUE);
		btplay8.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay8);

		btplay9=new JTextField("9.");
		btplay9.setBounds(0,450,70,30);
	 	btplay9.setForeground(Color.BLUE);
		btplay9.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay9);

		btplay10=new JTextField("10.");
		btplay10.setBounds(0,485,70,30);
	 	btplay10.setForeground(Color.BLUE);
		btplay10.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay10);


		btplay11=new JTextField("11.");
		btplay11.setBounds(0,520,70,30);
	 	btplay11.setForeground(Color.BLUE);
		btplay11.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(btplay11);


		player1=new JTextField();
		player1.setBounds(80,170,230,30);
		player1.setForeground(Color.BLUE);
		player1.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(player1);

		
		player2=new JTextField();
		player2.setBounds(80,205,230,30);
		player2.setForeground(Color.BLUE);
		player2.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player2);

		player3=new JTextField();
		player3.setBounds(80,240,230,30);
		player3.setForeground(Color.BLUE);
		player3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player3);

		player4=new JTextField();
		player4.setBounds(80,275,230,30);
		player4.setForeground(Color.BLUE);
		player4.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player4);

		player5=new JTextField();
		player5.setBounds(80,310,230,30);
		player5.setForeground(Color.BLUE);
		player5.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player5);

		player6=new JTextField();
		player6.setBounds(80,345,230,30);
		player6.setForeground(Color.BLUE);
		player6.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player6);

		player7=new JTextField();
		player7.setBounds(80,380,230,30);
		player7.setForeground(Color.BLUE);
		player7.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player7);

		player8=new JTextField();
		player8.setBounds(80,415,230,30);
		player8.setForeground(Color.BLUE);
		player8.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player8);

		player9=new JTextField();
		player9.setBounds(80,450,230,30);
		player9.setForeground(Color.BLUE);
		player9.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player9);

		player10=new JTextField();
		player10.setBounds(80,485,230,30);
		player10.setForeground(Color.BLUE);
		player10.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player10);

		player11=new JTextField();
		player11.setBounds(80,520,230,30);
		player11.setForeground(Color.BLUE);
		player11.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player11);


		batingteamname=new JLabel(" RUN ");
		batingteamname.setBounds(820,90,100,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);

		batingteamname=new JLabel(" WICKET ");
		batingteamname.setBounds(920,90,140,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);

		batingteamname=new JLabel(" OVER ");
		batingteamname.setBounds(1060,90,130,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);

		batingteamname=new JLabel(" RUN RATE ");
		batingteamname.setBounds(1170,90,200,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);

		batingteamname=new JLabel("BOLWING PLAYER  ");
		batingteamname.setBounds(650,190,400,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batingteamname);
			
		batingteamname=new JLabel("PLAYER_ID");
		batingteamname.setBounds(650,225,200,40);
	 	batingteamname.setForeground(Color.BLUE);
		batingteamname.setFont(new Font("Cooper",Font.BOLD,15));
		c.add(batingteamname);

		
		 ballpaly1=new JTextField("1");
		 ballpaly1.setBounds(650,260,100,30);
	 	 ballpaly1.setForeground(Color.BLUE);
		 ballpaly1.setFont(new Font("Cooper",Font.BOLD,25));
		  c.add( ballpaly1);
		
		 ballpaly2=new JTextField("2");
		ballpaly2.setBounds(650,295,100,30);
	 	ballpaly2.setForeground(Color.BLUE);
		ballpaly2.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly2);
		
		ballpaly3=new JTextField("3");
		ballpaly3.setBounds(650,330,100,30);
	 	ballpaly3.setForeground(Color.BLUE);
		ballpaly3.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly3);
		
		ballpaly4=new JTextField("4");
		ballpaly4.setBounds(650,365,100,30);
	 	ballpaly4.setForeground(Color.BLUE);
		ballpaly4.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly4);

		ballpaly5=new JTextField("5.");
		ballpaly5.setBounds(650,400,100,30);
	 	ballpaly5.setForeground(Color.BLUE);
		ballpaly5.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly5);


		ballpaly6=new JTextField("6.");
		ballpaly6.setBounds(650,435,100,30);
	 	ballpaly6.setForeground(Color.BLUE);
		ballpaly6.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly6);


		ballpaly7=new JTextField("7.");
		ballpaly7.setBounds(650,470,100,30);
	 	ballpaly7.setForeground(Color.BLUE);
		ballpaly7.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(ballpaly7);

	
		player111=new JTextField();
		player111.setBounds(770,260,250,30);
		player111.setForeground(Color.BLUE);
		player111.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player111);

		
		player21=new JTextField();
		player21.setBounds(770,295,250,30);
		player21.setForeground(Color.BLUE);
		player21.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player21);

		player31=new JTextField();
		player31.setBounds(770,330,250,30);
		player31.setForeground(Color.BLUE);
		player31.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player31);

		player41=new JTextField();
		player41.setBounds(770,365,250,30);
		player41.setForeground(Color.BLUE);
		player41.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player41);

		player51=new JTextField();
		player51.setBounds(770,400,250,30);
		player51.setForeground(Color.BLUE);
		player51.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player51);

		player61=new JTextField();
		player61.setBounds(770,435,250,30);
		player61.setForeground(Color.BLUE);
		player61.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player61);

		player71=new JTextField();
		player71.setBounds(770,470,250,30);
		player71.setForeground(Color.BLUE);
		player71.setFont(new Font("Cooper",Font.BOLD,25));
		c.add(player71);

		batsix=new JLabel("6s");
		batsix.setBounds(1050,230,30,25);
	 	batsix.setForeground(Color.BLUE);
		batsix.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batsix);
	
		batfour=new JLabel("4s");
		batfour.setBounds(1100,230,30,25);
	 	batfour.setForeground(Color.BLUE);
		batfour.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batfour);
		
		batrun=new JLabel(" run ");
		batrun.setBounds(1150,230,60,25);
	 	batrun.setForeground(Color.BLUE);
		batrun.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batrun);
		
		batball=new JLabel("  over ");
		batball.setBounds(1200,230,60,25);
	 	batball.setForeground(Color.BLUE);
		batball.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batball);

		batsrate=new JLabel("wicket");
		batsrate.setBounds(1260,230,80,25);
	 	batsrate.setForeground(Color.BLUE);
		batsrate.setFont(new Font("Cooper",Font.BOLD,20));
		c.add(batsrate);

	
		batball=new JLabel(" RUN ");
		batball.setBounds(50,605,100,40);
	 	batball.setForeground(Color.BLUE);
		batball.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batball);

		batsrate=new JLabel(" BALl ");
		batsrate.setBounds(50,650,100,40);
	 	batsrate.setForeground(Color.BLUE);
		batsrate.setFont(new Font("Cooper",Font.BOLD,30));
		c.add(batsrate);
	
		btzero=new JButton(" 0 ");
		btzero.setBounds(170,605,100,40);
		btzero.setForeground(Color.WHITE);
		btzero.addActionListener(this);
		btzero.setFont(new Font("Red",Font.BOLD,35));
		btzero.setBackground(Color.GREEN);
		c.add(btzero);
	
		btone=new JButton(" 1 ");
		btone.setBounds(290,605,100,40);
		btone.setForeground(Color.WHITE);
		btone.addActionListener(this);
		btone.setFont(new Font("Red",Font.BOLD,35));
		btone.setBackground(Color.GREEN);
		c.add(btone);
		
		bttwo=new JButton(" 2 ");
		bttwo.setBounds(410,605,100,40);
		bttwo.setForeground(Color.WHITE);
		bttwo.addActionListener(this);
		bttwo.setFont(new Font("Red",Font.BOLD,35));
		bttwo.setBackground(Color.GREEN);
		c.add(bttwo);
	
		btthree=new JButton(" 3 ");
		btthree.setBounds(530,605,100,40);
		btthree.setForeground(Color.WHITE);
		btthree.addActionListener(this);
		btthree.setFont(new Font("Red",Font.BOLD,35));
		btthree.setBackground(Color.GREEN);
		c.add(btthree);

		btfour=new JButton(" 4 ");
		btfour.setBounds(650,605,100,40);
		btfour.setForeground(Color.WHITE);
		btfour.addActionListener(this);
		btfour.setFont(new Font("Red",Font.BOLD,35));
		btfour.setBackground(Color.GREEN);
		c.add(btfour);
		
		btfive=new JButton(" 5 ");
		btfive.setBounds(770,605,100,40);
		btfive.setForeground(Color.WHITE);
		btfive.addActionListener(this);
		btfive.setFont(new Font("Red",Font.BOLD,35));
		btfive.setBackground(Color.GREEN);
		c.add(btfive);

		btsix=new JButton(" 6 ");
		btsix.setBounds(890,605,100,40);
		btsix.setForeground(Color.WHITE);
		btsix.addActionListener(this);
		btsix.setFont(new Font("Red",Font.BOLD,35));
		btsix.setBackground(Color.GREEN);
		c.add(btsix);


		no=new JButton(" NO ");
		no.setBounds(170,650,150,40);
		no.setForeground(Color.WHITE);
		no.addActionListener(this);
		no.setFont(new Font("Red",Font.BOLD,35));
		no.setBackground(Color.GREEN);
		c.add(no);
	
		wide=new JButton(" WIDE ");
		wide.setBounds(380,650,150,40);
		wide.setForeground(Color.WHITE);
		wide.addActionListener(this);
		wide.setFont(new Font("Red",Font.BOLD,35));
		wide.setBackground(Color.GREEN);
		c.add(wide);
		
		bye=new JButton(" BYE ");
		bye.setBounds(590,650,150,40);
		bye.setForeground(Color.WHITE);
		bye.addActionListener(this);
		bye.setFont(new Font("Red",Font.BOLD,35));
		bye.setBackground(Color.GREEN);
		c.add(bye);
	
		
		
		out=new JButton("OUT");
		out.setBounds(1010,605,150,35);
		out.setForeground(Color.WHITE);
		out.addActionListener(this);
		out.setFont(new Font("Red",Font.BOLD,20));
		out.setBackground(Color.GREEN);
		c.add(out);
		
		runout=new JButton("runout");
		runout.setBounds(1010,645,150,35);
		runout.setForeground(Color.WHITE);
		runout.addActionListener(this);
		runout.setFont(new Font("Red",Font.BOLD,20));
		runout.setBackground(Color.GREEN);
		c.add(runout);

		refres=new JButton("REFRES");
		refres.setBounds(1180,610,150,80);
		refres.setForeground(Color.WHITE);
		refres.addActionListener(this);
		refres.setFont(new Font("Red",Font.BOLD,25));
		refres.setBackground(Color.GREEN);
		c.add(refres);	

		finish=new JButton("start second inning match");
		finish.setBounds(20,30,350,50);
		finish.setForeground(Color.WHITE);
		finish.addActionListener(this);
		finish.setFont(new Font("Red",Font.BOLD,25));
		finish.setBackground(Color.GREEN);
		c.add(finish);


	
		disrun=new JTextArea("0");
		disrun.setBounds(820,140,100,40);
		disrun.setFont(new Font("Red",Font.BOLD,30));
		disrun.setBackground(Color.WHITE);
		c.add(disrun);
		
		diswicket=new JTextArea("0");
		diswicket.setBounds(940,140,100,40);
		diswicket.setFont(new Font("Red",Font.BOLD,30));
		diswicket.setBackground(Color.WHITE);
		c.add(diswicket);

		disover=new JTextArea("0");
		disover.setBounds(1060,140,100,40);
		disover.setFont(new Font("Red",Font.BOLD,30));
		disover.setBackground(Color.WHITE);
		c.add(disover);

		disrunrate=new JTextArea("0");
		disrunrate.setBounds(1180,140,150,40);
		disrunrate.setFont(new Font("Red",Font.BOLD,30));
		disrunrate.setBackground(Color.WHITE);
		c.add(disrunrate);
		



		
		sixplayer1=new JTextArea("0");
		sixplayer1.setBounds(320,170,30,30);
		sixplayer1.setFont(new Font("Red",Font.BOLD,25));
		sixplayer1.setBackground(Color.WHITE);
		c.add(sixplayer1);
	
		sixplayer2=new JTextArea("0");
		sixplayer2.setBounds(320,205,30,30);
		sixplayer2.setFont(new Font("Red",Font.BOLD,25));
		sixplayer2.setBackground(Color.WHITE);
		c.add(sixplayer2);

		sixplayer3=new JTextArea("0");
		sixplayer3.setBounds(320,240,30,30);
		sixplayer3.setFont(new Font("Red",Font.BOLD,25));
		sixplayer3.setBackground(Color.WHITE);
		c.add(sixplayer3);

		sixplayer4=new JTextArea("0");
		sixplayer4.setBounds(320,275,30,30);
		sixplayer4.setFont(new Font("Red",Font.BOLD,25));
		sixplayer4.setBackground(Color.WHITE);
		c.add(sixplayer4);

		sixplayer5=new JTextArea("0");
		sixplayer5.setBounds(320,310,30,30);
		sixplayer5.setFont(new Font("Red",Font.BOLD,25));
		sixplayer5.setBackground(Color.WHITE);
		c.add(sixplayer5);

		sixplayer6=new JTextArea("0");
		sixplayer6.setBounds(320,345,30,30);
		sixplayer6.setFont(new Font("Red",Font.BOLD,25));
		sixplayer6.setBackground(Color.WHITE);
		c.add(sixplayer6);

		sixplayer7=new JTextArea("0");
		sixplayer7.setBounds(320,380,30,30);
		sixplayer7.setFont(new Font("Red",Font.BOLD,25));
		sixplayer7.setBackground(Color.WHITE);
		c.add(sixplayer7);

		sixplayer8=new JTextArea("0");
		sixplayer8.setBounds(320,415,30,30);
		sixplayer8.setFont(new Font("Red",Font.BOLD,25));
		sixplayer8.setBackground(Color.WHITE);
		c.add(sixplayer8);

		sixplayer9=new JTextArea("0");
		sixplayer9.setBounds(320,450,30,30);
		sixplayer9.setFont(new Font("Red",Font.BOLD,25));
		sixplayer9.setBackground(Color.WHITE);
		c.add(sixplayer9);
		
		sixplayer10=new JTextArea("0");
		sixplayer10.setBounds(320,485,30,30);
		sixplayer10.setFont(new Font("Red",Font.BOLD,25));
		sixplayer10.setBackground(Color.WHITE);
		c.add(sixplayer10);

		sixplayer11=new JTextArea("0");
		sixplayer11.setBounds(320,520,30,30);
		sixplayer11.setFont(new Font("Red",Font.BOLD,25));
		sixplayer11.setBackground(Color.WHITE);
		c.add(sixplayer11);





		
		 fourplayer1=new JTextArea("0");
		 fourplayer1.setBounds(360,170,30,30);
		 fourplayer1.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer1.setBackground(Color.WHITE);
		c.add( fourplayer1);
	
		 fourplayer2=new JTextArea("0");
		 fourplayer2.setBounds(360,205,30,30);
		 fourplayer2.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer2.setBackground(Color.WHITE);
		c.add( fourplayer2);

		 fourplayer3=new JTextArea("0");
		 fourplayer3.setBounds(360,240,30,30);
		 fourplayer3.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer3.setBackground(Color.WHITE);
		c.add( fourplayer3);

		 fourplayer4=new JTextArea("0");
		 fourplayer4.setBounds(360,275,30,30);
		 fourplayer4.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer4.setBackground(Color.WHITE);
		c.add( fourplayer4);

		 fourplayer5=new JTextArea("0");
		 fourplayer5.setBounds(360,310,30,30);
		 fourplayer5.setFont(new Font("Red",Font.BOLD,25));
	 	fourplayer5.setBackground(Color.WHITE);
		c.add( fourplayer5);

		 fourplayer6=new JTextArea("0");
		 fourplayer6.setBounds(360,345,30,30);
		 fourplayer6.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer6.setBackground(Color.WHITE);
		c.add( fourplayer6);

		 fourplayer7=new JTextArea("0");
		 fourplayer7.setBounds(360,380,30,30);
		 fourplayer7.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer7.setBackground(Color.WHITE);
		c.add( fourplayer7);

		 fourplayer8=new JTextArea("0");
		 fourplayer8.setBounds(360,415,30,30);
		 fourplayer8.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer8.setBackground(Color.WHITE);
		c.add( fourplayer8);

		 fourplayer9=new JTextArea("0");
		 fourplayer9.setBounds(360,450,30,30);
		 fourplayer9.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer9.setBackground(Color.WHITE);
		c.add( fourplayer9);
		
		 fourplayer10=new JTextArea("0");
		 fourplayer10.setBounds(360,485,30,30);
		 fourplayer10.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer10.setBackground(Color.WHITE);
		c.add( fourplayer10);

		 fourplayer11=new JTextArea("0");
		 fourplayer11.setBounds(360,520,30,30);
		 fourplayer11.setFont(new Font("Red",Font.BOLD,25));
		 fourplayer11.setBackground(Color.WHITE);
		c.add( fourplayer11);
		
	
	
		 runplayer1=new JTextArea("0");
		 runplayer1.setBounds(400,170,50,30);
		 runplayer1.setFont(new Font("Red",Font.BOLD,25));
		 runplayer1.setBackground(Color.WHITE);
		 c.add( runplayer1);


		 runplayer2=new JTextArea("0");
		 runplayer2.setBounds(400,205,50,30);
		 runplayer2.setFont(new Font("Red",Font.BOLD,25));
		 runplayer2.setBackground(Color.WHITE);
		 c.add( runplayer2);
		
		 runplayer3=new JTextArea("0");
		 runplayer3.setBounds(400,240,50,30);
		 runplayer3.setFont(new Font("Red",Font.BOLD,25));
		 runplayer3.setBackground(Color.WHITE);
		 c.add( runplayer3);

		 runplayer4=new JTextArea("0");
		 runplayer4.setBounds(400,275,50,30);
		 runplayer4.setFont(new Font("Red",Font.BOLD,25));
		 runplayer4.setBackground(Color.WHITE);
		 c.add( runplayer4);

		 runplayer5=new JTextArea("0");
		 runplayer5.setBounds(400,310,50,30);
		 runplayer5.setFont(new Font("Red",Font.BOLD,25));
		 runplayer5.setBackground(Color.WHITE);
		 c.add( runplayer5);

		 runplayer6=new JTextArea("0");
		 runplayer6.setBounds(400,345,50,30);
		 runplayer6.setFont(new Font("Red",Font.BOLD,25));
		 runplayer6.setBackground(Color.WHITE);
		 c.add( runplayer6);



		
		 runplayer7=new JTextArea("0");
		 runplayer7.setBounds(400,380,50,30);
		 runplayer7.setFont(new Font("Red",Font.BOLD,25));
		 runplayer7.setBackground(Color.WHITE);
		 c.add( runplayer7);

		 runplayer8=new JTextArea("0");
		 runplayer8.setBounds(400,415,50,30);
		 runplayer8.setFont(new Font("Red",Font.BOLD,25));
		 runplayer8.setBackground(Color.WHITE);
		 c.add( runplayer8);

		 runplayer9=new JTextArea("0");
		 runplayer9.setBounds(400,450,50,30);
		 runplayer9.setFont(new Font("Red",Font.BOLD,25));
		 runplayer9.setBackground(Color.WHITE);
		 c.add( runplayer9);
	
	
		 runplayer10=new JTextArea("0");
		 runplayer10.setBounds(400,485,50,30);
		 runplayer10.setFont(new Font("Red",Font.BOLD,25));
		 runplayer10.setBackground(Color.WHITE);
		 c.add( runplayer10);

		
		 runplayer11=new JTextArea("0");
		 runplayer11.setBounds(400,520,50,30);
		 runplayer11.setFont(new Font("Red",Font.BOLD,25));
		 runplayer11.setBackground(Color.WHITE);
		 c.add( runplayer11);

		ballplayer1=new JTextArea("0");
		ballplayer1.setBounds(460,170,50,30);
		ballplayer1.setFont(new Font("Red",Font.BOLD,25));
		ballplayer1.setBackground(Color.WHITE);
		 c.add(ballplayer1);
	
		ballplayer2=new JTextArea("0");
		ballplayer2.setBounds(460,205,50,30);
		ballplayer2.setFont(new Font("Red",Font.BOLD,25));
		ballplayer2.setBackground(Color.WHITE);
		 c.add(ballplayer2);

		
		ballplayer3=new JTextArea("0");
		ballplayer3.setBounds(460,240,50,30);
		ballplayer3.setFont(new Font("Red",Font.BOLD,25));
		ballplayer3.setBackground(Color.WHITE);
		 c.add(ballplayer3);
	
		ballplayer4=new JTextArea("0");
		ballplayer4.setBounds(460,275,50,30);
		ballplayer4.setFont(new Font("Red",Font.BOLD,25));
		ballplayer4.setBackground(Color.WHITE);
		 c.add(ballplayer4);

		ballplayer5=new JTextArea("0");
		ballplayer5.setBounds(460,310,50,30);
		ballplayer5.setFont(new Font("Red",Font.BOLD,25));
		ballplayer5.setBackground(Color.WHITE);
		 c.add(ballplayer5);

		ballplayer6=new JTextArea("0");
		ballplayer6.setBounds(460,345,50,30);
		ballplayer6.setFont(new Font("Red",Font.BOLD,25));
		ballplayer6.setBackground(Color.WHITE);
		 c.add(ballplayer6);


		ballplayer7=new JTextArea("0");
		ballplayer7.setBounds(460,380,50,30);
		ballplayer7.setFont(new Font("Red",Font.BOLD,25));
		ballplayer7.setBackground(Color.WHITE);
		 c.add(ballplayer7);

		ballplayer8=new JTextArea("0");
		ballplayer8.setBounds(460,415,50,30);
		ballplayer8.setFont(new Font("Red",Font.BOLD,25));
		ballplayer8.setBackground(Color.WHITE);
		 c.add(ballplayer8);

		ballplayer9=new JTextArea("0");
		ballplayer9.setBounds(460,450,50,30);
		ballplayer9.setFont(new Font("Red",Font.BOLD,25));
		ballplayer9.setBackground(Color.WHITE);
		 c.add(ballplayer9);
		
		
		ballplayer10=new JTextArea("0");
		ballplayer10.setBounds(460,485,50,30);
		ballplayer10.setFont(new Font("Red",Font.BOLD,25));
		ballplayer10.setBackground(Color.WHITE);
		 c.add(ballplayer10);

		ballplayer11=new JTextArea("0");
		ballplayer11.setBounds(460,520,50,30);
		ballplayer11.setFont(new Font("Red",Font.BOLD,25));
		ballplayer11.setBackground(Color.WHITE);
		 c.add(ballplayer11);

		srateplayer1=new JButton("INSERT");
		srateplayer1.setBounds(520,170,70,30);
		srateplayer1.addActionListener(this);
		srateplayer1.setFont(new Font("Red",Font.BOLD,10));
		srateplayer1.setBackground(Color.PINK);
		 c.add(srateplayer1);

		srateplayer2=new JButton("INSERT");
		srateplayer2.setBounds(520,205,70,30);
		srateplayer2.addActionListener(this);
		srateplayer2.setFont(new Font("Red",Font.BOLD,10));
		srateplayer2.setBackground(Color.PINK);
		 c.add(srateplayer2);

		srateplayer3=new JButton("INSERT");
		srateplayer3.setBounds(520,240,70,30);
		srateplayer3.addActionListener(this);
		srateplayer3.setFont(new Font("Red",Font.BOLD,10));
		srateplayer3.setBackground(Color.PINK);
		 c.add(srateplayer3);

		srateplayer4=new JButton("INSERT");
		srateplayer4.setBounds(520,275,70,30);
		srateplayer4.addActionListener(this);
		srateplayer4.setFont(new Font("Red",Font.BOLD,10));
		srateplayer4.setBackground(Color.PINK);
		 c.add(srateplayer4);


		srateplayer5=new JButton("INSERT");
		srateplayer5.setBounds(520,310,70,30);
		srateplayer5.addActionListener(this);
		srateplayer5.setFont(new Font("Red",Font.BOLD,10));
		srateplayer5.setBackground(Color.PINK);
		 c.add(srateplayer5);


		srateplayer6=new JButton("INSERT");
		srateplayer6.setBounds(520,345,70,30);
		srateplayer6.addActionListener(this);
		srateplayer6.setFont(new Font("Red",Font.BOLD,10));
		srateplayer6.setBackground(Color.PINK);
		 c.add(srateplayer6);


		srateplayer7=new JButton("INSERT");
		srateplayer7.setBounds(520,380,70,30);
		srateplayer7.addActionListener(this);
		srateplayer7.setFont(new Font("Red",Font.BOLD,10));
		srateplayer7.setBackground(Color.PINK);
		 c.add(srateplayer7);

		srateplayer8=new JButton("INSERT");
		srateplayer8.setBounds(520,415,70,30);
		srateplayer8.addActionListener(this);
		srateplayer8.setFont(new Font("Red",Font.BOLD,10));
		srateplayer8.setBackground(Color.PINK);
		 c.add(srateplayer8);


		srateplayer9=new JButton("INSERT");
		srateplayer9.setBounds(520,450,70,30);
		srateplayer9.addActionListener(this);
		srateplayer9.setFont(new Font("Red",Font.BOLD,10));
		srateplayer9.setBackground(Color.PINK);
		 c.add(srateplayer9);

		srateplayer10=new JButton("INSERT");
		srateplayer10.setBounds(520,485,70,30);
		srateplayer10.addActionListener(this);
		srateplayer10.setFont(new Font("Red",Font.BOLD,10));
		srateplayer10.setBackground(Color.PINK);
		 c.add(srateplayer10);

		srateplayer11=new JButton("INSERT");
		srateplayer11.setBounds(520,520,70,30);
		srateplayer11.addActionListener(this);
		srateplayer11.setFont(new Font("Red",Font.BOLD,10));
		srateplayer11.setBackground(Color.PINK);
		 c.add(srateplayer11);

	
	
		sixboller1=new JTextArea("0");
		sixboller1.setBounds(1050,260,30,30);
		sixboller1.setFont(new Font("Red",Font.BOLD,25));
		sixboller1.setBackground(Color.WHITE);
		 c.add(sixboller1);


		sixboller2=new JTextArea("0");
		sixboller2.setBounds(1050,295,30,30);
		sixboller2.setFont(new Font("Red",Font.BOLD,25));
		sixboller2.setBackground(Color.WHITE);
		 c.add(sixboller2);		

		sixboller3=new JTextArea("0");
		sixboller3.setBounds(1050,330,30,30);
		sixboller3.setFont(new Font("Red",Font.BOLD,25));
		sixboller3.setBackground(Color.WHITE);
		 c.add(sixboller3);

		sixboller4=new JTextArea("0");
		sixboller4.setBounds(1050,365,30,30);
		sixboller4.setFont(new Font("Red",Font.BOLD,25));
		sixboller4.setBackground(Color.WHITE);
		 c.add(sixboller4);

		sixboller5=new JTextArea("0");
		sixboller5.setBounds(1050,400,30,30);
		sixboller5.setFont(new Font("Red",Font.BOLD,25));
		sixboller5.setBackground(Color.WHITE);
		 c.add(sixboller5);

		sixboller6=new JTextArea("0");
		sixboller6.setBounds(1050,435,30,30);
		sixboller6.setFont(new Font("Red",Font.BOLD,25));
		sixboller6.setBackground(Color.WHITE);
		 c.add(sixboller6);

		sixboller7=new JTextArea("0");
		sixboller7.setBounds(1050,470,30,30);
		sixboller7.setFont(new Font("Red",Font.BOLD,25));
		sixboller7.setBackground(Color.WHITE);
		 c.add(sixboller7);

	
	
		
		fourboller1=new JTextArea("0");
		fourboller1.setBounds(1100,260,30,30);
		fourboller1.setFont(new Font("Red",Font.BOLD,25));
		fourboller1.setBackground(Color.WHITE);
		 c.add(fourboller1);

		fourboller2=new JTextArea("0");
		fourboller2.setBounds(1100,295,30,30);
		fourboller2.setFont(new Font("Red",Font.BOLD,25));
		fourboller2.setBackground(Color.WHITE);
		 c.add(fourboller2);

		fourboller3=new JTextArea("0");
		fourboller3.setBounds(1100,330,30,30);
		fourboller3.setFont(new Font("Red",Font.BOLD,25));
		fourboller3.setBackground(Color.WHITE);
		 c.add(fourboller3);

		fourboller4=new JTextArea("0");
		fourboller4.setBounds(1100,365,30,30);
		fourboller4.setFont(new Font("Red",Font.BOLD,25));
		fourboller4.setBackground(Color.WHITE);
		 c.add(fourboller4);


		fourboller5=new JTextArea("0");
		fourboller5.setBounds(1100,400,30,30);
		fourboller5.setFont(new Font("Red",Font.BOLD,25));
		fourboller5.setBackground(Color.WHITE);
		 c.add(fourboller5);

		fourboller6=new JTextArea("0");
		fourboller6.setBounds(1100,435,30,30);
		fourboller6.setFont(new Font("Red",Font.BOLD,25));
		fourboller6.setBackground(Color.WHITE);
		 c.add(fourboller6);

		fourboller7=new JTextArea("0");
		fourboller7.setBounds(1100,470,30,30);
		fourboller7.setFont(new Font("Red",Font.BOLD,25));
		fourboller7.setBackground(Color.WHITE);
		 c.add(fourboller7);

		runboller1=new JTextArea("0");
		runboller1.setBounds(1150,260,40,30);
		runboller1.setFont(new Font("Red",Font.BOLD,25));
		runboller1.setBackground(Color.WHITE);
		 c.add(runboller1);


		runboller2=new JTextArea("0");
		runboller2.setBounds(1150,295,40,30);
		runboller2.setFont(new Font("Red",Font.BOLD,25));
		runboller2.setBackground(Color.WHITE);
		 c.add(runboller2);

		runboller3=new JTextArea("0");
		runboller3.setBounds(1150,330,40,30);
		runboller3.setFont(new Font("Red",Font.BOLD,25));
		runboller3.setBackground(Color.WHITE);
		 c.add(runboller3);

		runboller4=new JTextArea("0");
		runboller4.setBounds(1150,365,40,30);
		runboller4.setFont(new Font("Red",Font.BOLD,25));
		runboller4.setBackground(Color.WHITE);
		 c.add(runboller4);

		runboller5=new JTextArea("0");
		runboller5.setBounds(1150,400,40,30);
		runboller5.setFont(new Font("Red",Font.BOLD,25));
		runboller5.setBackground(Color.WHITE);
		 c.add(runboller5);

		runboller6=new JTextArea("0");
		runboller6.setBounds(1150,435,40,30);
		runboller6.setFont(new Font("Red",Font.BOLD,25));
		runboller6.setBackground(Color.WHITE);
		 c.add(runboller6);

		runboller7=new JTextArea("0");
		runboller7.setBounds(1150,470,40,30);
		runboller7.setFont(new Font("Red",Font.BOLD,25));
		runboller7.setBackground(Color.WHITE);
		 c.add(runboller7);
	
	
		overboller1=new JTextArea("0");
		overboller1.setBounds(1210,260,40,30);
		overboller1.setFont(new Font("Red",Font.BOLD,25));
		overboller1.setBackground(Color.WHITE);
		 c.add(overboller1);

		overboller2=new JTextArea("0");
		overboller2.setBounds(1210,295,40,30);
		overboller2.setFont(new Font("Red",Font.BOLD,25));
		overboller2.setBackground(Color.WHITE);
		 c.add(overboller2);

		overboller3=new JTextArea("0");
		overboller3.setBounds(1210,330,40,30);
		overboller3.setFont(new Font("Red",Font.BOLD,25));
		overboller3.setBackground(Color.WHITE);
		 c.add(overboller3);

		overboller4=new JTextArea("0");
		overboller4.setBounds(1210,365,40,30);
		overboller4.setFont(new Font("Red",Font.BOLD,25));
		overboller4.setBackground(Color.WHITE);
		 c.add(overboller4);

		overboller5=new JTextArea("0");
		overboller5.setBounds(1210,400,40,30);
		overboller5.setFont(new Font("Red",Font.BOLD,25));
		overboller5.setBackground(Color.WHITE);
		 c.add(overboller5);


		overboller6=new JTextArea("0");
		overboller6.setBounds(1210,435,40,30);
		overboller6.setFont(new Font("Red",Font.BOLD,25));
		overboller6.setBackground(Color.WHITE);
		 c.add(overboller6);

		overboller7=new JTextArea("0");
		overboller7.setBounds(1210,470,40,30);
		overboller7.setFont(new Font("Red",Font.BOLD,25));
		overboller7.setBackground(Color.WHITE);
		 c.add(overboller7);


		wicketboller1=new JTextArea("0");
		wicketboller1.setBounds(1270,260,30,30);
		wicketboller1.setFont(new Font("Red",Font.BOLD,25));
		wicketboller1.setBackground(Color.WHITE);
		 c.add(wicketboller1);
		
		wicketboller2=new JTextArea("0");
		wicketboller2.setBounds(1270,295,30,30);
		wicketboller2.setFont(new Font("Red",Font.BOLD,25));
		wicketboller2.setBackground(Color.WHITE);
		 c.add(wicketboller2);

		wicketboller3=new JTextArea("0");
		wicketboller3.setBounds(1270,330,30,30);
		wicketboller3.setFont(new Font("Red",Font.BOLD,25));
		wicketboller3.setBackground(Color.WHITE);
		 c.add(wicketboller3);

		wicketboller4=new JTextArea("0");
		wicketboller4.setBounds(1270,365,30,30);
		wicketboller4.setFont(new Font("Red",Font.BOLD,25));
		wicketboller4.setBackground(Color.WHITE);
		 c.add(wicketboller4);

		wicketboller5=new JTextArea("0");
		wicketboller5.setBounds(1270,400,30,30);
		wicketboller5.setFont(new Font("Red",Font.BOLD,25));
		wicketboller5.setBackground(Color.WHITE);
		 c.add(wicketboller5);

		wicketboller6=new JTextArea("0");
		wicketboller6.setBounds(1270,435,30,30);
		wicketboller6.setFont(new Font("Red",Font.BOLD,25));
		wicketboller6.setBackground(Color.WHITE);
		 c.add(wicketboller6);

		wicketboller7=new JTextArea("0");
		wicketboller7.setBounds(1270,470,30,30);
		wicketboller7.setFont(new Font("Red",Font.BOLD,25));
		wicketboller7.setBackground(Color.WHITE);
		 c.add(wicketboller7);



		wicketboller11=new JButton("INSERT");
		wicketboller11.setBounds(1305,260,60,30);
		wicketboller11.addActionListener(this);
		wicketboller11.setFont(new Font("Red",Font.BOLD,8));
		wicketboller11.setBackground(Color.PINK);
		 c.add(wicketboller11);
		
		wicketboller21=new JButton("INSERT");
		wicketboller21.setBounds(1305,295,60,30);
		wicketboller21.addActionListener(this);
		wicketboller21.setFont(new Font("Red",Font.BOLD,8));
		wicketboller21.setBackground(Color.PINK);
		 c.add(wicketboller21);

		wicketboller31=new JButton("INSERT");
		wicketboller31.setBounds(1305,330,60,30);
		wicketboller31.addActionListener(this);
		wicketboller31.setFont(new Font("Red",Font.BOLD,8));
		wicketboller31.setBackground(Color.PINK);
		 c.add(wicketboller31);

		wicketboller41=new JButton("INSERT");
		wicketboller41.setBounds(1305,365,60,30);
		wicketboller41.addActionListener(this);
		wicketboller41.setFont(new Font("Red",Font.BOLD,8));
		wicketboller41.setBackground(Color.PINK);
		 c.add(wicketboller41);

		wicketboller51=new JButton("INSERT");
		wicketboller51.setBounds(1305,400,60,30);
		wicketboller51.addActionListener(this);
		wicketboller51.setFont(new Font("Red",Font.BOLD,8));
		wicketboller51.setBackground(Color.PINK);
		 c.add(wicketboller51);

		wicketboller61=new JButton("INSERT");
		wicketboller61.setBounds(1305,435,60,30);
		wicketboller61.addActionListener(this);
		wicketboller61.setFont(new Font("Red",Font.BOLD,8));
		wicketboller61.setBackground(Color.PINK);
		 c.add(wicketboller61);

		wicketboller71=new JButton("INSERT");
		wicketboller71.setBounds(1305,470,60,30);
		wicketboller71.addActionListener(this);
		wicketboller71.setFont(new Font("Red",Font.BOLD,8));
		wicketboller71.setBackground(Color.PINK);
		 c.add(wicketboller71);





		
		 strike= new JComboBox();
		 strike.setBounds(320,560,250,40);
		 strike.setForeground(Color.BLUE);
		 strike.setFont(new Font("Cooper",Font.BOLD,25));
		 strike.addItem("select Strike Player");

		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo where team_name=? and match_id=?");
				ps.setString(1,firstteam.getText());
				ps.setString(2,matchid);
				
				ResultSet rs=ps.executeQuery();
				
				
				while(rs.next())
				{
					 
					 
					strike.addItem(rs.getString(4));
					
					
				}
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}


		
	

		
		  c.add(strike);
	
		nonstrike= new JComboBox();
		 nonstrike.setBounds(800,560,250,40);
		 nonstrike.setForeground(Color.BLUE);
		 nonstrike.setFont(new Font("Cooper",Font.BOLD,25));
		nonstrike.addItem("select nonStrike Player");
		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo where team_name=? and match_id=?");
				ps.setString(1,firstteam.getText());
				ps.setString(2,matchid);
				ResultSet rs=ps.executeQuery();
				
				
				while(rs.next())
				{
					 
					 
					nonstrike.addItem(rs.getString(4));
					
					
				}
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		c.add(nonstrike);
	
		
		chooseboller= new JComboBox();
		 chooseboller.setBounds(1100,560,250,40);
		chooseboller.setForeground(Color.BLUE);
		 chooseboller.setFont(new Font("Cooper",Font.BOLD,25));
		chooseboller.addItem("select boller Player");
		

		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo where team_name=? and match_id=?");
				ps.setString(1,secondteam.getText());
				ps.setString(2,matchid);
				ResultSet rs=ps.executeQuery();
				
				
				while(rs.next())
				{
					 if(m>=5&&m<=11)
					 {
					chooseboller.addItem(rs.getString(4));
					}
			
					m++;
					
				}
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}


		c.add(chooseboller);
		
		rotete=new JButton("ROTETE");
		rotete.setBounds(590,560,150,40);
		rotete.setForeground(Color.WHITE);
		rotete.setFont(new Font("Red",Font.BOLD,25));
		rotete.setBackground(Color.RED);
		c.add(rotete);	






		try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo where team_name=? and match_id=?");
				ps.setString(1,firstteam.getText());
				ps.setString(2,matchid);
		
				ResultSet rs=ps.executeQuery();
				
							

				while(rs.next())
				{
				
					System.out.println(rs.getString(4));
					if(k==1)
					{
					player1.setText(rs.getString(4));
					btplay1.setText(rs.getString(3));
					}
					
					if(k==2)
					{
					player2.setText(rs.getString(4));
					btplay2.setText(rs.getString(3));
					}

					if(k==3)
					{
					player3.setText(rs.getString(4));
					btplay3.setText(rs.getString(3));
					}

					if(k==4)
					{
					player4.setText(rs.getString(4));
					btplay4.setText(rs.getString(3));
					}


					if(k==5)
					{
					player5.setText(rs.getString(4));
					btplay5.setText(rs.getString(3));
					}

					if(k==6)
					{
					player6.setText(rs.getString(4));
					btplay6.setText(rs.getString(3));
					}


					if(k==7)
					{
					player7.setText(rs.getString(4));
					btplay7.setText(rs.getString(3));
					}

					if(k==8)
					{
					player8.setText(rs.getString(4));
					btplay8.setText(rs.getString(3));
					}


					if(k==9)
					{
					player9.setText(rs.getString(4));
					btplay9.setText(rs.getString(3));
					}
			
					if(k==10)
					{
					player10.setText(rs.getString(4));
					btplay10.setText(rs.getString(3));
					} 

					if(k==11)
					{
					player11.setText(rs.getString(4));
					btplay11.setText(rs.getString(3));
					} 
					k++;

			
					
				}
			
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		






			try
			{
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("select * from Matchinfo where team_name=? and match_id=?");
				ps.setString(1,secondteam.getText());
				ps.setString(2,matchid);
		
				ResultSet rs=ps.executeQuery();
				
							

				while(rs.next())
				{
				
					System.out.println(rs.getString(4));
					if(l==5)
					{
					player111.setText(rs.getString(4));
					ballpaly1.setText(rs.getString(3));
					}
					
					if(l==6)
					{
					player21.setText(rs.getString(4));
					ballpaly2.setText(rs.getString(3));
					}

					if(l==7)
					{
					player31.setText(rs.getString(4));
					ballpaly3.setText(rs.getString(3));
					}

					if(l==8)
					{
					player41.setText(rs.getString(4));
					ballpaly4.setText(rs.getString(3));
					}


					if(l==9)
					{
					player51.setText(rs.getString(4));
					ballpaly5.setText(rs.getString(3));
					}

					if(l==10)
					{
					player61.setText(rs.getString(4));
					ballpaly6.setText(rs.getString(3));
					}


					if(l==11)
					{
					player71.setText(rs.getString(4));
					ballpaly7.setText(rs.getString(3));
					}

					
					l++;

			
					
				}
			
			
				con.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		


	

		setTitle("new Frame");
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setUndecorated(true);
		setLocationRelativeTo(null);
	
	}

		static void cheakvalue(int id)
		{
			extrarun=id;
		
		}
		
		public void actionPerformed(ActionEvent e)
		{
		
			String strikeplayer=strike.getSelectedItem().toString();
			String bollerstrike=chooseboller.getSelectedItem().toString();
			
//***********************************************************************************			

			if(e.getSource()==btzero)
			{
				
				
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

					
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{


					ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
				
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						 ballboller2++;
						 ballrunboller2=0;
						 overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{

					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
				
					ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}


			


//******************************************************************************************


			if(e.getSource()==btone)
			{
				
			mainrun++;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

					
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				playrun1++;
				runplayer1.setText(""+playrun1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				playrun2++;
				runplayer2.setText(""+playrun2);
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				playrun3++;
				runplayer3.setText(""+playrun3);
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				playrun4++;
				runplayer4.setText(""+playrun4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				playrun5++;
				runplayer5.setText(""+playrun5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6++;
				runplayer6.setText(""+playrun6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7++;
				runplayer7.setText(""+playrun7);
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				playrun8++;
				runplayer8.setText(""+playrun8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9++;
				runplayer9.setText(""+playrun9);
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10++;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				playrun11++;
				runplayer11.setText(""+playrun11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					ballrunboller1++;
					bolleronerun1++;
					runboller1.setText(""+bolleronerun1);
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
				ballrunboller2++;

					bolleronerun2++;
					runboller2.setText(""+bolleronerun2);
				
				if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
					{
					bolleronerun3++;
					runboller3.setText(""+bolleronerun3);


						ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
				
					bolleronerun4++;
					runboller4.setText(""+bolleronerun4);
		
				ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{


					bolleronerun5++;
					runboller5.setText(""+bolleronerun5);
									
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					bolleronerun6++;
					runboller6.setText(""+bolleronerun6);				

				ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
						bolleronerun7++;
						runboller7.setText(""+bolleronerun7);
				
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			

//**************************************************************************************

			if(e.getSource()==bttwo)
			{
				
			mainrun=mainrun+2;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

				playrun1=playrun1+2;
				runplayer1.setText(""+playrun1);	
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				playrun2=playrun2+2;
				runplayer2.setText(""+playrun2);				

				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				
				playrun3=playrun3+2;
				runplayer3.setText(""+playrun3);

				}
				if(strikeplayer.equals(player4.getText()))
				{
				playrun4=playrun4+2;
				runplayer4.setText(""+playrun4);

				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				playrun5=playrun5+2;
				runplayer5.setText(""+playrun5);
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6=playrun6+2;
				runplayer6.setText(""+playrun6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7=playrun7+2;
				runplayer7.setText(""+playrun7);
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				playrun8=playrun8+2;
				runplayer8.setText(""+playrun8);
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9=playrun9+2;
				runplayer9.setText(""+playrun9);
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10=playrun10+2;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				playrun11=playrun11+2;
				runplayer11.setText(""+playrun11);
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					bolleronerun1=bolleronerun1+2;
					runboller1.setText(""+bolleronerun1);

						ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
				
					bolleronerun2=bolleronerun2+2;
					runboller2.setText(""+bolleronerun2);
				
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{     
					
					bolleronerun3=bolleronerun3+2;
					runboller3.setText(""+bolleronerun3);

					 ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{

				
					bolleronerun4=bolleronerun4+2;
					runboller4.setText(""+bolleronerun4);
				ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{        

				
					bolleronerun5=bolleronerun5+2;
					runboller5.setText(""+bolleronerun5);
						
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{

					bolleronerun6=bolleronerun6+2;
					runboller6.setText(""+bolleronerun6);
				
				ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bolleronerun7=bolleronerun7+2;
					runboller7.setText(""+bolleronerun7);

					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			
//*****************************************************************************************************

			if(e.getSource()==btthree)
			{
				
			mainrun=mainrun+3;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

				playrun1=playrun1+3;
				runplayer1.setText(""+playrun1);	
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				playrun2=playrun2+3;
				runplayer2.setText(""+playrun2);
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				playrun3=playrun3+3;
				runplayer3.setText(""+playrun3);

				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				playrun4=playrun4+3;
				runplayer4.setText(""+playrun4);
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				playrun5=playrun5+3;
				runplayer5.setText(""+playrun5);
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6=playrun6+3;
				runplayer6.setText(""+playrun6);
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7=playrun7+3;
				runplayer7.setText(""+playrun7);
				}

				if(strikeplayer.equals(player8.getText()))
				{
				playrun8=playrun8+3;
				runplayer8.setText(""+playrun8);
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9=playrun9+3;
				runplayer9.setText(""+playrun9);
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10=playrun10+3;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				playrun11=playrun11+3;
				runplayer11.setText(""+playrun11);
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{
					ballrunboller1++;
					
					bolleronerun1=bolleronerun1+3;
					runboller1.setText(""+bolleronerun1);

					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{

					bolleronerun2=bolleronerun2+3;
					runboller2.setText(""+bolleronerun2);
					
					
					ballrunboller2++;
					if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{       
					bolleronerun3=bolleronerun3+3;
					runboller3.setText(""+bolleronerun3);

					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
				ballrunboller4++;
				
					bolleronerun4=bolleronerun4+3;
					runboller4.setText(""+bolleronerun4);


					if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bolleronerun5=bolleronerun5+3;
					runboller5.setText(""+bolleronerun5);
					
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
						
					bolleronerun6=bolleronerun6+3;
					runboller6.setText(""+bolleronerun6);

				ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{

					bolleronerun7=bolleronerun7+3;
					runboller7.setText(""+bolleronerun7);

					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			

//***********************************************************************************				


			if(e.getSource()==btfour)
			{
				
			mainrun=mainrun+4;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{
				
				 batingfour1++;				
				fourplayer1.setText(""+batingfour1);
				
				playrun1=playrun1+4;
				runplayer1.setText(""+playrun1);	
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				 batingfour2++;				
				fourplayer2.setText(""+batingfour2);
				playrun2=playrun2+4;
				runplayer2.setText(""+playrun2);
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{

				
				 batingfour3++;				
				fourplayer3.setText(""+batingfour3);
					
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				playrun3=playrun3+4;
				runplayer3.setText(""+playrun3);
				}
				if(strikeplayer.equals(player4.getText()))
				{

				
				 batingfour4++;				
				fourplayer4.setText(""+batingfour4);

				playrun4=playrun4+4;
				runplayer4.setText(""+playrun4);
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer2);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				 batingfour5++;				
				fourplayer5.setText(""+batingfour5);
				
				playrun5=playrun5+4;
				runplayer5.setText(""+playrun5);
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{

				
				 batingfour6++;				
				fourplayer6.setText(""+batingfour6);

				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6=playrun6+4;
				runplayer6.setText(""+playrun6);
				}
				if(strikeplayer.equals(player7.getText()))
				{

				
				 batingfour7++;				
				fourplayer7.setText(""+batingfour7);
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7=playrun7+4;
				runplayer7.setText(""+playrun7);
				}

				if(strikeplayer.equals(player8.getText()))
				{

				
				 batingfour8++;				
				fourplayer8.setText(""+batingfour8);
				playrun8=playrun8+4;
				runplayer8.setText(""+playrun8);
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				
				 batingfour9++;				
				fourplayer9.setText(""+batingfour9);
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9=playrun9+4;
				runplayer9.setText(""+playrun9);
				}
				if(strikeplayer.equals(player10.getText()))
				{

				
				 batingfour10++;				
				fourplayer10.setText(""+batingfour10);
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10=playrun10+4;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{

				
				 batingfour11++;				
				fourplayer11.setText(""+batingfour11);
				playrun11=playrun11+4;
				runplayer11.setText(""+playrun11);
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					bollingfour1++;
					fourboller1.setText(""+bollingfour1);
					bolleronerun1=bolleronerun1+4;
					runboller1.setText(""+bolleronerun1);
					ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
				
				
					bollingfour2++;
					fourboller2.setText(""+bollingfour2);
				bolleronerun2=bolleronerun2+4;
					runboller2.setText(""+bolleronerun2);
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{		

					
					bollingfour3++;
					fourboller3.setText(""+bollingfour3);
					bolleronerun3=bolleronerun3+4;
					runboller3.setText(""+bolleronerun3);

					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{

					
					bollingfour4++;
					fourboller4.setText(""+bollingfour4);
					bolleronerun4=bolleronerun4+4;
					runboller4.setText(""+bolleronerun4);
				
				ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					
					bollingfour5++;
					fourboller5.setText(""+bollingfour5);
					bolleronerun5=bolleronerun5+4;
					runboller5.setText(""+bolleronerun5);
						ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{

					
					bollingfour6++;
					fourboller6.setText(""+bollingfour6);
					bolleronerun6=bolleronerun6+4;
					runboller6.setText(""+bolleronerun6);
				ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					
					bollingfour7++;
					fourboller7.setText(""+bollingfour7);
					bolleronerun7=bolleronerun7+4;
					runboller7.setText(""+bolleronerun7);
					
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			
//**************************************************************************************************

			if(e.getSource()==btfive)
			{
				
			mainrun=mainrun+5;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{
								

				playrun1=playrun1+5;
				runplayer1.setText(""+playrun1);	
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				playrun2=playrun2+5;
				runplayer2.setText(""+playrun2);
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				playrun3=playrun3+5;
				runplayer3.setText(""+playrun3);
				}
				if(strikeplayer.equals(player4.getText()))
				{
				playrun4=playrun4+5;
				runplayer4.setText(""+playrun4);
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer2);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				playrun5=playrun5+5;
				runplayer5.setText(""+playrun5);
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6=playrun6+5;
				runplayer6.setText(""+playrun6);
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7=playrun7+5;
				runplayer7.setText(""+playrun7);
				}

				if(strikeplayer.equals(player8.getText()))
				{
				playrun8=playrun8+5;
				runplayer8.setText(""+playrun8);
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9=playrun9+5;
				runplayer9.setText(""+playrun9);
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10=playrun10+5;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				playrun11=playrun11+5;
				runplayer11.setText(""+playrun11);
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{
					bolleronerun1=bolleronerun1+5;
					runboller1.setText(""+bolleronerun1);	
				ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
					bolleronerun2=bolleronerun2+5;
					runboller2.setText(""+bolleronerun2);	
				
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{
					bolleronerun3=bolleronerun3+5;
					runboller3.setText(""+bolleronerun3);
					
					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bolleronerun4=bolleronerun4+5;
					runboller4.setText(""+bolleronerun4);
					
				ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bolleronerun5=bolleronerun5+5;
					runboller5.setText(""+bolleronerun5);
					
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					bolleronerun6=bolleronerun6+5;
					runboller6.setText(""+bolleronerun6);
					
					ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bolleronerun7=bolleronerun7+5;
					runboller7.setText(""+bolleronerun7);
					
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			

//*******************************************************************************************
		
				if(e.getSource()==btsix)
				 {
				
			mainrun=mainrun+6;
			disrun.setText(""+mainrun);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{
				batingsix1++;				
				sixplayer1.setText(""+batingsix1);
				playrun1=playrun1+6;
				runplayer1.setText(""+playrun1);	
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{

				 batingsix2++;				
				sixplayer2.setText(""+batingsix2);
				playrun2=playrun2+6;
				runplayer2.setText(""+playrun2);
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{


				 batingsix3++;				
				sixplayer3.setText(""+batingsix3);

				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				playrun3=playrun3+6;
				runplayer3.setText(""+playrun3);
				}
				if(strikeplayer.equals(player4.getText()))
				{
				 batingsix4++;				
				sixplayer4.setText(""+batingsix4);


				playrun4=playrun4+6;
				runplayer4.setText(""+playrun4);
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer2);
				}
				if(strikeplayer.equals(player5.getText()))
				{

				 batingsix5++;				
				sixplayer5.setText(""+batingsix5);
				playrun5=playrun5+6;
				runplayer5.setText(""+playrun5);
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{

				 batingsix6++;				
				sixplayer6.setText(""+batingsix6);
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				playrun6=playrun6+6;
				runplayer6.setText(""+playrun6);
				}
				if(strikeplayer.equals(player7.getText()))
				{

				 batingsix7++;				
				sixplayer7.setText(""+batingsix7);
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				playrun7=playrun7+6;
				runplayer7.setText(""+playrun7);
				}

				if(strikeplayer.equals(player8.getText()))
				{
				 batingsix8++;				
				sixplayer8.setText(""+batingsix8);
				playrun8=playrun8+6;
				runplayer8.setText(""+playrun8);
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				 batingsix9++;				
				sixplayer9.setText(""+batingsix9);
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				playrun9=playrun9+6;
				runplayer9.setText(""+playrun9);
				}
				if(strikeplayer.equals(player10.getText()))
				{
				 batingsix10++;				
				 sixplayer10.setText(""+batingsix10);

				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				playrun10=playrun10+6;
				runplayer10.setText(""+playrun10);
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				 batingsix11++;				
				sixplayer11.setText(""+batingsix11);
				playrun11=playrun11+6;
				runplayer11.setText(""+playrun11);
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{
					bollingsix1++;
					sixboller1.setText(""+bollingsix1);
					
					bolleronerun1=bolleronerun1+6;
					runboller1.setText(""+bolleronerun1);
						ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{

					bollingsix2++;
					sixboller2.setText(""+bollingsix2);
					bolleronerun2=bolleronerun2+6;
					runboller2.setText(""+bolleronerun2);
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						ballboller2++;
						 ballrunboller2=0;
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{
					bollingsix3++;
					sixboller3.setText(""+bollingsix3);
					bolleronerun3=bolleronerun3+6;
					runboller3.setText(""+bolleronerun3);
			
					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bollingsix4++;
					sixboller4.setText(""+bollingsix4);
					bolleronerun4=bolleronerun4+6;
					runboller4.setText(""+bolleronerun4);
				ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{


					bollingsix5++;
					sixboller5.setText(""+bollingsix5);
					bolleronerun5=bolleronerun5+6;
					runboller5.setText(""+bolleronerun5);
					
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{

					bollingsix6++;
					sixboller6.setText(""+bollingsix6);
					bolleronerun6=bolleronerun6+6;
					runboller6.setText(""+bolleronerun6);				

				ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bollingsix7++;
					sixboller7.setText(""+bollingsix7);
					bolleronerun7=bolleronerun7+6;
					runboller7.setText(""+bolleronerun7);
					
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	


			}
			
//****************************************************

			if(e.getSource()==out)
			{
				
			mainwicket++;
			diswicket.setText(""+mainwicket);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

					
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{
					bollerwicket1++;
					wicketboller1.setText(""+bollerwicket1);

					ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
					bollerwicket2++;
					wicketboller2.setText(""+bollerwicket2);
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						 ballboller2++;
						 ballrunboller2=0;
						 overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{
					bollerwicket3++;
					wicketboller3.setText(""+bollerwicket3);
					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bollerwicket4++;
					wicketboller4.setText(""+bollerwicket4);
					ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bollerwicket5++;
					wicketboller5.setText(""+bollerwicket5);
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{

					bollerwicket6++;
					wicketboller6.setText(""+bollerwicket6);
					ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{

					bollerwicket7++;
					wicketboller7.setText(""+bollerwicket7);
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	
}

			


			
//**********************************************************************************************
	



		
			
		if(e.getSource()==no)
			{
			
			
				
			new Extrarun();	
			mainrun=mainrun+extrarun;

			disrun.setText(""+mainrun);
			
			
			
			if(strikeplayer.equals(player1.getText()))
			{

			
			


					
				playrun1=playrun1+extrarun;
				runplayer1.setText(""+playrun1);	
				
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				playrun2=playrun2+extrarun;
				runplayer2.setText(""+playrun2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				playrun3=playrun3+extrarun;
				runplayer3.setText(""+playrun3);
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				playrun4=playrun4+extrarun;
				runplayer4.setText(""+playrun4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				playrun5=playrun5+extrarun;
				runplayer5.setText(""+playrun5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				playrun6=playrun6+extrarun;
				runplayer6.setText(""+playrun6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				playrun7=playrun7+extrarun;
				runplayer7.setText(""+playrun7);
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				playrun8=playrun8+extrarun;
				runplayer8.setText(""+playrun8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				playrun9=playrun9+extrarun;
				runplayer9.setText(""+playrun9);
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				playrun10=playrun10+extrarun;
				runplayer10.setText(""+playrun10);
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				playrun11=playrun11+extrarun;
				runplayer11.setText(""+playrun11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					bolleronerun1=bolleronerun1+extrarun;
					runboller1.setText(""+bolleronerun1);
					

				}
				if(bollerstrike.equals(player21.getText()))
				{
					bolleronerun2=bolleronerun2+extrarun;
					runboller2.setText(""+bolleronerun2);
				}
				if(bollerstrike.equals(player31.getText()))
				{
					bolleronerun3=bolleronerun3+extrarun;
					runboller3.setText(""+bolleronerun3);
					
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bolleronerun4=bolleronerun4+extrarun;
					runboller4.setText(""+bolleronerun4);
					
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bolleronerun5=bolleronerun5+extrarun;
					runboller5.setText(""+bolleronerun5);	
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					bolleronerun6=bolleronerun6+extrarun;
					runboller6.setText(""+bolleronerun6);	
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bolleronerun7=bolleronerun7+extrarun;
					runboller7.setText(""+bolleronerun7);	
				
				}


	


			}


//***************************************************************************************************			



		if(e.getSource()==wide)
			{
			new Extrarun();		
			
			mainrun=mainrun+extrarun;

			disrun.setText(""+mainrun);
			
			extrarun=0;	
			
			if(strikeplayer.equals(player1.getText()))
			{

					
				
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player6.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				
				}

				if(strikeplayer.equals(player9.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					bolleronerun1=bolleronerun1+extrarun;
					runboller1.setText(""+bolleronerun1);
					

				}
				if(bollerstrike.equals(player21.getText()))
				{
					bolleronerun2=bolleronerun2+extrarun;
					runboller2.setText(""+bolleronerun2);
				}
				if(bollerstrike.equals(player31.getText()))
				{
					bolleronerun3=bolleronerun3+extrarun;
					runboller3.setText(""+bolleronerun3);
					
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bolleronerun4=bolleronerun4+extrarun;
					runboller4.setText(""+bolleronerun4);
					
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bolleronerun5=bolleronerun5+extrarun;
					runboller5.setText(""+bolleronerun5);	
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					bolleronerun6=bolleronerun6+extrarun;
					runboller6.setText(""+bolleronerun6);	
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bolleronerun7=bolleronerun7+extrarun;
					runboller7.setText(""+bolleronerun7);	
				
				}


			}

//*********************************************************************
	



			if(e.getSource()==bye)
			{
			new Extrarun();		
			
			mainrun=mainrun+extrarun;

			disrun.setText(""+mainrun);
			
			extrarun=0;	
			
			if(strikeplayer.equals(player1.getText()))
			{

					
					
				
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player6.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				
				}

				if(strikeplayer.equals(player9.getText()))
				{
				
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{

					bolleronerun1=bolleronerun1+extrarun;
					runboller1.setText(""+bolleronerun1);
					

				}
				if(bollerstrike.equals(player21.getText()))
				{
					bolleronerun2=bolleronerun2+extrarun;
					runboller2.setText(""+bolleronerun2);
				}
				if(bollerstrike.equals(player31.getText()))
				{
					bolleronerun3=bolleronerun3+extrarun;
					runboller3.setText(""+bolleronerun3);
					
				}

				if(bollerstrike.equals(player41.getText()))
				{
					bolleronerun4=bolleronerun4+extrarun;
					runboller4.setText(""+bolleronerun4);
					
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					bolleronerun5=bolleronerun5+extrarun;
					runboller5.setText(""+bolleronerun5);	
				
				}

				if(bollerstrike.equals(player61.getText()))
				{
					bolleronerun6=bolleronerun6+extrarun;
					runboller6.setText(""+bolleronerun6);	
				
				}

				if(bollerstrike.equals(player71.getText()))
				{
					bolleronerun7=bolleronerun7+extrarun;
					runboller7.setText(""+bolleronerun7);	
				
				}

	


			}

//*************************************************************************************************************


			if(e.getSource()==runout)
			{
				
			mainwicket++;
			diswicket.setText(""+mainwicket);	
				
			mainball++;	
			if(mainball%6==0)
			{ 
			 	mainover++;
			 	mainball=0;
				disover.setText(""+mainover+"."+mainball);
			
			}
				disover.setText(""+mainover+"."+mainball);
				
			
			if(strikeplayer.equals(player1.getText()))
			{

					
				
				ballrunplayer1++;
				ballplayer1.setText(""+ballrunplayer1);
				
				
			}
	
			if(strikeplayer.equals(player2.getText()))
			{
				
				ballrunplayer2++;
				ballplayer2.setText(""+ballrunplayer2);
				
			}
				if(strikeplayer.equals(player3.getText()))
				{
				ballrunplayer3++;
				ballplayer3.setText(""+ballrunplayer3);
				
				}
				if(strikeplayer.equals(player4.getText()))
				{
				
				ballrunplayer4++;
				ballplayer4.setText(""+ballrunplayer4);
				}
				if(strikeplayer.equals(player5.getText()))
				{
				
				ballrunplayer5++;
				ballplayer5.setText(""+ballrunplayer5);
				}
				if(strikeplayer.equals(player6.getText()))
				{
				ballrunplayer6++;
				ballplayer6.setText(""+ballrunplayer6);
				
				}
				if(strikeplayer.equals(player7.getText()))
				{
				ballrunplayer7++;
				ballplayer7.setText(""+ballrunplayer7);
				
				}

				if(strikeplayer.equals(player8.getText()))
				{
				
				ballrunplayer8++;
				ballplayer8.setText(""+ballrunplayer8);
				}

				if(strikeplayer.equals(player9.getText()))
				{
				ballrunplayer9++;
				ballplayer9.setText(""+ballrunplayer9);
				
				}
				if(strikeplayer.equals(player10.getText()))
				{
				ballrunplayer10++;
				ballplayer10.setText(""+ballrunplayer10);
				
				}
			
				if(strikeplayer.equals(player11.getText()))
				{
				
				ballrunplayer11++;
				ballplayer11.setText(""+ballrunplayer11);
				}


				//for boller run incress

				if(bollerstrike.equals(player111.getText()))
				{
					
					ballrunboller1++;
					if(ballrunboller1%6==0)
					{ 
						ballboller1++;
						 ballrunboller1=0;
						overboller1.setText(""+ballboller1+"."+ballrunboller1);
			
					}
						overboller1.setText(""+ballboller1+"."+ballrunboller1);

				}
				if(bollerstrike.equals(player21.getText()))
				{
				ballrunboller2++;
				if(ballrunboller2%6==0)
					{ 
						 ballboller2++;
						 ballrunboller2=0;
						 overboller2.setText(""+ballboller2+"."+ballrunboller2);
			
					}
						overboller2.setText(""+ballboller2+"."+ballrunboller2);
				}
			
				if(bollerstrike.equals(player31.getText()))
				{
					
					ballrunboller3++;
					if(ballrunboller3%6==0)
					{ 
						ballboller3++;
						 ballrunboller3=0;
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
			
					}
						overboller3.setText(""+ballboller3+"."+ballrunboller3);
				
				}

				if(bollerstrike.equals(player41.getText()))
				{
					
					ballrunboller4++;
				if(ballrunboller4%6==0)
					{ 
						ballboller4++;
						 ballrunboller4=0;
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
			
					}
						overboller4.setText(""+ballboller4+"."+ballrunboller4);
				}
			
				if(bollerstrike.equals(player51.getText()))
				{
					
					ballrunboller5++;
					if(ballrunboller5%6==0)
					{ 
						ballboller5++;
						 ballrunboller5=0;
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
			
					}
						overboller5.setText(""+ballboller5+"."+ballrunboller5);
				
				}

				if(bollerstrike.equals(player61.getText()))
				{

					
					ballrunboller6++;
				if(ballrunboller6%6==0)
					{ 
						ballboller6++;
						 ballrunboller6=0;
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
			
					}
						overboller6.setText(""+ballboller6+"."+ballrunboller6);
				
				}

				if(bollerstrike.equals(player71.getText()))
				{

					
					ballrunboller7++;
					if(ballrunboller7%6==0)
					{ 
						ballboller7++;
						 ballrunboller7=0;
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
			
					}
						overboller7.setText(""+ballboller7+"."+ballrunboller7);
				
				}


	
}
//******************************************************			
			

		if(e.getSource()==srateplayer1)
		{

			sk1++;
			if(sk1==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay1.getText());
				ps.setString(2,player1.getText());
				ps.setString(3,runplayer1.getText());
				ps.setString(4,ballplayer1.getText());
				ps.setString(5,sixplayer1.getText());
				ps.setString(6,fourplayer1.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e11)
			{
				System.out.println(e11);
			}
		
		}

		if(sk1>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer1.getText());
			ps.setString(2,ballplayer1.getText());
			ps.setString(3,sixplayer1.getText());
			ps.setString(4,fourplayer1.getText());
			ps.setString(5,btplay1.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e111)
		    {
			System.out.println(e111);
		    }
		
		}
		
		
	}
//***********************************************************************

		if(e.getSource()==srateplayer2)
		{

			sk2++;
			if(sk2==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay2.getText());
				ps.setString(2,player2.getText());
				ps.setString(3,runplayer2.getText());
				ps.setString(4,ballplayer2.getText());
				ps.setString(5,sixplayer2.getText());
				ps.setString(6,fourplayer2.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e112)
			{
				System.out.println(e112);
			}
		
		}

		if(sk2>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer2.getText());
			ps.setString(2,ballplayer2.getText());
			ps.setString(3,sixplayer2.getText());
			ps.setString(4,fourplayer2.getText());
			ps.setString(5,btplay2.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1112)
		    {
			System.out.println(e1112);
		    }
		
		}
		
		
	}
//***********************************************************************************

		if(e.getSource()==srateplayer3)
		{

			sk3++;
			if(sk3==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay3.getText());
				ps.setString(2,player3.getText());
				ps.setString(3,runplayer3.getText());
				ps.setString(4,ballplayer3.getText());
				ps.setString(5,sixplayer3.getText());
				ps.setString(6,fourplayer3.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e113)
			{
				System.out.println(e113);
			}
		
		}

		if(sk3>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer3.getText());
			ps.setString(2,ballplayer3.getText());
			ps.setString(3,sixplayer3.getText());
			ps.setString(4,fourplayer3.getText());
			ps.setString(5,btplay3.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1113)
		    {
			System.out.println(e1113);
		    }
		
		}
		
		
	}

//***********************************************************************************
			if(e.getSource()==srateplayer4)
		{

			sk4++;
			if(sk4==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay4.getText());
				ps.setString(2,player4.getText());
				ps.setString(3,runplayer4.getText());
				ps.setString(4,ballplayer4.getText());
				ps.setString(5,sixplayer4.getText());
				ps.setString(6,fourplayer4.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e114)
			{
				System.out.println(e114);
			}
		
		}

		if(sk4>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer4.getText());
			ps.setString(2,ballplayer4.getText());
			ps.setString(3,sixplayer4.getText());
			ps.setString(4,fourplayer4.getText());
			ps.setString(5,btplay4.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1114)
		    {
			System.out.println(e1114);
		    }
		
		}
		
		
	}

//***********************************************************************************

		if(e.getSource()==srateplayer5)
		{

			sk5++;
			if(sk5==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay5.getText());
				ps.setString(2,player5.getText());
				ps.setString(3,runplayer5.getText());
				ps.setString(4,ballplayer5.getText());
				ps.setString(5,sixplayer5.getText());
				ps.setString(6,fourplayer5.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e115)
			{
				System.out.println(e115);
			}
		
		}

		if(sk5>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer5.getText());
			ps.setString(2,ballplayer5.getText());
			ps.setString(3,sixplayer5.getText());
			ps.setString(4,fourplayer5.getText());
			ps.setString(5,btplay5.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1115)
		    {
			System.out.println(e1115);
		    }
		
		}
		
		
	}
//***********************************************************************************

if(e.getSource()==srateplayer6)
		{

			sk6++;
			if(sk6==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay6.getText());
				ps.setString(2,player6.getText());
				ps.setString(3,runplayer6.getText());
				ps.setString(4,ballplayer6.getText());
				ps.setString(5,sixplayer6.getText());
				ps.setString(6,fourplayer6.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e116)
			{
				System.out.println(e116);
			}
		
		}

		if(sk6>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer6.getText());
			ps.setString(2,ballplayer6.getText());
			ps.setString(3,sixplayer6.getText());
			ps.setString(4,fourplayer6.getText());
			ps.setString(5,btplay1.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1116)
		    {
			System.out.println(e1116);
		    }
		
		}
		
		
	}

//***********************************************************************************

	if(e.getSource()==srateplayer7)
		{

			sk7++;
			if(sk7==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay7.getText());
				ps.setString(2,player7.getText());
				ps.setString(3,runplayer7.getText());
				ps.setString(4,ballplayer7.getText());
				ps.setString(5,sixplayer7.getText());
				ps.setString(6,fourplayer7.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e117)
			{
				System.out.println(e117);
			}
		
		}

		if(sk7>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer7.getText());
			ps.setString(2,ballplayer7.getText());
			ps.setString(3,sixplayer7.getText());
			ps.setString(4,fourplayer7.getText());
			ps.setString(5,btplay7.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1117)
		    {
			System.out.println(e1117);
		    }
		
		}
		
		
	}
//***********************************************************************************

if(e.getSource()==srateplayer8)
		{

			sk8++;
			if(sk8==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay8.getText());
				ps.setString(2,player8.getText());
				ps.setString(3,runplayer8.getText());
				ps.setString(4,ballplayer8.getText());
				ps.setString(5,sixplayer8.getText());
				ps.setString(6,fourplayer8.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e118)
			{
				System.out.println(e118);
			}
		
		}

		if(sk8>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer8.getText());
			ps.setString(2,ballplayer8.getText());
			ps.setString(3,sixplayer8.getText());
			ps.setString(4,fourplayer8.getText());
			ps.setString(5,btplay8.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1118)
		    {
			System.out.println(e1118);
		    }
		
		}
		
		
	}
//***********************************************************************************

if(e.getSource()==srateplayer9)
		{

			sk9++;
			if(sk9==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay9.getText());
				ps.setString(2,player9.getText());
				ps.setString(3,runplayer9.getText());
				ps.setString(4,ballplayer9.getText());
				ps.setString(5,sixplayer9.getText());
				ps.setString(6,fourplayer9.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e119)
			{
				System.out.println(e119);
			}
		
		}

		if(sk9>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer9.getText());
			ps.setString(2,ballplayer9.getText());
			ps.setString(3,sixplayer9.getText());
			ps.setString(4,fourplayer9.getText());
			ps.setString(5,btplay1.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1119)
		    {
			System.out.println(e1119);
		    }
		
		}
		
		
	}
//***********************************************************************************

if(e.getSource()==srateplayer10)
		{

			sk10++;
			if(sk10==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay10.getText());
				ps.setString(2,player10.getText());
				ps.setString(3,runplayer10.getText());
				ps.setString(4,ballplayer10.getText());
				ps.setString(5,sixplayer10.getText());
				ps.setString(6,fourplayer10.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e110)
			{
				System.out.println(e110);
			}
		
		}

		if(sk10>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer10.getText());
			ps.setString(2,ballplayer10.getText());
			ps.setString(3,sixplayer10.getText());
			ps.setString(4,fourplayer10.getText());
			ps.setString(5,btplay1.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e1110)
		    {
			System.out.println(e1110);
		    }
		
		}
		
		
	}

//***********************************************************************************



		if(e.getSource()==srateplayer11)
		{

			sk11++;
			if(sk11==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,btplay11.getText());
				ps.setString(2,player11.getText());
				ps.setString(3,runplayer11.getText());
				ps.setString(4,ballplayer11.getText());
				ps.setString(5,sixplayer11.getText());
				ps.setString(6,fourplayer11.getText());
				ps.setString(7," ");
				ps.setString(8," ");
				ps.setString(9," ");
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e1111)
			{
				System.out.println(e1111);
			}
		
		}

		if(sk11>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  batting_run=?,ball=?, batting_six=?, batting_four=? where  player_id=?");
			ps.setString(1,runplayer11.getText());
			ps.setString(2,ballplayer11.getText());
			ps.setString(3,sixplayer11.getText());
			ps.setString(4,fourplayer11.getText());
			ps.setString(5,btplay1.getText());
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e11199)
		    {
			System.out.println(e11199);
		    }
		
		}
		
		
	}

//***********************************************************************************
	
	if(e.getSource()==wicketboller11)
		{

			pk1++;
			if(pk1==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly1.getText());
				ps.setString(2,player111.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller1.getText());
				ps.setString(8,overboller1.getText());
				ps.setString(9,wicketboller1.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e991)
			{
				System.out.println(e991);
			}
		
		}

		if(pk1>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller1.getText());
			ps.setString(2,overboller1.getText());
			ps.setString(3,wicketboller1.getText());
			ps.setString(4,ballpaly1.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e61)
		    {
			System.out.println(e61);
		    }
		
		}
		
		
	}

//***********************************************************************************
	
	if(e.getSource()==wicketboller21)
		{

			pk2++;
			if(pk2==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly2.getText());
				ps.setString(2,player21.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller2.getText());
				ps.setString(8,overboller2.getText());
				ps.setString(9,wicketboller2.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e992)
			{
				System.out.println(e992);
			}
		
		}

		if(pk2>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller2.getText());
			ps.setString(2,overboller2.getText());
			ps.setString(3,wicketboller2.getText());
			ps.setString(4,ballpaly2.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e62)
		    {
			System.out.println(e62);
		    }
		
		}
		
		
	}

//***********************************************************************************
if(e.getSource()==wicketboller31)
		{

			pk3++;
			if(pk3==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly3.getText());
				ps.setString(2,player31.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller3.getText());
				ps.setString(8,overboller3.getText());
				ps.setString(9,wicketboller3.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e991)
			{
				System.out.println(e991);
			}
		
		}

		if(pk3>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller3.getText());
			ps.setString(2,overboller3.getText());
			ps.setString(3,wicketboller3.getText());
			ps.setString(4,ballpaly3.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e63)
		    {
			System.out.println(e63);
		    }
		
		}
		
		
	}

//***********************************************************************************
																	
if(e.getSource()==wicketboller41)
		{

			pk4++;
			if(pk4==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly4.getText());
				ps.setString(2,player41.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller4.getText());
				ps.setString(8,overboller4.getText());
				ps.setString(9,wicketboller4.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e994)
			{
				System.out.println(e994);
			}
		
		}

		if(pk4>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller4.getText());
			ps.setString(2,overboller4.getText());
			ps.setString(3,wicketboller4.getText());
			ps.setString(4,ballpaly4.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e64)
		    {
			System.out.println(e64);
		    }
		
		}
		
		
	}

//***********************************************************************************


if(e.getSource()==wicketboller51)
		{

			pk5++;
			if(pk5==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly5.getText());
				ps.setString(2,player51.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller5.getText());
				ps.setString(8,overboller5.getText());
				ps.setString(9,wicketboller5.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e995)
			{
				System.out.println(e995);
			}
		
		}

		if(pk5>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller5.getText());
			ps.setString(2,overboller5.getText());
			ps.setString(3,wicketboller5.getText());
			ps.setString(4,ballpaly5.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e65)
		    {
			System.out.println(e65);
		    }
		
		}
		
		
	}

//***********************************************************************************
						

		if(e.getSource()==wicketboller61)
		{

			pk6++;
			if(pk6==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly6.getText());
				ps.setString(2,player61.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller6.getText());
				ps.setString(8,overboller6.getText());
				ps.setString(9,wicketboller6.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e996)
			{
				System.out.println(e996);
			}
		
		}

		if(pk6>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller6.getText());
			ps.setString(2,overboller6.getText());
			ps.setString(3,wicketboller6.getText());
			ps.setString(4,ballpaly6.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e66)
		    {
			System.out.println(e66);
		    }
		
		}
		
		
	}

//***********************************************************************************
	

		if(e.getSource()==wicketboller71)
		{

			pk7++;
			if(pk7==1)
			{
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
				PreparedStatement ps=con.prepareStatement("insert into player_id_details values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,ballpaly7.getText());
				ps.setString(2,player71.getText());
				ps.setString(3," ");
				ps.setString(4," ");	 
				ps.setString(5," ");
				ps.setString(6," ");
				ps.setString(7,runboller7.getText());
				ps.setString(8,overboller7.getText());
				ps.setString(9,wicketboller7.getText());
				ps.setString(10,formatDateTime);
				
								
				int i=ps.executeUpdate();
				JOptionPane.showMessageDialog(this," record inserted !","inserting....",JOptionPane.INFORMATION_MESSAGE);
				con.close();	
			}
			catch(Exception e997)
			{
				System.out.println(e997);
			}
		
		}

		if(pk7>=2)
		{
			try
		   {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cdac","cdac");
			PreparedStatement ps=con.prepareStatement("update player_id_details set  bolling_run=?,bolling_over=?,  bolling_wicket=? where  player_id=?");
			ps.setString(1,runboller7.getText());
			ps.setString(2,overboller7.getText());
			ps.setString(3,wicketboller7.getText());
			ps.setString(4,ballpaly7.getText());
			
						int i=ps.executeUpdate();
			JOptionPane.showMessageDialog(this," record updated !");
			con.close();
 		    }
		    catch(Exception e67)
		    {
			System.out.println(e67);
		    }
		
		}
		
		
	}

//***********************************************************************************
	if(e.getSource()==finish)
		{
		   new SecondMatch(matchid);
		}					
								
}	

		public static void main(String[] args)
		{
			
		    new FirstMatch("hello");
		}
			
}


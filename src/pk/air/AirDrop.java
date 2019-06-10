package pk.air;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AirDrop {
	
	static ImageIcon crediticonhover = new ImageIcon("rec/credit-hover.png");
	static Image creditimagehover = crediticonhover.getImage();
	static Image newcreditimagehover = creditimagehover.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon crediticon = new ImageIcon("rec/credit.png");
	static Image creditimage = crediticon.getImage();
	static Image newcreditimage = creditimage.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon customiconhover = new ImageIcon("rec/custom-hover.png");
	static Image customimagehover = customiconhover.getImage();
	static Image newcustomimagehover = customimagehover.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon customicon = new ImageIcon("rec/custom.png");
	static Image customimage = customicon.getImage();
	static Image newcustomimage = customimage.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon playiconhover = new ImageIcon("rec/play-hover.png");
	static Image playimagehover = playiconhover.getImage();
	static Image newplayimagehover = playimagehover.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon playicon = new ImageIcon("rec/play.png");
	static Image playimage = playicon.getImage();
	static Image newplayimage = playimage.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon backicon = new ImageIcon("rec/back.png");
	static Image backimage = backicon.getImage();
	static Image newbackimage = backimage.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon backiconhover = new ImageIcon("rec/back-hover.png");
	static Image backimagehover = backiconhover.getImage();
	static Image newbackimagehover = backimagehover.getScaledInstance(200, 70, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon title1icon = new ImageIcon("rec/title1.png");
	static Image title1image = title1icon.getImage();
	static Image newtitle1image = title1image.getScaledInstance(400, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon title2icon = new ImageIcon("rec/title2.png");
	static Image title2image = title2icon.getImage();
	static Image newtitle2image = title2image.getScaledInstance(300, 110, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl1icon = new ImageIcon("rec/pl1.png");
	static Image pl1image = pl1icon.getImage();
	static Image newpl1image = pl1image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl1iconhover = new ImageIcon("rec/pl1-hover.png");
	static Image pl1imagehover = pl1iconhover.getImage();
	static Image newpl1imagehover = pl1imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl2icon = new ImageIcon("rec/pl2.png");
	static Image pl2image = pl2icon.getImage();
	static Image newpl2image = pl2image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl2iconhover = new ImageIcon("rec/pl2-hover.png");
	static Image pl2imagehover = pl2iconhover.getImage();
	static Image newpl2imagehover = pl2imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl3icon = new ImageIcon("rec/pl3.png");
	static Image pl3image = pl3icon.getImage();
	static Image newpl3image = pl3image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl3iconhover = new ImageIcon("rec/pl3-hover.png");
	static Image pl3imagehover = pl3iconhover.getImage();
	static Image newpl3imagehover = pl3imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl4icon = new ImageIcon("rec/pl4.png");
	static Image pl4image = pl4icon.getImage();
	static Image newpl4image = pl4image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl4iconhover = new ImageIcon("rec/pl4-hover.png");
	static Image pl4imagehover = pl4iconhover.getImage();
	static Image newpl4imagehover = pl4imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl5icon = new ImageIcon("rec/pl5.png");
	static Image pl5image = pl5icon.getImage();
	static Image newpl5image = pl5image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl5iconhover = new ImageIcon("rec/pl5-hover.png");
	static Image pl5imagehover = pl5iconhover.getImage();
	static Image newpl5imagehover = pl5imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl6icon = new ImageIcon("rec/pl6.png");
	static Image pl6image = pl6icon.getImage();
	static Image newpl6image = pl6image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl6iconhover = new ImageIcon("rec/pl6-hover.png");
	static Image pl6imagehover = pl6iconhover.getImage();
	static Image newpl6imagehover = pl6imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl7icon = new ImageIcon("rec/pl7.png");
	static Image pl7image = pl7icon.getImage();
	static Image newpl7image = pl7image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl7iconhover = new ImageIcon("rec/pl7-hover.png");
	static Image pl7imagehover = pl7iconhover.getImage();
	static Image newpl7imagehover = pl7imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl8icon = new ImageIcon("rec/pl8.png");
	static Image pl8image = pl8icon.getImage();
	static Image newpl8image = pl8image.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon pl8iconhover = new ImageIcon("rec/pl8-hover.png");
	static Image pl8imagehover = pl8iconhover.getImage();
	static Image newpl8imagehover = pl8imagehover.getScaledInstance(230, 150, Image.SCALE_AREA_AVERAGING);
	
	
	static ImageIcon menuiconhover = new ImageIcon("rec/menu-hover.png");
	static Image menuimagehover = menuiconhover.getImage();
	static Image newmenuimagehover = menuimagehover.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	
	static ImageIcon menuicon = new ImageIcon("rec/menu.png");
	static Image menuimage = menuicon.getImage();
	static Image newmenuimage = menuimage.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon tryagainiconhover = new ImageIcon("rec/tryagain-hover.png");
	static Image tryagainimagehover = tryagainiconhover.getImage();
	static Image newtryagainimagehover = tryagainimagehover.getScaledInstance(200, 80, Image.SCALE_AREA_AVERAGING);
	
	
	static ImageIcon tryagainicon = new ImageIcon("rec/tryagain.png");
	static Image tryagainimage = tryagainicon.getImage();
	static Image newtryagainimage = tryagainimage.getScaledInstance(200, 80, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon crediticonbg = new ImageIcon("rec/bg-credit.png");
	static Image creditimagebg = crediticonbg.getImage();
	static Image newcreitimagebg = creditimagebg.getScaledInstance(1000, 600, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon customiconbg = new ImageIcon("rec/bg-custom.png");
	static Image customimagebg = customiconbg.getImage();
	static Image newcustomimagebg = customimagebg.getScaledInstance(1000, 600, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon icon = new ImageIcon("rec/bg.png");
	static Image image = icon.getImage();
	static Image newimage = image.getScaledInstance(1000, 600, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon howtoplayicon = new ImageIcon("rec/howtoplay.png");
	static Image howtoplayimage = howtoplayicon.getImage();
	static Image newhowtoplayimage = howtoplayimage.getScaledInstance(270, 250, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon takeofficonhover = new ImageIcon("rec/takeoff-hover.png");
	static Image takeoffimagehover = takeofficonhover.getImage();
	static Image newtakeoffimagehover = takeoffimagehover.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon takeofficon = new ImageIcon("rec/takeoff.png");
	static Image takeoffimage = takeofficon.getImage();
	static Image newtakeoffimage = takeoffimage.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);

	static ImageIcon takeofficondis = new ImageIcon("rec/takeoff-disabled.png");
	static Image takeoffimagedis = takeofficondis.getImage();
	static Image newtakeoffimagedis = takeoffimagedis.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon landiconhover = new ImageIcon("rec/land-hover.png");
	static Image landimagehover = landiconhover.getImage();
	static Image newlandimagehover = landimagehover.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon landicon = new ImageIcon("rec/land.png");
	static Image landimage = landicon.getImage();
	static Image newlandimage = landimage.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static ImageIcon landicondis = new ImageIcon("rec/land-disabled.png");
	static Image landimagedis = landicondis.getImage();
	static Image newlandimagedis = landimagedis.getScaledInstance(120, 40, Image.SCALE_AREA_AVERAGING);
	
	static String url = "rec/plane1.png";
	
	static public boolean game = false;
	static int tempX = 0;
	static int tempY = 0;
	static JLabel tryagain = new JLabel();
	
	public static void showtryagain()
	{
		if(Plane.lose == true)
		{
			tryagain.setVisible(true);
		}
		
	}
	
	public static String geturl()
	{
		return url;
	}
	
	//main
	public static void main(String[] args) {
		
		crediticon = new ImageIcon(newcreditimage);
		crediticonhover = new ImageIcon(newcreditimagehover);
		customicon = new ImageIcon(newcustomimage);
		customiconhover = new ImageIcon(newcustomimagehover);
		playicon = new ImageIcon(newplayimage);
		backicon = new ImageIcon(newbackimage);
		backiconhover = new ImageIcon(newbackimagehover);
		playiconhover = new ImageIcon(newplayimagehover);
		title1icon = new ImageIcon(newtitle1image);
		title2icon = new ImageIcon(newtitle2image);
		pl1icon = new ImageIcon(newpl1image);
		pl1iconhover = new ImageIcon(newpl1imagehover);
		pl2icon = new ImageIcon(newpl2image);
		pl2iconhover = new ImageIcon(newpl2imagehover);
		pl3icon = new ImageIcon(newpl3image);
		pl3iconhover = new ImageIcon(newpl3imagehover);
		pl4icon = new ImageIcon(newpl4image);
		pl4iconhover = new ImageIcon(newpl4imagehover);
		pl5icon = new ImageIcon(newpl5image);
		pl5iconhover = new ImageIcon(newpl5imagehover);
		pl6icon = new ImageIcon(newpl6image);
		pl6iconhover = new ImageIcon(newpl6imagehover);
		pl7icon = new ImageIcon(newpl7image);
		pl7iconhover = new ImageIcon(newpl7imagehover);
		pl8icon = new ImageIcon(newpl8image);
		pl8iconhover = new ImageIcon(newpl8imagehover);
		menuicon = new ImageIcon(newmenuimage);
		menuiconhover = new ImageIcon(newmenuimagehover);
		crediticonbg = new ImageIcon(newcreitimagebg);
		customiconbg = new ImageIcon(newcustomimagebg);
		tryagainicon = new ImageIcon(newtryagainimage);
		tryagainiconhover = new ImageIcon(newtryagainimagehover);
		howtoplayicon = new ImageIcon(newhowtoplayimage);
		takeofficon = new ImageIcon(newtakeoffimage);
		takeofficonhover = new ImageIcon(newtakeoffimagehover);
		takeofficondis = new ImageIcon(newtakeoffimagedis);
		landicon = new ImageIcon(newlandimage);
		landiconhover = new ImageIcon(newlandimagehover);
		landicondis = new ImageIcon(newlandimagedis);
		icon = new ImageIcon(newimage);
		
		//frame and background image
		JFrame frame = new JFrame();
		Plane p = new Plane(frame);
		JLabel menu = new JLabel();
		JLabel takeoff = new JLabel();
		JLabel move = new JLabel();
		JLabel howtoplay = new JLabel();
		menu.setLayout(null);
		menu.setBounds(10, 10, 120, 40);
		menu.setIcon(menuicon);
		menu.setFocusable(false);
		menu.setVisible(false);
		takeoff.setLayout(null);
		takeoff.setBounds(850, 10, 120, 40);
		takeoff.setIcon(takeofficon);
		takeoff.setFocusable(false);
		takeoff.setVisible(false);
		howtoplay.setLayout(null);
		howtoplay.setBounds(360, 80, 270, 250);
		howtoplay.setIcon(howtoplayicon);
		howtoplay.setFocusable(false);
		howtoplay.setVisible(false);
		tryagain.setLayout(null);
		tryagain.setBounds(400, 500, 200, 80);
		tryagain.setIcon(tryagainicon);
		tryagain.setFocusable(false);
		tryagain.setVisible(true);
		tryagain.setVisible(false);
		frame.add(move);
		frame.add(howtoplay);
		frame.add(takeoff);
		frame.add(menu);
		frame.add(tryagain);
		frame.getContentPane().add(p);
		//frame.setLayout(null);
		frame.pack();
  	    frame.setLocationByPlatform(true);
		frame.setTitle("AirDrop Master");
		frame.setBounds(200, 50, 1000, 635);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 635);
		panel.setLayout(null);
		JLabel background = new JLabel();
		background.setSize(1000, 600);
		background.setIcon(icon);
		//panel.add(background);
		
		//title
		JLabel title2 = new JLabel();
		title2.setBounds(550, 150, 300, 110);
		title2.setIcon(title2icon);
		title2.setFocusable(true);
		panel.add(title2);
		JLabel title1 = new JLabel();
		title1.setBounds(270, 70, 400, 150);
		title1.setIcon(title1icon);
		title1.setFocusable(true);
		panel.add(title1);
		
		
		//play button
		JLabel play = new JLabel();
		play.setBounds(150, 450, 200, 70);
		play.setIcon(playicon);
		play.setFocusable(true);
		panel.add(play);
		
		
		//custom button
		JLabel custom = new JLabel();
		custom.setBounds(400, 450, 200, 70);
		custom.setIcon(customicon);
		custom.setFocusable(true);
		panel.add(custom);

		
		//credit button
		JLabel credit = new JLabel();
		credit.setBounds(650, 450, 200, 70);
		credit.setIcon(crediticon);
		credit.setFocusable(true);
		panel.add(credit);
		
		
		//back button
		JLabel back = new JLabel();
		back.setBounds(50, 50, 200, 70);
		back.setIcon(backicon);
		back.setFocusable(true);
		back.setVisible(false);
		panel.add(back);
			
		//customize plane1
		JLabel pl1 = new JLabel();
		pl1.setBounds(12, 250, 230, 150);
		pl1.setIcon(pl1icon);
		pl1.setFocusable(true);
		panel.add(pl1);
		pl1.setVisible(false);
		
		
		//customize plane2
		JLabel pl2 = new JLabel();
		pl2.setBounds(254, 250, 230, 150);
		pl2.setIcon(pl2icon);
		pl2.setFocusable(true);
		panel.add(pl2);
		pl2.setVisible(false);
		
		
		//customize plane3
		JLabel pl3 = new JLabel();
		pl3.setBounds(496, 250, 230, 150);
		pl3.setIcon(pl3icon);
		pl3.setFocusable(true);
		panel.add(pl3);
		pl3.setVisible(false);
		
		//customize plane4
		JLabel pl4 = new JLabel();
		pl4.setBounds(738, 250, 230, 150);
		pl4.setIcon(pl4icon);
		pl4.setFocusable(true);
		panel.add(pl4);
		pl4.setVisible(false);
		
		
		//customize plane5
		JLabel pl5 = new JLabel();
		pl5.setBounds(12, 412, 230, 150);
		pl5.setIcon(pl5icon);
		pl5.setFocusable(true);
		panel.add(pl5);
		pl5.setVisible(false);
		
		
		//customize plane6
		JLabel pl6 = new JLabel();
		pl6.setBounds(254, 412, 230, 150);
		pl6.setIcon(pl6icon);
		pl6.setFocusable(true);
		panel.add(pl6);
		pl6.setVisible(false);
		
		
		//customize plane7
		JLabel pl7 = new JLabel();
		pl7.setBounds(496, 412, 230, 150);
		pl7.setIcon(pl7icon);
		pl7.setFocusable(true);
		panel.add(pl7);
		pl7.setVisible(false);
		
		
		//customize plane8
		JLabel pl8 = new JLabel();
		pl8.setBounds(738, 412, 230, 150);
		pl8.setIcon(pl8icon);
		pl8.setFocusable(true);
		panel.add(pl8);
		pl8.setVisible(false);
		
		//plane movement
		move.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
				if(arg0.getKeyChar() == 'z')
				{
					
					
					Plane.up = false;
					
				}
				if(arg0.getKeyChar() == 's')
				{
				
					
					Plane.down = false;
					
				}
				if(arg0.getKeyChar() == 'q')
				{
					
					
					Plane.right = false;
					
				}
				if(arg0.getKeyChar() == 'd')
				{
					
					
					Plane.left = false;
					
				}
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				if(arg0.getKeyChar() == 'z')
				{
					Plane.up();
					
				}
				if(arg0.getKeyChar() == 's')
				{
					Plane.down();
					
				}
				if(arg0.getKeyChar() == 'q')
				{
					Plane.right();
					
				}
				if(arg0.getKeyChar() == 'd')
				{
					Plane.left();
					
				}
				
				
				
			}
		});
		
		
		
		
				
				
				
				pl1.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl1.setIcon(pl1iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl1.setIcon(pl1icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl1.setIcon(pl1icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl1.setIcon(pl1iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane1.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				pl2.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl2.setIcon(pl2iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl2.setIcon(pl2icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl2.setIcon(pl2icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl2.setIcon(pl2iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane2.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				pl3.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl3.setIcon(pl3iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl3.setIcon(pl3icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl3.setIcon(pl3icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl3.setIcon(pl3iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane3.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				
				pl4.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl4.setIcon(pl4iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl4.setIcon(pl4icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl4.setIcon(pl4icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl4.setIcon(pl4iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane4.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				
				pl5.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl5.setIcon(pl5iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl5.setIcon(pl5icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl5.setIcon(pl5icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl5.setIcon(pl5iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane5.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				
				pl6.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl6.setIcon(pl6iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl6.setIcon(pl6icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl6.setIcon(pl6icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl6.setIcon(pl6iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane6.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				
				
				pl7.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl7.setIcon(pl7iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl7.setIcon(pl7icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl7.setIcon(pl7icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl7.setIcon(pl7iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane7.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				
				
				pl8.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						pl8.setIcon(pl8iconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						pl8.setIcon(pl8icon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						pl8.setIcon(pl8icon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						pl8.setIcon(pl8iconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						url = "rec/plane8.png";
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						back.setVisible(false);
						play.setVisible(true);
						custom.setVisible(true);
						credit.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						background.setIcon(icon);
						Plane.initialization();
					}
				});
				
				
				//action listeners
				
				play.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						play.setIcon(playiconhover);
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						play.setIcon(playicon);
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						play.setIcon(playicon);
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						play.setIcon(playiconhover);
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
					
						
						play.setVisible(false);
						credit.setVisible(false);
						custom.setVisible(false);
						title1.setVisible(false);
						title2.setVisible(false);
						menu.setVisible(true);
						back.setVisible(false);
						takeoff.setVisible(true);
						howtoplay.setVisible(true);
						p.setVisible(true);
						Plane.initialization();
						game = true;
						Plane.timenow = System.currentTimeMillis();
						//frame.remove(panel);
						move.setFocusable(true);
						
						
						
						
						
						
					
						/*ImageIcon bgicon = new ImageIcon("C:/Users/Salaheddine/Desktop/bg-game.png");
						Image bgimage = bgicon.getImage();
						Image newbgimage = bgimage.getScaledInstance(6000, 635, Image.SCALE_AREA_AVERAGING);
						bgicon = new ImageIcon(newbgimage);
						
						background.setIcon(bgicon);*/
						
						
						
					}
				});
				
				credit.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						
						credit.setIcon(crediticonhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						credit.setIcon(crediticon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						credit.setIcon(crediticon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						credit.setIcon(crediticonhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						title1.setVisible(false);
						title2.setVisible(false);
						play.setVisible(false);
						credit.setVisible(false);
						custom.setVisible(false);
						back.setVisible(true);
						move.setFocusable(true);
						background.setIcon(crediticonbg);
					}
				});	



				custom.addMouseListener(new MouseListener() {
	
					@Override
					public void mouseReleased(MouseEvent arg0) {
						custom.setIcon(customiconhover);
					}
	
					@Override
					public void mousePressed(MouseEvent arg0) {
						custom.setIcon(customicon);
					}
	
					@Override
					public void mouseExited(MouseEvent arg0) {
						custom.setIcon(customicon);
					}
	
					@Override
					public void mouseEntered(MouseEvent arg0) {
						custom.setIcon(customiconhover);
					}
	
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
					
						credit.setVisible(false);
						custom.setVisible(false);
						howtoplay.setVisible(false);
						play.setVisible(false);
						back.setVisible(true);
						title1.setVisible(false);
						title2.setVisible(false);
						pl1.setVisible(true);
						pl2.setVisible(true);
						pl3.setVisible(true);
						pl4.setVisible(true);
						pl5.setVisible(true);
						pl6.setVisible(true);
						pl7.setVisible(true);
						pl8.setVisible(true);
						
						background.setIcon(customiconbg);
						
					}
				});
				
				back.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						back.setIcon(backiconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						back.setIcon(backicon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						back.setIcon(backicon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						back.setIcon(backiconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						credit.setVisible(true);
						custom.setVisible(true);
						play.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						back.setVisible(false);
						howtoplay.setVisible(false);
						menu.setVisible(false);
						takeoff.setVisible(false);
						pl1.setVisible(false);
						pl2.setVisible(false);
						pl3.setVisible(false);
						pl4.setVisible(false);
						pl5.setVisible(false);
						pl6.setVisible(false);
						pl7.setVisible(false);
						pl8.setVisible(false);
						background.setIcon(icon);
						move.setFocusable(true);
					}
				});
				
				menu.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						menu.setIcon(menuiconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						menu.setIcon(menuicon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						menu.setIcon(menuicon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						menu.setIcon(menuiconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						p.setVisible(false);
						play.setVisible(true);
						credit.setVisible(true);
						custom.setVisible(true);
						title1.setVisible(true);
						title2.setVisible(true);
						menu.setVisible(false);
						takeoff.setVisible(false);
						back.setVisible(false);
						howtoplay.setVisible(false);
						tryagain.setVisible(false);
						move.setFocusable(true);
						Plane.initialization();
					}
				});
				
				tryagain.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						tryagain.setIcon(tryagainiconhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						tryagain.setIcon(tryagainicon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						tryagain.setIcon(tryagainicon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						tryagain.setIcon(tryagainiconhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						tryagain.setVisible(false);
						howtoplay.setVisible(true);
						move.setFocusable(true);
						Plane.initialization();
					}
				});
				
				takeoff.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						takeoff.setIcon(takeofficonhover);
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						takeoff.setIcon(takeofficon);
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						
						takeoff.setIcon(takeofficon);
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						
						takeoff.setIcon(takeofficonhover);
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
						
						takeoff.setVisible(false);
						howtoplay.setVisible(false);
						Plane.timenow = System.currentTimeMillis();
						Plane.takeoff = true;
					}
				});
				
				
				
				
		panel.add(background);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

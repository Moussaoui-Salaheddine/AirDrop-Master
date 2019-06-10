package pk.air;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Plane extends JComponent {

	private static final long serialVersionUID = 1L;

	static Image image;
	static Image mine;
	static Image bg;
	static Image bglost;
	static Image cloud1;
	static Image cloud2;
	static Image cloud3;
	static Image cloud4;

	static int i = 1;

	static int planeheight = 480;
	static int planewidth = 850;

	static int renderX = planewidth - i;
	static int renderY = planeheight;

	static boolean takeoff = false;
	static boolean land = false;

	static long currentime = 0;
	static long timenow = 0;

	static int cloud1X = -70;
	static int cloud1Y = 100;

	static int cloud2X = -70;
	static int cloud2Y = 300;

	static int cloud3X = -70;
	static int cloud3Y = 50;

	static int cloud4X = -70;
	static int cloud4Y = 250;

	static boolean update1 = false;
	static boolean update2 = false;
	static boolean update3 = false;
	static boolean update4 = false;

	static boolean up = false;
	static boolean down = false;
	static boolean right = false;
	static boolean left = false;

	static boolean lose = false;

	static int nbcloud = 0;
	static int nbmine = -1;

	static Random R = new Random();

	static int mineX1[] = new int[30];
	static int mineY1[] = new int[30];

	public Plane(JFrame frame) {

		initialization();

		new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				i = i + 2;

				// plane movements
				if (up == true) {
					planeheight = planeheight - 4;
				}
				if (down == true) {
					planeheight = planeheight + 4;
				}
				if (right == true) {
					renderX = renderX - 4;
				}
				if (left == true) {
					renderX = renderX + 4;
				}

				repaint();

			}
		}).start();
	}

	public static void up() {
		up = true;
	}

	public static void down() {
		down = true;
	}

	public static void right() {
		right = true;
	}

	public static void left() {
		left = true;
	}

	// initialization
	public static void initialization() {
		timenow = System.currentTimeMillis();
		nbcloud = 0;
		nbmine = -1;
		lose = false;
		takeoff = false;
		land = false;
		update1 = false;
		update2 = false;
		update3 = false;
		update4 = false;
		planeheight = 480;
		renderX = 850;
		for (int j = 0; j < 30; j++) {
			mineX1[j] = -70;
			mineY1[j] = R.nextInt(595) + 1;
		}
		cloud1X = -70;
		cloud1Y = 100;

		cloud2X = -70;
		cloud2Y = 300;

		cloud3X = -70;
		cloud3Y = 50;

		cloud4X = -70;
		cloud4Y = 250;

		try {
			Image bgimage = ImageIO.read(new File("rec/bg-game.png"));
			bg = bgimage.getScaledInstance(1000, 600, Image.SCALE_AREA_AVERAGING);
			Image bglostimage = ImageIO.read(new File("rec/bg-lost.png"));
			bglost = bglostimage.getScaledInstance(1000, 600, Image.SCALE_AREA_AVERAGING);
			Image mineimage = ImageIO.read(new File("rec/mine.png"));
			mine = mineimage.getScaledInstance(50, 40, Image.SCALE_AREA_AVERAGING);
			Image cloud1image = ImageIO.read(new File("rec/cloud1.png"));
			cloud1 = cloud1image.getScaledInstance(80, 50, Image.SCALE_AREA_AVERAGING);
			cloud4 = cloud1image.getScaledInstance(100, 70, Image.SCALE_AREA_AVERAGING);
			Image cloud2image = ImageIO.read(new File("rec/cloud2.png"));
			cloud2 = cloud2image.getScaledInstance(80, 50, Image.SCALE_AREA_AVERAGING);
			cloud3 = cloud2image.getScaledInstance(100, 70, Image.SCALE_AREA_AVERAGING);
			Image newplaneimage = ImageIO.read(new File(AirDrop.geturl()));
			image = newplaneimage.getScaledInstance(70, 35, Image.SCALE_AREA_AVERAGING);
		} catch (IOException e) {

		}
	}
	// end initialization

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (AirDrop.game == true) {

			g.drawImage(bg, 0, 0, this);
			g.drawImage(image, renderX, planeheight, this);

			// plane limits
			if (renderX >= 910) {
				renderX = 910;
				update2 = true;

			}
			if (renderX <= 0) {
				renderX = 0;
			}
			if (planeheight >= 555) {
				planeheight = 555;
			}
			if (planeheight < 0) {
				planeheight = 0;
			}

			// cloud generating

			if (nbcloud >= 0) {
				g.drawImage(cloud1, cloud1X, cloud1Y, this);
				cloud1X = cloud1X + 2;
				if (cloud1X >= 1050) {
					cloud1X = -70;
				}
			}
			if (nbcloud >= 1) {
				g.drawImage(cloud2, cloud2X, cloud2Y, this);
				cloud2X = cloud2X + 1;
				if (cloud2X >= 1050) {
					cloud2X = -70;
				}
			}
			if (nbcloud >= 2) {
				g.drawImage(cloud3, cloud3X, cloud3Y, this);
				cloud3X = cloud3X + 2;
				if (cloud3X >= 1050) {
					cloud3X = -70;
				}
			}
			if (nbcloud >= 3) {
				g.drawImage(cloud4, cloud4X, cloud4Y, this);
				cloud4X = cloud4X + 1;
				if (cloud4X >= 1050) {
					cloud4X = -70;
				}
			}

			currentime = System.currentTimeMillis() - timenow;
			if (currentime % 500 == 0 && nbcloud < 5) {
				nbcloud++;
				if (nbcloud == 0) {
					cloud1X = -70;
				}
				if (nbcloud == 1) {
					cloud2X = -70;
				}
				if (nbcloud == 2) {
					cloud3X = -70;
				}
				if (nbcloud == 3) {
					cloud4X = -70;
				}
			}

			// end cloud generating

			if (takeoff == true) {
				// Plane Taking off
				currentime = System.currentTimeMillis() - timenow;
				if (renderX > 50 && update1 == false) {
					planeheight = planeheight - 1;
					renderX = renderX - 3;
				}
				if ((renderX <= 50 || update1 == true) && update2 == false) {
					update1 = true;
					renderX = renderX + 6;
					cloud1X = cloud1X + 6;
					cloud2X = cloud2X + 5;
					cloud3X = cloud3X + 6;
					cloud4X = cloud4X + 5;
				}

				// mine generating
				if (nbmine > 30) {
					nbmine = 30;
				}
				for (int i = 0; i < nbmine; i++) {

					g.drawImage(mine, mineX1[i], mineY1[i], this);
					mineX1[i] = mineX1[i] + 3;

					if (mineX1[i] > 1070) {
						mineX1[i] = -70;
						mineY1[i] = R.nextInt(595) + 1;
					}

					if ((renderX >= mineX1[i] - 70 && renderX <= mineX1[i] + 30)
							&& (planeheight >= mineY1[i] - 20 && planeheight <= mineY1[i] + 30)) {
						lose = true;
					}

				}

				if (update2 == true && currentime % 200 == 0 && nbmine < 30) {
					nbmine++;
				}
				// end mine generating

				if (land == true) {
					takeoff = false;

					update3 = true;

					if (update3 == true) {
						if (renderX <= 900) {

							renderX = renderX + 6;
						}
						if (renderX >= 900) {
							planeheight = planeheight + 1;
							renderX = renderX - 3;
						}
					}

				}

				if (lose == true) {
					g.drawImage(bglost, 0, 0, this);
					AirDrop.showtryagain();
				}
			}

		}

	}
}

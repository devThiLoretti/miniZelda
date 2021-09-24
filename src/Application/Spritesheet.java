package Application;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	public static BufferedImage spritesheet;
	public static BufferedImage[] player_front; 
	public static BufferedImage tileWall;
	public static BufferedImage[] enemy_front;
	
	public Spritesheet() {
		try {
		spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		player_front = new BufferedImage[2];
		enemy_front = new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		
		enemy_front[0] = Spritesheet.getSprite(159, 211, 16, 16);
		enemy_front[1] = Spritesheet.getSprite(177, 211, 16, 16);
		
		tileWall = Spritesheet.getSprite(172, 185, 16, 16);
	}
	
	//159, 211
	//177, 211
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}

}

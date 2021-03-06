import java.awt.Graphics;
import java.awt.Image;
/**
 * @author Zach Williamson, Erik Cole, Jonathan Light
 */

/**
 * A Sprite that will be displayed on the screen.
 * A Sprite may have multiple states that correspond to different display styles of the sprite.
 * The state of a sprite will change based on the action being performed by the object a sprite represents.  
 * 
 * @author Zach Williamson
 *
 */
public class Sprite {
	/******************************************************
	 * Member variables                                   *
	 ******************************************************/
	
	/**
	 * store all of the images available to this sprite
	 */
	private Image image;
	
	/******************************************************
	 * Constructors                                       *
	 ******************************************************/
	
	/**
	 * create a new sprite using a single image
	 * @param image the image for the new sprite
	 */
	public Sprite(Image spriteImage)
	{
		image = spriteImage;
	}
	
	/******************************************************
	 * Getters                                            *
	 ******************************************************/
	
	/**
	 * get the current width of the sprite
	 * @return the current width of the sprite
	 */
	public int getWidth(){return image.getWidth(null);}
	
	/**
	 * get the current height of the sprite
	 * @return the current height of the sprite
	 */
	public int getHeight(){return image.getHeight(null);}
	
	/******************************************************
	 * Mutators                                           *
	 ******************************************************/
	
	/**
	 * display the sprite at a certain location
	 * @param g the graphics to use to display the sprite
	 * @param x the x location to display the sprite 
	 * @param y the y location to display the sprite
	 */
	public void draw(Graphics g, int x, int y)
	{
		g.drawImage(image,x,y,null);
	}
}

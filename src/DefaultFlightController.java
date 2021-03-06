import java.util.Random;

/**
 * 
 */

/**
 * @author Zach Williamson, Erik Cole, Jonathan Light
 *
 */
public class DefaultFlightController extends FlightController {
	
	Random random;
	public void go()
	{
		for(Enemy e: ships)
		{
			e.setXSpeed(FlightController.xSpeed);
		}
		random = new Random();
		super.go();
	}
	
	@Override
	public void update(long delta) {
		if(isPaused == false)
		{
			if(random.nextInt(1000) < 8)
			{
				ships.get(random.nextInt(ships.size()-1)).tryToFireSlow(System.currentTimeMillis());
			}
			
			for(Enemy e : ships)
			{
				e.setXSpeed(FlightController.xSpeed);
				e.setY(FlightController.mainY + yOffset);
			}
			
			boolean changeDirection = false;
			for(Enemy e: ships)
			{
				if((e.getX() < 0 && e.getXSpeed() < 0)|| (e.getX() > Game.gameDimensions.getWidth()-e.getSprite().getWidth() && e.getXSpeed() > 0))
				{
					changeDirection = true;
				}
			}
			if(changeDirection)
			{
				FlightController.xSpeed = -1*FlightController.xSpeed;
				FlightController.mainY += FlightController.yIncrement;
				for(Enemy e: ships)
				{
					e.setXSpeed(FlightController.xSpeed);
					e.setY(FlightController.mainY + yOffset);
				}
			}
		}
	}

}

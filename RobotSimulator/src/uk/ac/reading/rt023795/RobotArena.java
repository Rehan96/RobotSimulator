/**
 * 
 */
package uk.ac.reading.rt023795;
import java.util.Random;

/**
 * @author rehankhan
 *
 */
public class RobotArena {

	private int xmax;		// defines size of arena in x direction 	
	private int ymax;		// defines size of arena in y direction
	private static int ID;	// unique id for each robot
	private static int maxNumR;		// defines maximum number of robots in arena 
	
	Robot b;
	Robot c;
	
	
	RobotArena (int xs, int ys, int id, int maxNumR, Random r) {		// constructor to initialise variables above
		xmax = xs;
		ymax = ys;
		ID = id;
		this.maxNumR = 5;
		
		b = new Robot(r.nextInt(xmax), r.nextInt(ymax));
		c = new Robot(r.nextInt(xmax), r.nextInt(ymax));
	
}
	
	public String toString() {
		return "Arena size is " + xmax  + " by " + ymax + " with " + b.toString() + c.toString() + " with max num of robots being " + maxNumR;
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		RobotArena ra = new RobotArena (10, 12, ID, maxNumR, r);
		System.out.println(ra.toString());

	}

		
	}



/**
 * 
 */
package uk.ac.reading.rt023795;
import java.util.Scanner;

/**
 * @author hassanashraf
 *
 */

public class Robot {

	private int x;
	private int y;		// x and y position of the robot
	public static int ID;		// unique identifier 
	public Robot () {
		ID++;
	}
	
	public void printCounter() {
		System.out.println(ID);
		}
	
	public Robot (int sx, int sy) {
		x = sx;
		y = sy;

		
	}
	
	public String toString () {
		return "Robot ID is " + ID++ + "," + " Robot at " + x + ", " + y;
		
	}
	
	public static void main(String[] args) {
			
		Scanner s = new Scanner (System.in);
				System.out.print("How many robots in your world ?");
				int numRobots = s.nextInt();
				Robot [ ] allRobots = new Robot[numRobots];
				int sx, sy;
				System.out.println("Now enter position of each robot in turn (as x y) >");
				for (int ct=0; ct<numRobots; ct++) {
					System.out.print("Enter x,y position for " + ct + "th robot >");
					sx = s.nextInt();
					sy = s.nextInt();
					allRobots[ct] = new Robot(sx, sy);
				}
				for (int ct=0; ct<numRobots; ct++)
					System.out.println(allRobots[ct].toString());
				s.close();
					
				}
}



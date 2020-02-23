/**
 * 
 */
package uk.ac.reading.rt023795;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 * @author rehankhan
 *
 */

public class GameBall extends Ball {

	double bAngle, bSpeed;			// angle and speed of travel
	Text t = new Text();
	
	
	/**
	 * 
	 */
	public GameBall() {
		// TODO Auto-generated constructor stub
	}

	/** Create game ball, size ir ay ix,iy, moving at angle ia and speed is
	 * @param ix
	 * @param iy
	 * @param ir
	 * @param ia
	 * @param is
	 */
	public GameBall(double ix, double iy, double ir, double ia, double is) {
		super(ix, iy, ir);
		bAngle = ia;
		bSpeed = is;
		
	}

	/**
	 * checkball - change angle of travel if hitting wall or another ball
	 * @param b   ballArena
	 */
	@Override
	protected void checkBall(BallArena b) {
		bAngle = b.CheckBallAngle(x, y, rad, bAngle, ballID);
		t.setText("This is a text sample");
	}

	/**
	 * adjustBall
	 * Here, move ball depending on speed and angle
	 */
	@Override
	protected void adjustBall() {
		double radAngle = bAngle*Math.PI/180;		// put angle in radians
		x += bSpeed * Math.cos(radAngle);		// new X position
		y += bSpeed * Math.sin(radAngle);		// new Y position
	}
	/**
	 * return string defining ball type
	 */
	protected String getStrType() {
		return "Game ball";
	}

}

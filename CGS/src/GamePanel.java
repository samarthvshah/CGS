import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import processing.core.PApplet;


public class GamePanel extends PApplet{
	
	
	private final float DRAWING_WIDTH = 1000, DRAWING_HEIGHT = 500;
	private int coins;
	
	public void printGame() {
		System.out.println("game panel");
	}
	
	public void draw()
	{
		background(255);
		pushMatrix();
		pushStyle();
		
		
		
		
		float scaleW = width / DRAWING_WIDTH;
		float scaleH = height / DRAWING_HEIGHT;
		scale(scaleW,scaleH);
		//flightSim.draw(this);
		popStyle();
		popMatrix();
	}
	
	public int getCoins() {
		return coins;
	}
}
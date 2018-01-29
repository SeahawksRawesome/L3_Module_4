package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String [] args) {
		Robot timmy = new Robot(500, 250);
		Robot tammy = new Robot(800, 250);
		Robot sammy = new Robot(1100, 250);
		Robot ricky = new Robot(650, 400);
		Robot slicky = new Robot(950, 400);
		
		timmy.setSpeed(100);
		tammy.setSpeed(100);
		sammy.setSpeed(100);
		ricky.setSpeed(100);
		slicky.setSpeed(100);
		
		timmy.penDown();
		timmy.setPenColor(100, 0, 0);
		tammy.penDown();
		tammy.setPenColor(100, 0, 0);
		sammy.penDown();
		sammy.setPenColor(100, 0, 0);
		ricky.penDown();
		ricky.setPenColor(100, 0, 0);
		slicky.penDown();
		slicky.setPenColor(100, 0, 0);
		
		new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				timmy.move(2); timmy.turn(1);
			}
			
		}).start();
		new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				slicky.move(2); slicky.turn(1);
			}
			
		}).start();
		new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				tammy.move(2); tammy.turn(1);
			}
			
		}).start();
		new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				sammy.move(2); sammy.turn(1);
			}
			
		}).start();
		new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				ricky.move(2); ricky.turn(1);
			}
			
		}).start();
		//new Thread(()->tammy.move(400)).start();
		//new Thread(()->sammy.move(400)).start();
	
		
	}
	
}


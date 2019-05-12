package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		Robot robot2 = new Robot();
		Robot robot3 = new Robot();
		Robot robot4 = new Robot();
		Robot robot5 = new Robot();
		robot1.moveTo(400, 500);
		robot2.moveTo(500, 500);
		robot3.moveTo(600, 500);
		robot4.moveTo(700, 500);
		robot5.moveTo(800, 500);
		robot1.penDown();
		robot2.penDown();
		robot3.penDown();
		robot4.penDown();
		robot5.penDown();
		Thread t1 = new Thread(()->{
			for(int i = 0;i<360;i++) {
				robot1.turn(1);
				robot1.move(1);
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0;i<360;i++) {
				robot2.turn(1);
				robot2.move(1);
			}
		});
		Thread t3 = new Thread(()->{
			for(int i = 0;i<360;i++) {
				robot3.turn(1);
				robot3.move(1);
			}
		});
		Thread t4 = new Thread(()->{
			for(int i = 0;i<360;i++) {
				robot4.turn(1);
				robot4.move(1);
			}
		});
		Thread t5 = new Thread(()->{
			for(int i = 0;i<360;i++) {
				robot5.turn(1);
				robot5.move(1);
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	
}


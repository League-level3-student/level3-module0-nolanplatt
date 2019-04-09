package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	boolean top = false;
	//1. make a main method
	
	public static void main(String[] args) {
		_01_RobotRace rr = new _01_RobotRace();
		rr.robots();
	}
	
	void robots() {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(20);
			robots[i].moveTo(i * 95, 540);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		
		
	
		
		while(robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0 && robots[4].getY() > 0) {
			for (int i = 0; i < robots.length; i++) {	
			Random random = new Random();
			int randomResult = random.nextInt(50);
			robots[i].move(randomResult);
			
			
		}
			
			}
				while(!top) {
					for (int i = 0; i < robots.length; i++) {
						if(robots[0].getY() < 0 && robots[1].getY() < 0 && robots[2].getY() < 0 && robots[3].getY() < 0 && robots[4].getY() < 0) {
							System.out.println("Robot "+i + " won!");
							top = true;
							break;
							
						}
					}
				}
		

			
		
		
		
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
		
	}

}

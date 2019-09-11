package _01_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car = new RaceCar(null, 5);
		// 2. Print the RaceCar's position in the race
JOptionPane.showMessageDialog(null, car.getPositionInRace());
		// 3. Crash the RaceCar
		car.crash();
		JOptionPane.showMessageDialog(null, "Your car crashed");
		// 4. If the car is damaged. Bring it in for a pit stop.
if (car.isDamaged()) {
	JOptionPane.showMessageDialog(null, "Your car is damaged");
	car.pit();
}

		// 5. Help the car move into first place.
if (car.getPositionInRace()==1) {
	
}
else {
car.overtake();
car.overtake();
car.overtake();
car.overtake();
car.overtake();
car.overtake();
car.overtake();
car.crash();
	}
}
}
	

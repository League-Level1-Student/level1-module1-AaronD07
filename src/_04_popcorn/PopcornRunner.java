package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		String time = JOptionPane.showInputDialog("How long should it be cooked?");
		int time2 = Integer.parseInt(time);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(time2);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
}
}
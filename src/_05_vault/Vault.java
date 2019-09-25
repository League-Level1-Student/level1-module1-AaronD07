package _05_vault;
import javax.swing.JOptionPane;

public class Vault {
	public static void main(String[] args) {
		Vault vault = new Vault();
		JOptionPane.showMessageDialog(null, vault.tryCode(123442)+ "");
		JOptionPane.showMessageDialog(null, vault.tryCode(252978)+ "");
	}
	int combination = 252978;
	boolean tryCode(int guess) {
		if (guess == combination) {
			return(true);
		}
		else {
			return(false);
		}
	}
}




	




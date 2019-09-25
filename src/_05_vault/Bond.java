package _05_vault;
import javax.swing.JOptionPane;

public class Bond {
	public static void main(String[] args) {
		Bond bond = new Bond();
		
		JOptionPane.showMessageDialog(null, bond.crackVault());
	}
	Vault vault = new Vault();
int crackVault() {
	for(int i=0; i<1000000; i++) {
		if (vault.tryCode(i)) {
			return(i);
		}
		
	}
	
		return(-1);
	
	
	
}
}

 

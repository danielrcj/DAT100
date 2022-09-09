package O1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;


public class Oppg2aogb {
	public static void main(String[] args) {

		int sum = parseInt(showInputDialog("Fyll inn poengsum"));


		if (sum >= 0 && sum <= 39) {
			showMessageDialog(null,"Din karakter: F");
		}
		else if (sum >= 40 && sum <= 49) {
			showMessageDialog(null,"Din Karakter: E");
		}
		else if (sum >= 50 && sum <= 59) {
			showMessageDialog(null,"Din karakter: D");
		}
		else if (sum >= 60 && sum <= 79) {
			showMessageDialog(null,"Din karakter: C");
		}
		else if (sum >= 80 && sum <= 89) {
			showMessageDialog(null,"Din karakter: B");
		} 
		else if (sum >= 90 && sum <= 100) {
			showMessageDialog(null,"Din karakter: A");
		}
		else showMessageDialog(null,"Ugyldig poengsum");

	}


		
	}

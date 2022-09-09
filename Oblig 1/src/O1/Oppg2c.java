package O1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppg2c {
	public static void main(String[] args) {
		boolean erGyldig = false;

		// for
		for (int i = 1; i <= 10; i++) {
			int sum = -1;
			do {
				sum = parseInt(showInputDialog("Fyll inn poengsum for elev nr. " + i));
				if (sum >= 0 && sum <= 100) {
					erGyldig = true;

				}
			} while (!erGyldig);

			if (sum <= 39) {
				System.out.println("Elev nr. " + i + ", karakter: F");
			} else if (sum <= 49) {
				System.out.println("Elev nr. " + i + ", karakter: E");
			} else if (sum <= 59) {
				System.out.println("Elev nr. " + i + ", karakter: D");
			} else if (sum <= 79) {
				System.out.println("Elev nr. " + i + ", karakter: C");
			} else if (sum <= 89) {
				System.out.println("Elev nr. " + i + ", karakter: B");
			} else if (sum <= 100) {
				System.out.println("Elev nr. " + i + ", karakter: A");
			} else showMessageDialog(null,"Ugyldig poengsum");
				
				erGyldig = false;
			}
		}
	}

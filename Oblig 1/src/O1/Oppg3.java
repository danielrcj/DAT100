package O1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg3 {
	public static void main(String[] args) {

		int tall = parseInt(showInputDialog("Fyll inn et tall"));

		int i, fakultet = 1;

		for (i = 1; i <= tall; i++) {
			fakultet = fakultet * i;
		}

		showMessageDialog(null, tall + "! = "+ fakultet);

	}
}

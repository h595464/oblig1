package oppgave1;

import static javax.swing.JOptionPane.*;

public class Trinskatt {

	public static void main(String[] args) {
		int inntekt = Integer.parseInt(showInputDialog(null,"skriv inn inntekt"));
		if (inntekt < 164_101) {
			System.out.println("du betaler 0% skatt");
		}
		else if (inntekt < 230_950) {
			System.out.println("du betaler 0,93% skatt");
		}
		else if (inntekt < 580_650) {
			System.out.println("du betaler 2,41% skatt");
		}
		else if (inntekt < 934_050) {
			System.out.println("du betaler 11,52% skatt");
		}
		else {
			System.out.println("du betaler 14,52% skatt");
		}
	}

}

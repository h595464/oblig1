package oppgave2;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int poengsum = Integer.parseInt(showInputDialog(null, "skriv inn poengsum"));
			if (poengsum > 100 || poengsum < 0) {
				System.out.println("du har skrevet inn en ugyldig mengde poeng");
				i --;
			} else if (poengsum < 40) {
				System.out.println("din karakter er F");
			} else if (poengsum < 50) {
				System.out.println("din karakter er E");
			} else if (poengsum < 60) {
				System.out.println("din karakter er D");
			} else if (poengsum < 80) {
				System.out.println("din karakter er C");
			} else if (poengsum < 90) {
				System.out.println("din karakter er B");
			} else{
				System.out.println("din karakter er A");
			}
		}
	}
}

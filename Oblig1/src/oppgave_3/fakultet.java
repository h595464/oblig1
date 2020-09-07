package oppgave_3;

public class fakultet {
	public static void main(String[] args) {
		
		int n = 1;
		int temp = 1;
		while(n>1) {
			temp *=n;
			n--;
		}	
		System.out.println(temp);
	}
}
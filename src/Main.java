import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = 0;
		X = sc.nextInt();
		for (int i = 0; i <= X; i ++) {
			
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		
		sc.close();

	}

}

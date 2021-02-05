import java.util.Iterator;
import java.util.Scanner;
public class UD6EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num= scn.nextInt();

		if (primo(num)) {
			System.out.println("Es un numero primo");
		}else {
			System.out.println("NO es un numero primo");
		}
	}
	
	public static boolean primo(int num) {
		boolean result=true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result=false;
			}
		}
		
		
		return result;
	}

}

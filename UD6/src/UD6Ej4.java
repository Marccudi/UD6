import java.util.Scanner;
public class UD6Ej4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num= scn.nextInt();
		
		System.out.println("El factorial de "+num+" es " + factorial(num));
		
	}
	
	
	public static int factorial(int num) {
		int result=1;
		
	
		for (int i = 1; i <= num; i++) {
			result =result*i;
			
		}
		
		
		return result;
	}
	
}

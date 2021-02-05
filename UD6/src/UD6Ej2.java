import java.util.Scanner;

public class UD6Ej2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿Cuantos numeros aleatorios quieres crear?");
		int longitud= scan.nextInt();

		System.out.println("¿Entre que numeros quieres que lo genere?");
		int num1= scan.nextInt();
		int num2= scan.nextInt();

		
		//Pone a num1 el numero más pequeño
		if (num2<num1) {
			int help=num1;
			num1=num2;
			num2=help;
		}
		
		NumerosAleatorios(num1, num2, longitud);
		
		scan.close();
		
	}
	
	public static void NumerosAleatorios(int min, int max, int longitud) {
		
		int array[]= new int[longitud];
			
		
		for (int i = 0; i < longitud; i++) {
			int random= (int) (Math.random()*(max - min) + min);
		array[i]=random;
		}
		for (int i : array) {
			System.out.println(i);
		}
	
	}
	
	
/*	
 	//este metodo le da igual si son repetidos pero funcona
  public static void NumerosAleatorios(int min, int max, int longitud) {
		
		int array[]= new int[longitud];
			
		
		for (int i = 0; i < longitud; i++) {
			int random= (int) (Math.random()*(max - min) + min);
		array[i]=random;
		}
		for (int i : array) {
			System.out.println(i);
		}
	
	}	*/
	
}

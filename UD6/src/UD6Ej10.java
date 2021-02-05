import java.util.Scanner;
public class UD6Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int lon=scn.nextInt();
		System.out.println("numeros entre los cuales estaran los primos:");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		//ponemos en numero mas pequeño en el num1
		if (num2<num1) {
			int help=num2;
			num2=num1;
			num1=help;
		}
		int array[] = new int[lon];
		
		rellenar(array, num1, num2);
		mostrar(array);
	}
	
	public static void rellenar(int array[], int min, int max) {
		boolean primo=true;
		int numR=0;
		//este for rellena el array
		for (int i = 0; i < array.length; i++) {
			numR=(int) (Math.random() * ((max) - min) + min);

			//si no es primo baja una posicion para luego volver a la misma
			//si es primo lo asigna a la posicion
			if (!primo(numR)) {
				i--;
			}else {
				array[i]=numR;
			}
			
		}
	}
	
	public static boolean primo(int numR) {
		boolean primo=true;
		//este for comprueba si el numero a introducir es primo
		for (int j = 2; j < numR; j++) {
			if (numR % j == 0) {
				primo=false;
			}
		}		

		return primo;
	}
	
	public static void mostrar(int array[]) {
		int max=0;
		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) {
				max=array[i];
			}
			System.out.println("["+i+"] ["+array[i]+"]");
		}
		System.out.println("El numero más grande es: "+max);
	}

}

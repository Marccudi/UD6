import java.util.Scanner;
import java.util.Random;
import java.util.Iterator;

public class UD6Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce el tamaño de los array");
		int lon=scn.nextInt();

		int array1[]=new int[lon];
		int array2[]=new int[lon];

		//los dos arrays serán identicos
		for (int i = 0; i < array1.length; i++) {
			array1[i]=r.nextInt(10);
			array2[i]=array1[i];
		}
		
		//ahora el reasignamos los valores del 2do array
		for (int i = 0; i < array2.length; i++) {
			array2[i]=r.nextInt(10);
		}
		
		multi(array1, array2);
		
	}
	
	
	public static void multi(int array1[], int array2[]) {
		int array3[]=new int[array1.length];
		
		//mostramos array1
		System.out.println("Array1:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("["+i+"] ["+array1[i]+"]");			
		}
		//mostramos array2
		System.out.println("Array2:");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("["+i+"] ["+array2[i]+"]");			
		}

	
		//rellenamos y mostramos el array3
		System.out.println("Array3:");
		for (int i = 0; i < array3.length; i++) {
			array3[i]=array1[i] * array2[i];
			System.out.println("["+i+"] ["+array3[i]+"]");			

		}
		
		
	}

}

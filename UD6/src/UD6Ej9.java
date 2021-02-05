import java.util.Scanner;
public class UD6Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Introduce la longitud del array: ");
		int lon=scn.nextInt();
		double array[]=new double[lon];

		rellenar(array, 0, 9);

		mostrar(array);
	}
	
	
	public static void rellenar(double array[], int min, int max) {
		//rellenamos el array con numeros aleatorios entre 0 y 9
		for (int i = 0; i < array.length; i++) {
			array[i]=(Math.random() * ((max+1) - min)) + min;
		}
	}

	
	public static void mostrar(double array[]) {
		double result=0;
		int valor;
		for (int i = 0; i < array.length; i++) {
			//pasamos los valores del array a int para que no tenga decimales
			valor=(int) array[i];
			System.out.println("["+i+"] ["+valor+"]");
			result+=valor;
		}
		System.out.println("Suma de todos los valores del array: "+result);		
		
	}

}

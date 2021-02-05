import java.util.Scanner;
public class UD6Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[10];
		
		rellenar(array);
		mostrar(array);
	}
	
	public static void rellenar(int array[]) {
		Scanner scn=new Scanner(System.in);
		int valor=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el valor de la posicion "+i);
			valor = scn.nextInt();
			array[i]=valor;
			
		}
		scn.close();
	}

	public static void mostrar(int array[]) {
		System.out.println("[Posicion][Valor]");
		for (int i = 0; i < array.length; i++) {
			System.out.println("["+i+"] ["+array[i]+"]");
			
		}
	}

}

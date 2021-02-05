import java.util.Scanner;
public class UD6Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		boolean enter=false;
		int num=0;
		while (!enter) {
			System.out.println("Introduce un numero entero positivo");
			num=scn.nextInt();
			
			if (num>0) {
				enter=true;
			}
		}
		scn.close();
		System.out.println("El numero " + num + " tiene "+decimales(num)+" decimales");
		
	}
	
	public static int decimales(int num) {
		int decimales=0;
		while (num>0) {
			num /=10;
			decimales++;
		}
		return decimales;
	}

}

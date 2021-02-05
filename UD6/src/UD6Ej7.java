import java.util.Scanner;
public class UD6Ej7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce una cantidad de euros");
		double euros = scn.nextDouble();
		System.out.println("Escoje moneda a la que quieres cambiar");
		System.out.println("(1)Libras, (2)Dolares, (3)Yenes");
		int moneda=scn.nextInt();
		
		scn.close();
		
		switch (moneda) {
		case 1:
			libra(euros);
			break;
		case 2:
			dolar(euros);
			break;
		case 3:
			yen(euros);
			break;

		default:
			System.out.println("Numero introducido no aceptado");
			break;
		}	
	}
	
	public static void libra(double euros) {
		double libraEuro =0.86;
		double result=libraEuro*euros;
		System.out.println(euros+" a libras = "+result);
	}
	
	public static void dolar(double euros) {
		double dolarEuro =1.28611;
		double result=dolarEuro*euros;
		
		System.out.println(euros+" a dolar = "+result);
	}
	
	public static void yen(double euros) {
		double yenEuro =129.852;
		double result=yenEuro*euros;
		
		System.out.println(euros+" a dolar = "+result);
	}
	
}

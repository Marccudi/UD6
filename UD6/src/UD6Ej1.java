//import para la clase scanner
import java.util.Scanner;
public class UD6Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaramos el scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que area quieres calcular?");
		System.out.println("Circulo(1), Triangulo(2) o Cuadrado(3)");
		int figura= scan.nextInt();
		//tenemos cada caso del switch para cada figura
		switch (figura) {
		case 1:
			System.out.println("Has escojido el circulo");
			System.out.println("Introduce el radio del circulo:");
			double radio= scan.nextDouble();	
			System.out.println("El area del circulo es: " + circulo(radio));
			break;
			
		case 2:
			System.out.println("Has escojido el Triangulo");
			System.out.println("Introduce la base:");
			double base= scan.nextDouble();
			System.out.println("Introduce la altura:");
			double altura= scan.nextDouble();
			
			System.out.println("El area del triangulo es: " + triangulo(altura, base));
			break;
			
		case 3:
			System.out.println("Has escojido el Cuadrado");
			System.out.println("Introduce la longitud de los lados:");
			double lado= scan.nextDouble();
			System.out.println("El area del cuadrado es: "+cuadrado(lado));
			break;

		default:
			System.out.println("No has introducido un numero esperado");
			break;
		}
		
		
	}
	
	public static double circulo(double rad) {
		//calculamos el area del circulo
		double result=Math.PI*Math.pow(rad, 2);
		return result;
	}
	
	public static double triangulo(double altura, double base) {
		//calculamos el area del Triangulo
		double result=(base*altura)/2;
		return result;
	}
	
	public static double cuadrado(double lado) {
		//calculamos el area del Cuadrado
		double result=lado * lado;
		return result;
	}
	
	
	

}

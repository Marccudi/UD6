import java.util.Scanner;
import java.util.Random;

public class UD6Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner scn=new Scanner(System.in);

		System.out.println("Introduce el tamaño del array");
		int lon=scn.nextInt();
		System.out.println("Introduce el numero que quieres que acaben las posiciones");
		int acab=scn.nextInt();
		
		int array[]=new int[lon];
		int random;
		int ultNum;
		for (int i = 0; i < array.length; i++) {
			random = r.nextInt(299)+1;
			ultNum=random%10;
			if (ultNum==acab) {
				array[i]=random;
			}else {
				i--;
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("["+j+"] ["+array[j]+"]");			
			
		}

	}

}

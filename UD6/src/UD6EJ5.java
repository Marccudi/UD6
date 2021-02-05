import java.util.Scanner;
public class UD6EJ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = scn.nextInt();
		System.out.println("Numero en binario: ");
		binario(num);
		
		
	}
	
	public static void binario(int num) {
		String bin="";
		while (num>0) {
			bin=(num%2)+bin;
			num/=2;
		}
		System.out.println(bin);
		
		
	}
	

}


package clase_04_objeto;
import java.util.Scanner;//importante

		
public class Program {
	
	static Scanner s=new Scanner(System.in);//impotante
	
	public static void main(String[] args) {
		
		System.out.println("ingrese un numero: ");
		//s.nextInt();
		
//		int numero1=s.nextInt();
//		int numero2=numero1*2;
//		int numero3=numero1/2;
//		int numero4=numero1*numero1;
		
		///funciona con coma 
		
		float numero1=s.nextFloat();
		float numero2=numero1*2;
		float numero3=numero1/2;
		float numero4=numero1*numero1;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);

	}

}

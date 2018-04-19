
public class Program {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int suma=a+b;
		System.out.println(suma);
		
		
		//la suma de 2 bytes es un int pasa lo mismo con dos short  por eso da un error
		byte c=3;
		byte d=2;
		//byte suma2=c+d;
		int suma2=c+d;
		System.out.println(suma2);
		
		//la division de dos numeros entero siempre se trunca siempre la parte decimal a menos q sea un float y un int
		float e=44;
		//int e=44;
		int f=6;
		double division=e/f;
		System.out.println(division);
	}

}

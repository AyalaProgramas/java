package ejercicio_012;

import java.util.Scanner;

public class Program {

	static Scanner user=new Scanner(System.in);
	
	public static void main(String[] args) {
		
			int numeroPrimo=101;
			int opcion;
			int cantidaddeceros=0;
			
			for(int i=1;i<101;i++)
			{
				cantidaddeceros=0;
				for(int j=1;j<=i;j++)
				{
					int resto=i%j;
					if(resto==0)
					{
						cantidaddeceros++;
					}
				}
				if(cantidaddeceros==2)
				{
					System.out.println(i);
				}
			}
			
			
			while(true)
			{
				System.out.println("ingrese un numero:");
				numeroPrimo=user.nextInt();
				if(numeroPrimo%2!=0)
				{
					System.out.println("es primo");
					
				}
				else
				{
					System.out.println("no es primo");
				}
				
				System.out.println("desea seguir ingresando numero\n 1:si \n2:no");
				opcion=user.nextInt();
				if(opcion==2)
				{
					break;
				}
			}
//			
			
//			int numero = (int)(Math.random()*12)+1;
//			int palo = (int)(Math.random()*4)+1;
//			String paloString="";
//			
//			switch(palo)
//			{
//				case 1:
//					paloString="oro";
//						//System.out.println("oro "+numero);
//						
//					break;
//				case 2:
//					paloString="copa";
//					//System.out.println("copa "+numero);
//					break;
//				case 3:
//					paloString="espada";
//					//System.out.println("espada "+numero);
//					break;
//				case 4:
//					paloString="basto";
//					//System.out.println("basto "+numero);
//					break;
//			
//			}
//			
//			System.out.println(numero +" de "+ paloString);
//			for(int i=0;i<11;i++)
//			{
//				System.out.println(i);
//			}
//		int edad;
//		do
//		{
//			System.out.println("ingrese edad");
//			edad=user.nextInt();
//		}while(edad<0&&edad>100);
//		
//		
//		System.out.println("su edad es "+edad);
		
		
		
		
	}

}

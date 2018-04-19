package ejercicio_09;

import java.util.Scanner;

public class Program {
	
	static Scanner s =new Scanner(System.in);
	
	public static void main(String[] args) {

		float nota;
		int contador=0;
		
		
		System.out.println("ingresar la nota: ");
		nota= s.nextFloat();//guardo en la variable nota lo q pide nextFloat
		boolean flag=false;
		while(true)
		{
			
			if(nota>10||nota<0)
			{
				System.out.println("INGRESE UNA NOTA VALIDA!!!");
				if(contador==3)
				{
					System.out.println("SE TERMINO EL PROGRAMA ADIOS!!");
					flag=false;
					break;
				}
			}
			else 
			{
				
				break;
			}
			System.out.println("INGRESAR LA NOTA NUEVAMENTE: ");
			nota= s.nextFloat();
			contador++;
		}
			
		if(flag==true)
		{
			if(nota>=7)
			{
				System.out.println("el alumno esta aprobado");
			}
			else
			{
				System.out.println("el alumno esta desaprobado");
			}
		}
		
		
	}

}

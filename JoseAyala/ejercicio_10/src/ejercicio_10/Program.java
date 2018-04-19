package ejercicio_10;

import java.util.Scanner;


public class Program {
	static Scanner user=new Scanner(System.in);

	public static void main(String[] args) {
			System.out.println("-----------------------bienbenido a croto----------------------");
			
			
			double ingreso;
			int porcentage=0;
			int pago=0;
			int comunidad=0;
			int dia;
			double montoCdescuento;
			double preciofinal;
			
			System.out.println("ingrese monto a pagar:");
			ingreso=user.nextDouble();
			System.out.println("ingrese medio de pago:");    
			System.out.println("1-devito o efectivo");
			System.out.println("2-otros");
			pago=user.nextInt();
			System.out.println("¿el cliente es parte de la comunidad?ingrese: ");
			System.out.println("1-si");
			System.out.println("2-no");
			comunidad=user.nextInt();
			System.out.println("que dia de la semana es?");
			System.out.println("1-Lunes\n2-martes\n3-miercoles\n4-jueves\n5-viernes\n6-sabado\n7-domingo");
			dia=user.nextInt();
			
			
			
			if(ingreso>=500)
			{
				porcentage=porcentage+5;
			}
			
			
			if(pago==1)
			{
				porcentage+=10;
			}
			
			if(comunidad==1 && dia==1)
			{
				porcentage+=10;
			}
			
			montoCdescuento=(ingreso/100)*porcentage;
			preciofinal=ingreso-montoCdescuento;
			
			System.out.println("el descuento a aplicar es:"+porcentage);
			System.out.println("el monto sin descuento es:"+ingreso);
			System.out.println("el monto con descuento:"+montoCdescuento);
			System.out.println("el precio final es:"+preciofinal);
			
			
			
	}

}

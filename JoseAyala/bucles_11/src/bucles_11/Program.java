package bucles_11;
import java.util.Scanner;
public class Program {
	static Scanner user=new Scanner(System.in);
	public static void main(String[] args) {
		int i;
		int j;
		int numerotabal;
		
//		for(i=0;i<1000;i++)
//		{
//			System.out.println(i);
//		}
//		
//		while(j<2000)
//		{
//			System.out.println(j);
//			j++;
//		}
		System.out.println("ingrese un numero para multiplicar");
		numerotabal=user.nextInt();
		j=0;
		i=0;	
		while(j<11)
		{
			System.out.println(numerotabal+"*"+i+"="+(numerotabal*i));
			j++;
			i++;
		}
		
		j=0;
		i=1;
		int k=100;
		int gauss=0;
		int total=0;
		while(i<51)
		{
			System.out.println(i+k);
			
		
			
			i++;
			k--;
			j=j+(i+k);
		}
		System.out.println(j);
		i=0;
		int maxim;
		int min;
		int flag=0;
		
		while(i<10)
		{
			System.out.println("ingrese un numero:");
			gauss=user.nextInt();
			total=total+gauss;
			
			if(maxim>gauss||flag==0)
			{
				maxim=gauss;
				flag=1;
			}
			
			if(min<gauss||flag==0)
			{
				min=gauss;
				flag=1;
			}
			i++;
		}
		System.out.println(total);
	}

}

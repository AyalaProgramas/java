
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float promedio,notafinal;
		int asistencia;
		boolean tpaprobado;
		boolean aprobado;
		
		
		promedio=44;
		notafinal=90;
		asistencia=80;
		tpaprobado=true;
		
		aprobado=(promedio>=80)&&(notafinal>=75)&&
				(asistencia>=75)&&(tpaprobado==true);
		System.out.println(aprobado);
		
		boolean a=false;
		
		
		String mensaje=(promedio>=80)&&(notafinal>=75)&&
				(asistencia>=75)&&(tpaprobado==true)?"APROBASTE":"NO APROBO";
		
		System.out.println(mensaje);
		
		
		
	}

}

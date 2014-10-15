import java.util.Scanner;
import com.zubiri.constructor.*;

public class GeometricasConstructor{
public static void main (String args []) {
char elegir;
	Scanner sc = new Scanner (System.in);
	System.out.println("\n Que deseas hacer? Circulo(C) / Rectangulo(R) / Terminar(T)");
	elegir = sc.next().charAt(0);


 while ((elegir != 'T')&&(elegir != 't'))
{
	 if  (elegir == 'C' || elegir == 'c')
{       

double radio;


	System.out.print("\nIngresa el radio : ");
	radio = sc.nextDouble();

	Circulo operaciones = new Circulo(radio);
	
	System.out.print("\n la area del circulo es : " + operaciones.Area());
	System.out.print("\n la circunferencia del circulo es : " + operaciones.Circunferencia());

}

else 	 if  (elegir == 'R' ||elegir == 'r')
{  

double altura;
double base;

	System.out.print("\ningresa la altura del rectangulo : ");
	altura = sc.nextDouble();

	System.out.print("\ningresa la base del rectangulo : ");
        base = sc.nextDouble();
        
	Rectangulo operaciones = new Rectangulo(altura, base);
	
	System.out.println("\nla base es : " + operaciones.Superficie());
	System.out.println("\nel perimetro es : " + operaciones.Perimetro());
	
	}
	System.out.println("\n Que deseas hacer otra operacion? Circulo(C) / Rectangulo(R) / Terminar(T)");
	elegir = sc.next().charAt(0);
}
System.exit(0);
}
}

import java.util.Scanner;
import com.zubiri.constructor.*;

public class GeometricasConstructor{
public static void main (String args []) {
char elegir;
	Scanner sc = new Scanner (System.in);
	System.out.println("\n Que deseas hacer? Circulo(C) / Rectangulo(R) / Terminar(T)");
	elegir = sc.next().charAt(0);


 while (elegir != 'T')
{
	 if  (elegir == 'C')
{       



double radio;
double resultadoArea;
double resultadoCircunferencia;

	System.out.print("\nIngresa el radio : ");
	radio = sc.nextDouble();


	Circulo operaciones = new Circulo(radio);
	
	resultadoArea = operaciones.Area();
	resultadoCircunferencia = operaciones.Circunferencia();

	System.out.print("\n la area del circulo es : " + resultadoArea);
	System.out.print("\n la circunferencia del circulo es : " + resultadoCircunferencia);

}

else 
{  

double altura = 0;
double base = 0;
double superficie;

	Rectangulo operaciones = new Rectangulo(altura, base);
 
	superficie = operaciones.Superficie();


//	Scanner sc = new Scanner(System.in);
	System.out.print("\ningresa la altura del rectangulo : ");
	altura = sc.nextDouble();

	System.out.print("\ningresa la base del rectangulo : ");
        base = sc.nextDouble();

	operaciones.setBase(base);
	operaciones.setAltura(altura);

	System.out.println("\nla base es : " + operaciones.Superficie());
	System.out.println("\nel perimetro es : " + operaciones.Perimetro());
	
	}
	System.out.println("\n Que deseas hacer otra operacion? Circulo(C) / Rectangulo(R) / Terminar(T)");
	elegir = sc.next().charAt(0);
}
System.exit(0);
}
}

import java.util.Scanner;

public class Calculadora {
	private static Scanner in = new Scanner (System.in);
	
	public static void main(String args[]) {  
        
        Complejo primerNumero = ObtenerComplejo();
        Complejo segundoNumero = ObtenerComplejo();
        Complejo resultado = Suma(primerNumero, segundoNumero);
        System.out.print("El resultado de la suma es: " + resultado.real + " " + resultado.imaginario + "\n");
        resultado = Resta(primerNumero, segundoNumero);
        System.out.print("El resultado de la resta es: " + resultado.real + " " + resultado.imaginario + "\n");
        System.out.print("El resultado de la multiplicacion es: " + Multiplicacion(primerNumero, segundoNumero));
	}
	
	public static Complejo ObtenerComplejo() {
		System.out.print("Escribe la parte real: ");
        double real = in.nextDouble();
        System.out.print("Escribe la parte imaginario: ");
        double imag = in.nextDouble();      
        Complejo Numero = new Complejo();
        Numero.real = real;
        Numero.imaginario = imag;
        MostrarComplejo(Numero);
        return Numero;
	}
	
	public static void MostrarComplejo(Complejo numero) {
		System.out.print("El numero complejo digitado fue: " + numero.real + " " + numero.imaginario + "\n");
	}
	
	public static Complejo Suma(Complejo primerNumero, Complejo segundoNumero) {
        Complejo resultado = new Complejo();   
        resultado.imaginario = primerNumero.imaginario + segundoNumero.imaginario;
        resultado.real = primerNumero.real + segundoNumero.real; 
		return resultado;
	}
	
	public static Complejo Resta(Complejo primerNumero, Complejo segundoNumero) {
        Complejo resultado = new Complejo();   
        resultado.imaginario = primerNumero.imaginario - segundoNumero.imaginario;
        resultado.real = primerNumero.real - segundoNumero.real; 
		return resultado;
	}
	
	public static double Multiplicacion(Complejo primerNumero, Complejo segundoNumero) {  
        double a = (primerNumero.real * segundoNumero.real) - (primerNumero.imaginario * segundoNumero.imaginario);
        double b = (primerNumero.real * segundoNumero.imaginario) + (primerNumero.imaginario * segundoNumero.real);
        double resultado = a + b;
		return resultado;
	}
}

package caracter01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args ) {
		Scanner entrada = new Scanner(System.in);
		char operador;
		int x, y, resultado;
		System.out.print("Ingresar primer numero:");
		x = entrada.nextInt();
		System.out.print("ingresar segundo numero:");
		y = entrada.nextInt();
		System.out.print("Ingresar operador(-,+,*,/):");
		operador = entrada.next().charAt(0);
		switch(operador) {
		case '-':
            resultado = x-y;
            System.out.println("La resta es:" + resultado);
            break;
		case '+':
            resultado = x+y;
            System.out.println("La suma es:" + resultado);
            break;
		case '*':
            resultado = x*y;
            System.out.println("La multiplicación es: " + resultado);
            break;
		case '/':
            if(y!=0)
            {
                   resultado = x/y;
                   System.out.println("La división es"  + resultado);
            }
            else
                  System.out.println("infinito");
            break;
		default:
            System.out.println("resultado no valido");
		}
	}

}

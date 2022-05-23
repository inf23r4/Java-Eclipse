package condicionales;

import java.util.Scanner;

public class CondicionalDoble {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Diagrama un valor entero : ");
	int a = sc.nextInt();
	
	if(a >= 0) {
		//bloque true
		System.out.println("Es un valor positivo");	
	}else {
		//bloque false
		System.out.println("es un valor negativo");
	}
	
	System.out.println("la variable a vale : " + a);
	sc.close();
	}
}

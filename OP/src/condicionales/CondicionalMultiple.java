package condicionales;

import java.util.Scanner;

public class CondicionalMultiple {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Diagrama un valor entero : ");
	int a = sc.nextInt();
	
	if(a >= 0) {
		System.out.println("Es un valor positivo");	
	} else if (a < 0){
		//bloque false
		System.out.println("es un valor negativo");
	} else {
		//bloque false
		System.out.println("es un valor nulo");
	}
	
	System.out.println("la variable a vale : " + a);
	sc.close();
	}
}

package condicionales;

import java.util.Scanner;

public class OperadoresTernarios {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Diagrama un valor entero : ");
	int a = sc.nextInt();
	
	String res = "";
	
	if (a >= 0 ) {
		res = "valor position";
	} else {
		res = "valor negativo";
	}
	
	res = a >= 0 ? "valor positivo" : "valor negativo";
	System.out.println(res);
	
	System.out.println("la variable a vale : " + a);
	sc.close();
	}

}

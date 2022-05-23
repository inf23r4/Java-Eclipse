package condicionales;

import java.util.Scanner;

public class Switch {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Diagrama un valor entero : ");
			int a = sc.nextInt();
			
			if( a == 1) {
				//bloque 1
				System.out.println("paso por bloque 1");
			} else if (a == 2 ) {
				System.out.println("paso por bloque 2");
			}else if (a == 3 ) {
				System.out.println("paso por bloque 3");
			}else if (a == 4 ) {
				System.out.println("paso por bloque 4");
			}else if (a == 5 ) {
				System.out.println("paso por bloque 5");
			}else if (a == 6 ) {
				System.out.println("paso por bloque 6");
			}else if (a == 7 ) {
				System.out.println("paso por bloque 7");
			}
			System.out.println("la variable a vale" + a);
			sc.close();
		}
}

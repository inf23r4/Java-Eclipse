package diasmes03;
import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes, año;
		System.out.print("ingresar numero mes 1-12:");
		mes = entrada.nextInt();
		System.out.print("ingresar año:");
		año = entrada.nextInt();
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print("el mes tiene 31 dias");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("El mes tiene 30 dias");
			break;
		case 2:
			if((año%4==0 && año%100!=0) || año%400==0)
                System.out.println("El mes tiene 29 dias");
			else
                System.out.println("El mes tiene 28 dias");
			break;
		default:
                System.out.println("numero de mes equivocado");
		}
	}

}

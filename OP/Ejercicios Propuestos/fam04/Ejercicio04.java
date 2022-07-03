package fam04;
import java.util.Scanner;

public class Ejercicio04 {
        public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);
                 int numeroHijos, asignacionFamiliar;
                 System.out.print("Ingresar numero de hijos: ");
                 numeroHijos = entrada.nextInt();
                 switch(numeroHijos)
                 {
                       case 0:
                                    asignacionFamiliar = 0;
                                    System.out.println("La asignacion familiar es: "
                                                                               + asignacionFamiliar);
                                    break;
                       case 1:
                                    asignacionFamiliar = 50;
                                    System.out.println("La asignacion familiar es: "
                                                                               + asignacionFamiliar);
                                    break;
                       case 2:
                                    asignacionFamiliar = 75;
                                    System.out.println("La asignacion familiar es: "
                                                                               + asignacionFamiliar);
                                    break;
                       case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                                    asignacionFamiliar = 100;
                                    System.out.println("La asignacion familiar es: "
                                                                               + asignacionFamiliar);
                                    break;
                       default:
                                          System.out.println("numero de hijos incorrecto");
                 }
        }
}

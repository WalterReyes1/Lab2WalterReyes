package lab2_walterreyes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2_WalterReyes {

    static Scanner lectura = new Scanner(System.in);
    static ArrayList detectives = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("Sistema");
            System.out.println("1-Agregar detectives");
            System.out.println("2-Eliminar detectives");
            System.out.println("3-Modificar Detectives");
            System.out.println("4-Listar Detectives");
            System.out.println("5-Registrar casos");
            System.out.println("6-Modificar casos");
            System.out.println("7-Listar casos");
            System.out.println("8-Listar casos resueltos");
            System.out.println("9-listar casos pendientes");
            System.out.println("9-Salir");
            System.out.print("Ingrese una opción: ");
            opcion = lectura.nextInt();
            switch (opcion) {

                case 1: {
                    System.out.println("Agregar detectives");
                    System.out.print("Nombre de detective: ");
                    String nombre = lectura.next();
                    System.out.print("Edad: ");
                    int edad = lectura.nextInt();
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = lectura.next();
                    System.out.print("Años en labores: ");
                    int años = lectura.nextInt();
                    int calidad = 0;
                    do {
                        System.out.println("Ingrese valor de detective (1-10): ");
                        calidad = lectura.nextInt();
                    } while (calidad > 10 || calidad < 0);

                    detectives.add(new Dectectives(nombre, edad, nacionalidad, años, calidad));
                    break;
                }

                case 2: {
                    System.out.println("Eliminar detective");
                    System.out.println("Lista de detectives: ");
                    String salida = "";
                    for (Object t : detectives) {
                        salida += detectives.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida);

                    int p = 0;
                    do {
                        System.out.print("Posicion a Eliminar: ");
                        p = lectura.nextInt();
                    } while (p > detectives.size() || p < detectives.size());
                    detectives.remove(p);

                    break;
                }
            }

        }// fin switch

    }// fin while
}// fin main


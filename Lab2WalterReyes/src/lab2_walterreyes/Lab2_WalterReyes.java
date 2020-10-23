
package lab2_walterreyes;

import java.util.Scanner;


public class Lab2_WalterReyes {
static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        while(opcion != 9){
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
        opcion= lectura.nextInt();
        }
    }// fin main
    
}

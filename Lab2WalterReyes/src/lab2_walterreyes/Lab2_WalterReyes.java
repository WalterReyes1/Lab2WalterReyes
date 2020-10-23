package lab2_walterreyes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2_WalterReyes {

    static Scanner lectura = new Scanner(System.in);
    static ArrayList detectives = new ArrayList();
    static ArrayList casos = new ArrayList();
    static ArrayList robos = new ArrayList();
    static ArrayList homicidios = new ArrayList();
    static ArrayList secuestros = new ArrayList();

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

                case 3: {
                    System.out.println("");
                    System.out.println("Modificar detectives");
                    System.out.println("Lista de detectives: ");
                    String salida = "";
                    for (Object t : detectives) {
                        salida += detectives.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida);

                    int p = 0;
                    do {
                        System.out.print("Posicion a Modificar: ");
                        p = lectura.nextInt();
                    } while (p > detectives.size() || p < detectives.size());
                    System.out.println("Que deseas modificar? 1-nombre\n 2-edad\n 3- nacionalidad \n 4- Años en labores \n 5-calificación");
                    int op = lectura.nextInt();
                    if (op == 1) {
                        System.out.print("Nombre de detective: ");
                        String nombre = lectura.next();
                        ((Dectectives) detectives.get(p)).setNombre(nombre);
                    }
                    if (op == 2) {
                        System.out.print("Edad: ");
                        int edad = lectura.nextInt();
                        ((Dectectives) detectives.get(p)).setEdad(edad);

                    }
                    if(op == 3){
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = lectura.next();
                    ((Dectectives) detectives.get(p)).setNacionalidad(nacionalidad);
    
                    }
                    if(op==4){
                    System.out.print("Años en labores: ");
                    int años = lectura.nextInt();
                    ((Dectectives) detectives.get(p)).setAños(años);

                    }
                    if(op == 5){
                    int calidad = 0;
                    do {
                        System.out.println("Ingrese valor de detective (1-10): ");
                        calidad = lectura.nextInt();
                    } while (calidad > 10 || calidad < 0);
                    ((Dectectives) detectives.get(p)).setNivel(calidad);
    
                    }

                    
                    break;
                }// fin caso 3

                case 4: {
                    System.out.println("Lista de detectives: ");
                    String salida = "";
                    for (Object t : detectives) {
                        salida += detectives.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida);
                    break;
                }

                case 5: {
                    System.out.println("Registrar casos ");
                    System.out.print("Ingrese lugar: ");
                    String lugar = lectura.next();
                    System.out.print("Descripción: ");
                    String desc = lectura.next();
                    desc = lectura.next();
                    int x = 0;
                    String tipo = "";
                    do {
                        System.out.println("Tipo: 1-Homicidio \n 2-secuestro \n 3- robo: ");
                        x = lectura.nextInt();
                    } while (x > 3 || x < 0);
                    if (x == 1) {
                        tipo = "Homicidio";
                    }
                    if (x == 2) {
                        tipo = "Secuestro";
                    }
                    if (x == 3) {
                        tipo = "Robo";
                    }
                    System.out.println("Lista de detectives: ");
                    String salida = "";
                    for (Object t : detectives) {
                        salida += detectives.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida);
                    int p;
                    do {
                        System.out.println("Ingrese posición de detective a asignar: ");
                        p = lectura.nextInt();

                    } while (p > detectives.size() || detectives.size() < 0);
                    String detective;
                   detective = ((Dectectives) detectives.get(p)).getNombre();

                    int est;
                    String estado = "";
                    do {
                        System.out.print("Estado 1- En proceso \n 2-resuelto");
                        est = lectura.nextInt();
                    } while (est > 2 || est < 0);
                    if (est == 1) {
                        estado = "En proceso";
                    }
                    if (est == 2) {
                        estado = "Resuelto";
                    }
                    casos.add(new Casos(lugar, desc, tipo, p, estado));
                    if (x == 1) {
                        homicidios.add(new Casos(lugar, desc, tipo, p, estado));
                    }
                    if (x == 2) {
                        secuestros.add(new Casos(lugar, desc, tipo, p, estado));
                    }
                    if (x == 3) {
                        robos.add(new Casos(lugar, desc, tipo, p, estado));
                    }
                    break;
                }

                case 6: {
                    System.out.println("");
                    System.out.println("Modificar casos ");
                    System.out.println("Lista de casos: ");
                    String salida = "";
                    for (Object t : casos) {
                        salida += casos.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida);

                    System.out.println("Registrar casos ");
                    System.out.print("Ingrese lugar: ");
                    String lugar = lectura.next();
                    System.out.print("Descripción: ");
                    String desc = lectura.next();
                    desc = lectura.next();
                    int x = 0;
                    String tipo = "";
                    do {
                        System.out.println("Tipo: 1-Homicidio \n 2-secuestro \n 3- robo: ");
                        x = lectura.nextInt();
                    } while (x > 3 || x < 0);
                    if (x == 1) {
                        tipo = "Homicidio";
                    }
                    if (x == 2) {
                        tipo = "Secuestro";
                    }
                    if (x == 3) {
                        tipo = "Robo";
                    }
                    System.out.println("Lista de detectives: ");
                    String salida1 = "";
                    for (Object t : detectives) {
                        salida += detectives.indexOf(t) + "- " + t + "\n";
                    }
                    System.out.println(salida1);
                    int p;
                    do {
                        System.out.println("Ingrese posición de detective a asignar: ");
                        p = lectura.nextInt();

                    } while (p > detectives.size() || detectives.size() < 0);

                    int est;
                    String estado = "";
                    do {
                        System.out.print("Estado 1- En proceso \n 2-resuelto");
                        est = lectura.nextInt();
                    } while (est > 2 || est < 0);
                    if (est == 1) {
                        estado = "En proceso";
                    }
                    if (est == 2) {
                        estado = "Resuelto";
                    }
                    casos.set(p, new Casos(lugar, desc, tipo, p, estado));
                    break;
                }

                case 7: {
                    System.out.println("Lista de casos: ");
                    String salida = "";
                    int cont = 0;
                    for (Object t : homicidios) {
                        salida += homicidios.indexOf(t) + "- " + t + "\n";
                        cont++;
                    }
                    for (Object t : secuestros) {
                        salida += secuestros.indexOf(cont) + "- " + t + "\n";
                        cont++;
                    }
                    for (Object t : robos) {
                        salida += robos.indexOf(cont) + "- " + t + "\n";
                        cont++;
                    }
                    System.out.println(salida);
                    break;

                }

            }

        }// fin switch

    }// fin while
}// fin main


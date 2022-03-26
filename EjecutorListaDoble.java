/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista_Doble;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class EjecutorListaDoble {

    /**
     * @param args the command line arguments
     */
    static ListaDoble doble = new ListaDoble();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        
    }
    
    public static void menu(){
        boolean salir = false;
        int eleccion;
        
        while (!salir){
            System.out.println("\n---------------------------");
            System.out.println("\nSeleccione qué desea hacer");
            System.out.println("\n1. Añadir al inicio");
            System.out.println("2. Añadir al final");
            System.out.println("3. Mostrar de inicio a fin");
            System.out.println("4. Mostrar de fin a inicio");
            System.out.println("5. Eliminar el primer elemento");
            System.out.println("6. Eliminar el último elemento");
            System.out.println("7. Buscar");
            System.out.println("8. Salir");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: añadir();
                        break;
                case 2: añadirFinal();
                        break;
                case 3: doble.MostrarListaIncioFin();
                        break;
                case 4: doble.MostarListaFinInicio();
                        break;
                case 5: System.out.println("Elemento eliminado: [" + doble.EliminarDelInicio() + "]");
                        break;
                case 6: System.out.println("Elemento eliminado: [" + doble.ElminarDelFinal() + "]");
                        break;
                case 7: System.out.println("Ingrese el dato que quiere buscar");
                    char elemento=0;
                    elemento = sc.next().charAt(elemento);
                    doble.Buscar(elemento);
                        break;
                case 8: salir = true;
                        break;
                case 9: 
                        break;
            }
        }
    }
    
     public static void añadir(){
        char elemento=0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        doble.AgregarInicio(elemento);
    }
     
     public static void añadirFinal(){
        char elemento = 0;
        System.out.println("Ingrese el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        doble.AgregarFinal(elemento);
    }
 }

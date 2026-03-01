package co.edu.uptc.view;

import java.util.Scanner;

public class MenuCli {

    private Scanner scan;
    private int option;

    public MenuCli(){
        scan = new Scanner(System.in);
        option = 0;
    }

    private void show() {
        System.out.println("\n=== Administrador de Productos ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Listar productos ordenados por descripción");
        System.out.println("4. Eliminar productos por descripción");
        System.out.println("5. Salir");
    }

    public int start() {
        do {
            show();
            readInt();
        } while (option < 1 || option > 5);
        return option;
    }

    private void readInt() {
        try {
            System.out.println(" Escriba una opcion:");
            String aux = scan.nextLine();
            option = Integer.parseInt(aux);
        } catch (NumberFormatException e) {
            System.err.println("=== Solo numeros ===");
        }

    }
}

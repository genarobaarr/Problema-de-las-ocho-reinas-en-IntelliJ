package Problema_de_las_ocho_reinas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Escribe las medidas de tu tablero - > ");
        Scanner entrada = new Scanner(System.in);
        int size = entrada.nextInt();
        BusquedaLocal busqueda = new BusquedaLocal(size);

        Solucion solucion = busqueda.Algoritmo();
        System.out.println("Resultado final: " + solucion);
    }
}

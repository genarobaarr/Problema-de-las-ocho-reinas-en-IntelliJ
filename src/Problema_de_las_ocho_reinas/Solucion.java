package Problema_de_las_ocho_reinas;

import java.util.*;

public class Solucion implements Comparable<Solucion> {

    public int[] permutacion;
    public int ataques;

    public Solucion(int D) {
        permutacion = new int[D];
    }

    @Override
    public int compareTo(Solucion t) {
        //orden descendente
        return Integer.compare(t.ataques, ataques);
    }

    @Override
    public String toString() {
        return Arrays.toString(permutacion) + " " + ataques;
    }
}
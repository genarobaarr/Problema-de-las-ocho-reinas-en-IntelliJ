package Problema_de_las_ocho_reinas;

import static Problema_de_las_ocho_reinas.Aleatorio.rnd;

public class BusquedaLocal {

    Tablero tablero;

    public BusquedaLocal(int size) {
        tablero = new Tablero(size);
    }

    public Solucion Algoritmo() {
        Solucion actual = tablero.s;
        int iteraciones = 10000;
        while (actual.ataques > 0 && iteraciones > 0) {
            Solucion nueva = Tweak(actual);
            if (nueva.ataques <= actual.ataques) {
                actual = nueva;
            }
            iteraciones --;
        }
        return actual;
    }

    private Solucion Tweak(Solucion s){
        Solucion s1 = new Solucion(tablero.size);
        s1.permutacion = s.permutacion.clone();

        /*Genero dos puntos aleatorios del 0 al (boardSize-1)*/
        int p1 = rnd(0, tablero.size - 1);
        int p2 = rnd(0, tablero.size - 1);
        /*Con este ciclo me aseguro que p1 y p2 sean distintos*/
        while (p1 == p2) {
            p1 = rnd(0, tablero.size - 1);
        }

        /*Ejecuto mi intercambio de valores de la permutación de la solución s*/
        int temp = s1.permutacion[p1];
        s1.permutacion[p1] = s1.permutacion[p2];
        s1.permutacion[p2] = temp;

        s1.ataques = tablero.contarAtaques(s1.permutacion);

        return s1;
    }
}

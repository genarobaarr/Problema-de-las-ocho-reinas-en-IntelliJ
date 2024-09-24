package Problema_de_las_ocho_reinas;

import java.util.*;

public class Aleatorio {
    public static int rnd(int low, int high) {
        int i;
        if (low >= high) {
            i = low;
        } else {
            i = (int) ((Math.random() * (high - low + 1)) + low);
            if (i > high) {
                i = high;
            }
        }
        return (i);
    }

    public static int[] getPermutacion(int boardSize){
        int[] permutacion = new int[boardSize];
        List<Integer> T = new ArrayList();
        for(int i = 0; i < boardSize; i++){
            T.add(i);
        }
        Collections.shuffle(T);
        for(int i = 0; i < boardSize; i++){
            permutacion[i] = T.get(i);
        }
        return permutacion;
    }
}

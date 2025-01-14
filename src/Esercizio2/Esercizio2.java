package Esercizio2;

import java.util.*;


public class Esercizio2 {

    public static List<Integer> generaListaOrdinata(int N) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer>creaListaSpecchio(List<Integer>lista) {
        List<Integer> listaSpecchio = new ArrayList<>(lista);
        List<Integer> listaInversa = new ArrayList<>(lista);

        Collections.reverse(listaInversa);
        listaSpecchio.addAll(listaInversa);
        return listaSpecchio;
    }


    public static void stampaPosizioni(List<Integer> lista,boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0){
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0 ) {
                System.out.println(lista.get(i));

            }

        }
    }

    public static void main(String[] args) {
        int N = 5;
        List<Integer> listaOrdinata = generaListaOrdinata(N);
        System.out.println("Lista ordinata di " + N + " interi casuali:" );
        for (Integer num : listaOrdinata ){
            System.out.println(num);
        }

        List<Integer> listaSpecchio= creaListaSpecchio(listaOrdinata);
        System.out.println("Lista specchio: ");
        for (Integer num : listaSpecchio){
            System.out.println(num);
        }
        System.out.println("Valori posizione pari: ");
        stampaPosizioni(listaSpecchio,true);

        System.out.println("Valori posizione dispari: ");
        stampaPosizioni(listaSpecchio,false);
    }



}

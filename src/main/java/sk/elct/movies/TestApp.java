package sk.elct.movies;

import java.util.*;

public class TestApp {

    public static void main(String[] args) {
        String[] array = new String[]{"a", "v", "d"};
        System.out.println(array[0]);

        List<String> list = new ArrayList<>();
        list.add("aaa");
        System.out.println(list.get(0));
        // Integer ako obalovacia trieda intu, 
        // lebo tam musi byt trieda nie primitivny typ
        List<Integer> z = new ArrayList<>();

        // try catch blok, ak neviem pouzit if
        try {
            int a = Integer.parseInt("1sd23");
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("zly vstup" + e.getMessage());

        }

        // set je mnozina - kazdy prvoj je tam len raz
        Set<String> kolekcia = new HashSet<>();
        //List<String> zoznam = new ArrayList<>();
        kolekcia.add("jeden");
        kolekcia.add("dva");
        kolekcia.add("tri");
        kolekcia.add("styri");
        kolekcia.add("pat");
        kolekcia.add("styri");

        System.out.println(kolekcia);

        for (int i = 0; i < kolekcia.size(); i++) {
            // takto viem pristupit k zoznamu, ale nie k mnozine
            // System.out.println(kolekcia.get(i));
        }

        // set negarantuje poradie, list ano
        for (String s : kolekcia) {
            System.out.println(s);
        }

    }

}

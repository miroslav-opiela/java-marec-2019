package sk.elct.movies;

import java.util.*;
import sk.elct.SmartTeddy;

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
        
        Movie alien = new Movie("Alien", 
                1987, new String[]{"sci-fi"});
        List<Object> o = new ArrayList<>();
        o.add("abc");
        o.add(new SmartTeddy());
        o.add(new Movie());
        o.add(alien);
        o.add(new int[]{1,3,2});
        System.out.println(o);
        
        Movie alien1 = new Movie("Alien", 
                1987, new String[]{"sci-fi"});
        Movie alien2 = new Movie("Alien", 
                1987, new String[]{"sci-fi"});
        Set<Movie> filmy = new HashSet<>();
        filmy.add(alien);
        filmy.add(alien1);
        filmy.add(alien2);
        System.out.println(filmy.size());
        System.out.println(alien.equals(alien1));
                alien.equals(new int[]{1,2,3});

    }

}

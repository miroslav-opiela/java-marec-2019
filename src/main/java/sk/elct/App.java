package sk.elct;

import java.util.Arrays;
import java.util.Calendar;

public class App {

    public static void main(String[] args) {
        // ObjectInspector o = new ObjectInspector();
        // String veta = "dnes je pondelok";

        SmartTeddy jozef = new SmartTeddy();
        String song = "Tancuj vykrucaj";
        String teddySong = jozef.sing(song, '*');
        System.out.println(teddySong);

        System.out.println(jozef.abbreviation("sl"));

        System.out.println(jozef.generateWord('A', 3));

        System.out.println(jozef.reverseString("stressed"));

        System.out.println(jozef.numbersCount("a1bcd87f9"));

        // volanie statickej metody
        System.out.println(SmartTeddy.isPalindrome("abba"));
        System.out.println(jozef.isPalindromeMystery("abba"));

        // vypise referenciu/id/rodne cislo
        System.out.println(jozef);

        // niekto referencuje ten isty objekt ako jozef
        SmartTeddy niekto = jozef;
        // true lebo referncie sa rovnaju
        System.out.println(niekto == jozef);

        //String nic = null;
        //int dlzka = nic.length();
        //String prazdny = "";
        //prazdny.length();
        //niekto = null;
        //jozef = null;
        jozef.printBillions(15);
        jozef.day();
        // nevieme zavolat lebo je to privatna metoda
        //jozef.randomNumber(0,7);

        System.out.println(jozef.heightsAverage());

        for (int i = 0; i < 10; i++) {
            System.out.println(jozef.randomName());
        }

        Kalendar today = new Kalendar();
        today.year = 2019;
        today.month = 3;
        today.day = 28;
        Kalendar future = jozef.tenYearsLaterCorrect(today);
        System.out.println(future.year);

        System.out.println("dnes je rok " + today.year);

        Calendar calToday = Calendar.getInstance();
        System.out.println(calToday.getTime());
        calToday.add(Calendar.YEAR, 10);

        int[] array = new int[4];
        array[1] = 1024;
        System.out.println(array[1]);
        System.out.println(array);

        System.out.println(Arrays.toString(array));
    }

}

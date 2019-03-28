package sk.elct;

public class App {

    public static void main(String[] args) {
        SmartTeddy jozef = new SmartTeddy();
        String song = "Tancuj vykrucaj";
        String teddySong = jozef.sing(song, '*');
        System.out.println(teddySong);

        System.out.println(jozef.abbreviation("sl"));

        System.out.println(jozef.generateWord('A', 3));

        System.out.println(jozef.reverseString("stressed"));

        System.out.println(jozef.numbersCount("a1bcd87f9"));

        System.out.println(jozef.isPalindrome("abba"));
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

    }

}

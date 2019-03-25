package sk.elct;

import sk.upjs.jpaz2.ObjectInspector;

public class App {

    public static void main(String[] args) {
        // ObjectInspector o = new ObjectInspector();
        // String veta = "dnes je pondelok";
        // o.inspect(veta);

        SmartTeddy jozef = new SmartTeddy();
        String song = "Tancuj vykrucaj";
        String teddySong = jozef.sing(song, '*');
        System.out.println(teddySong);

        System.out.println(jozef.abbreviation("sl"));

        System.out.println(jozef.generateWord('A', 3));

        System.out.println(jozef.reverseString("stressed"));

    }

}

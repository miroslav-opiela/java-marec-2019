package sk.elct;

public class SmartTeddy {

    public String sing(String song, char letter) {
        String newSong = song.replace('r', letter);
        return newSong;
    }

    public String abbreviation(String s) {
        // ak je vstupny string kratsi ako 3 znaky
        if (s.length() < 3) {
            // return ukonci metodu
            return s.toUpperCase();
        }

        // mam istotu ze string ma aspon 3 znaky
        s = s.substring(0, 3);
        return s.toUpperCase();
    }

    public String generateWord(char c, int count) {
        String s = "";

        for (int i = 0; i < count; i++) {
            s = s + c;
            // verzia ktora vygeneruje A0A1A2...
            // s = s + c + i;
        }

        return s;
    }

    public String reverseString(String s) {
        String reversed = "";
        for (int i = 0; i < s.length(); i++) {
            reversed = s.charAt(i) + reversed;
        }
        return reversed;
    }

}

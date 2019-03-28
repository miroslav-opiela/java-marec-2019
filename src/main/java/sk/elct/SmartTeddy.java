package sk.elct;

public class SmartTeddy {

    public String sing(String song, char letter) {
        String newSong = song.replace('r', letter);
        return newSong;
    }

    public String abbreviation(String s) {
        if (s.length() < 3) {
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
        // A0A1A2
        //s = s + c + i;
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

    public int numbersCount(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                //counter = counter + 1; 
                counter++;
            }
        }
        return counter;
    }

    public boolean hasSameCharacters(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            // ak je znak na pozicii i a i+1 rozny
            if (s.charAt(i) != s.charAt(i + 1)) {
                // nasiel sa iny znak, 
                // retazec urcite nema vsetky znaky rovnake 
                return false;
            }
        }
        // nenasla sa ziadna dvojica roznych znakov
        // retazec ma teda vsetky znaky rovnake
        return true;
    }

    public boolean isPalindrome(String s) {
        // celociselne delenie 3/2=1
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeMystery(String s) {
        String reversed = this.reverseString(s);
        // porovnavam obsah stringov
        // s == reversed by porovnavalo referencie
        return s.equals(reversed);
    }

    public void printBillions(int count) {
        long number = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(number);
            number = number + 1000000000;
        }
    }

    public void day() {
        int number = (int) (Math.random() * 7);
        // alternativne s pouzitim pomocnej private metody
        // this.randomNumber(0, 7);
        System.out.println("nahodne cislo");
        System.out.println(number);
        switch (number) {
            case 0:
                System.out.println("pondelok");
                break;
            case 1:
                System.out.println("utorok");
                break;
            default:
                System.out.println("hocico ine");
                break;
        }
    }

    private int randomNumber(int from, int to) {
        return (int) (Math.random() * (to - from) + from);
    }

}

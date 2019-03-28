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

    public static boolean isPalindrome(String s) {
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

    public double heightsAverage() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int h = this.randomNumber(150, 200);
            sum = sum + h;
            //iny zapis sum += h;
            System.out.println("vygeneroval som " + h);
        }
        return sum / 6.0;
    }

    public char randomChar(String s) {
        //1. vygenerovat nahodne cislo od 0 po dlzku stringu
        int index = this.randomNumber(0, s.length());
        //2. zistit aky char je na danom indexe
        char c = s.charAt(index);
        //3. vratit ten znak
        return c;
    }

    public String randomName() {
        //1. zaobstarat si stringy spoluhlasky a samohlasky
        String consonants = "bcdfghjklmnprstvz";
        String vowels = "aeiouy";
        //2. vygenerovat si nahodnu dlzku retazca
        int length = this.randomNumber(4, 8);
        //3. v cykle generovat 
        //- ak parny index tak nahodnu spoluhlasku
        //- ak neparny index tak nahodnu samohlasku
        String name = "";
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                name = name + this.randomChar(consonants);
            } else {
                name = name + this.randomChar(vowels);
            }
        }
        //4. vratit referenciu na vytvoreny string
        return name;
    }

    public Kalendar tenYearsLater(Kalendar date) {
        date.year += 10;
        return date;
    }

    public Kalendar tenYearsLaterCorrect(Kalendar date) {
        Kalendar newDate = new Kalendar();
        newDate.day = date.day;
        newDate.month = date.month;
        newDate.year = date.year + 10;
        return newDate;
    }

    public void reduceBigValues(int[] numbers, int value) {
        // prejst v cykle pole
        // ak je hodnota vacsia ako value, tak zmenit
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > value) {
                numbers[i] = value;
            }
        }
        // nic nevrati
    }

    public String[] addToArray(String[] array, String value) {
        // vyrobit pole o 1 vacsie
        String[] newArray = new String[array.length + 1];
        // skopirovat prvky
        // kopirujem z array index 0 do newArray index 0,
        // pocet kopirovanych prvkov je array.length
        System.arraycopy(array, 0, newArray, 0, array.length);
        // prihodit na koniec value
        newArray[newArray.length - 1] = value;
        // vratit referenciu
        return newArray;
    }

}

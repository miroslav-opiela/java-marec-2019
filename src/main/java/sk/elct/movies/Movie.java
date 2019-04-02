package sk.elct.movies;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Movie {

    /**
     * Nazov filmu.
     */
    private String title;

    /**
     * Rok vydania.
     */
    private int year;

    /**
     * Zanre.
     */
    private String[] genres;

    public Movie() {
        //this.title = "n/a";
        // volam druhy konstruktor
        this("n/a", 2019, null);
    }

    public Movie(String title, int year, String[] genres) {
        this.title = title;
        // chcem kontrolu roku
        setYear(year);
        this.genres = genres;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Nastavi rok vydania.
     *
     * @param year rok vydania. Ak je rok mensi ako 1890 alebo vacsi ako 2025
     * tak sa nastavi default rok 2019.
     */
    public void setYear(int year) {
        if (year < 1890 || year > 2025) {
            this.year = 2019;
        } else {
            this.year = year;
        }
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String[] getGenres() {
        //return genres.clone();
        return Arrays.copyOf(genres, genres.length);
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title
                + ", year=" + year
                + ", genres=" + Arrays.toString(genres) + '}';
    }

    /**
     * Vyrobi zo stringu objekt.
     *
     * @param s String vo formate nazov;rok;zaner1,zaner2...
     * @return
     */
    public static Movie fromString(String s) {
        Scanner sc = new Scanner(s);
        sc.useDelimiter(";");
        Movie m = new Movie();
        m.setTitle(sc.next());
        m.setYear(sc.nextInt());
        // ak tam je este nieco dalsie, tak to spracuje
        if (sc.hasNext()) {
            String genres = sc.next();
            String[] arrayOfGenres = genres.split(",");
            m.setGenres(arrayOfGenres);
            // alternativne v jednom riadku
            //m.setGenres(sc.next().split(","));
        } else {
            // ak tam nic nie je, tak nastavim zanre ako prazdne pole
            m.setGenres(new String[0]);
        }

        return m;
    }

    /**
     * Metoda toString ktora vyrobi string kompatibilny s metodou fromString
     *
     * @return
     */
    public final String toCsvString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(";");
        sb.append(year);
        sb.append(";");
        for (String genre : genres) {
            sb.append(genre);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String getLocation() {
        return "unknown location";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + this.year;
        hash = 59 * hash + Arrays.deepHashCode(this.genres);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.deepEquals(this.genres, other.genres)) {
            return false;
        }
        return true;
    }

}

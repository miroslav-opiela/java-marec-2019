package sk.elct.movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieLibrary {

    /**
     * Zoznam filmov.
     */
    private List<Movie> movies;

    /**
     * Vyrobi novu filmoteku zatial s 0 filmami.
     */
    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    /**
     * Vlozi zadany film do filmoteky.
     *
     * @param m film.
     */
    public void insert(Movie m) {
        movies.add(m);
    }

    public void insert(String title) {
        Movie m = new Movie(title, 0, new String[0]);
        movies.add(m);
        // alternativne insert(m);
    }

    /**
     * Vrati pocet filmov vo filmoteke.
     *
     * @return
     */
    public int moviesSize() {
        return movies.size();
    }

    /**
     * Vsetky filmy sa ulozia do suboru.
     *
     * @param filename nazov suboru.
     */
    public void save(String filename) {
        File file = new File(filename);
        try (PrintWriter pw = new PrintWriter(file)) {
            // zapisovanie
            for (Movie m : movies) {
                pw.println(m.toCsvString());
            }

        } catch (FileNotFoundException e) {
            System.out.println("neexistujuci subor " + filename);
        }

    }

    /**
     * Vytvori sa novy objekt MovieLibrary s filmami nacitanymi zo suboru.
     *
     * @param filename nazov suboru.
     * @return referencia na objekt triedy MovieLibrary. Ak subor neexistuje,
     * obsahuje prazdny zoznam filmov.
     */
    public static MovieLibrary load(String filename) {
        MovieLibrary m = new MovieLibrary();
        File file = new File(filename);
        try (Scanner sc = new Scanner(file)) {

            // nacitavanie
            while (sc.hasNextLine()) {
                m.insert(Movie.fromString(sc.nextLine()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Neexistujuci subor " + filename);
        }
        return m;
    }

}

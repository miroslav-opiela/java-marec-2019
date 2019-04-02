package sk.elct.movies;

public class MoviesApp {

    public static void main(String[] args) {
        Movie lordOfTheRings1 = new Movie();
        System.out.println(lordOfTheRings1);
        lordOfTheRings1.setTitle("Pan Prstenov");
        lordOfTheRings1.setYear(-1);
        String[] genres = new String[]{"fantasy",
            "dobrodruzny", "akcny"};
        lordOfTheRings1.setGenres(genres);

        System.out.println(lordOfTheRings1);
        System.out.println(lordOfTheRings1.getTitle());
        System.out.println(lordOfTheRings1.toString());

        String[] hpGenres = new String[]{"fantasy", "dobrodruzny", "rodinny"};
        Movie harryPotter1
                = new Movie("Harry Potter 1", -1, hpGenres);
        System.out.println(harryPotter1);
        
        MovieLibrary seenMovies = new MovieLibrary();
        seenMovies.insert(harryPotter1);
        seenMovies.insert(lordOfTheRings1);
        seenMovies.insert("pasla kone na betone");
        System.out.println(seenMovies.moviesSize());
        
        Movie xmen = Movie.fromString("X-Men;2006;fantasy,akcny");
        System.out.println(xmen);
        seenMovies.insert(xmen);
        System.out.println(xmen.toCsvString());
        
        seenMovies.save("seen_movies.csv");
        
        MovieLibrary myLibrary = MovieLibrary.load("seen_movies.csv");
        System.out.println(myLibrary.moviesSize());
        
        myLibrary.save("test.txt");
        
        
        Movie starWars = new MovieHDD("Star wars4",
                1977, new String[]{"sci-fi"}, 
                "D://Movies/starwars4.mp4");
        /*if (starWars instanceof MovieHDD) {
            MovieHDD s = (MovieHDD) starWars;
            s.getLocation();
        }*/
        MovieDVD alien = new MovieDVD("Alien", 
                1987, new String[]{"sci-fi"}, 15);
        
        System.out.println(xmen.getLocation());
        System.out.println(alien.getLocation());
        System.out.println(starWars.getLocation());
        
        
        System.out.println(starWars.toString());
        
    }

}

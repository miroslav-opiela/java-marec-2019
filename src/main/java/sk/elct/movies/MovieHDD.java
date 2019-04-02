package sk.elct.movies;

import java.io.File;

public class MovieHDD extends Movie {

    private File fileLocation;
    
    /*
    public MovieHDD(){
        super();
    }
    */

    public MovieHDD(String title, int year, 
            String[] genres, String filename) {
        super(title, year, genres);
        this.fileLocation = new File(filename);
    }
    
    
    @Override
    public String getLocation() {
        return fileLocation.getAbsolutePath();
    }

    @Override
    public String toString() {
        return super.toString() 
                + " location: " + this.getLocation(); 
    }
    
    
}

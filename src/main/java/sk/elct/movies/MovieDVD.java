package sk.elct.movies;

public final class MovieDVD extends Movie {

    private final int dvdId;

    public MovieDVD(String title, int year,
            String[] genres, int dvdId) {
        super(title, year, genres);
        this.dvdId = dvdId;
    }
    
    @Override
    public String getLocation() {
        return "DVD id:" + dvdId;
    }

    
    
    

 
    

}

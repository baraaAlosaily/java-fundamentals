package inheritance2;

import java.util.ArrayList;

public class Theater extends Review {
    private String movieName;
    protected ArrayList<Review> reviews = new ArrayList<>();
    protected ArrayList<String> movies = new ArrayList<>();
    private float numberOfStarrs = 0;
    private float starsSum = 0;
    private int revCounter=0;

    public Theater(String movieName, float numberOfStarrs) {
        super(numberOfStarrs);
        this.movieName = movieName;
        this.numberOfStarrs = numberOfStarrs;
    }

    public void PutMovies(String movie) {
        this.movies.add(movie);
    }

    public void DeleteMovies(String movie) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (movies.get(i).equals(movie)) {
                movies.remove(i);
                break;
            }
        }
        System.out.println(movies);
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getNumberOfStarrs() {
        return numberOfStarrs;
    }

    public void setNumberOfStarrs(float numberOfStarrs) {
        this.numberOfStarrs = numberOfStarrs;
    }

    @Override
    public String toString() {
        return "Theater is {" +movieName + "}"+"{"+numberOfStarrs+"}"+reviews+"\n"+"My Movies List"+"{" +movies + "}" ;
    }

    public void revmovies(String body,String auther,float numberOfStarrs) {
        if (numberOfStarrs > 0 && numberOfStarrs <= 5) {
            Review rev = new Review(body, auther, numberOfStarrs);
            this.starsSum += rev.getNumberOfStarrs();
            this.revCounter += 1;
            this.numberOfStarrs = this.starsSum / this.revCounter;
            this.reviews.add(rev);
        } else {
            System.out.println("Please add number beteen 0 and 5");
            return;
        }
    }
}
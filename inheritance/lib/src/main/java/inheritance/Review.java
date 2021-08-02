package inheritance;

import java.util.ArrayList;

public class Review extends ArrayList<Review> {
    private String body;
    private String author;
    private float numberOfStarrs;
    private Restaurant resturant;

    public Review(String body, String author, float numberOfStarrs) {
        this.body = body;
        this.author = author;
        this.numberOfStarrs = numberOfStarrs;
    }

    public Review() {
        setNumberOfStarrs(numberOfStarrs);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getNumberOfStarrs() {
        return numberOfStarrs;
    }

    public void setNumberOfStarrs(float numberOfStarrs) {
        if(numberOfStarrs <= 5 && numberOfStarrs >= 0) {
//            System.out.println("baraa");
            this.numberOfStarrs = numberOfStarrs;
        }else {
            System.out.println("Enter review between 5 and 0");
        }
    }
    public String toString() {
//        System.out.println("Review {" + body +"}"+" Auther {"+ author +"}"+" Rate {"+ stars + "}");
        return "Review {" + body +"}"+" Auther {"+ author +"}"+" Rate {"+ numberOfStarrs + "}";
    }
}
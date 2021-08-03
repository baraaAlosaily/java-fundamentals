package inheritance2;

import java.util.ArrayList;

public class Restaurant extends Review{
    private String nameOfRes="";
    private float numberOfStarrs=0;
    private float PriceCat=0;
    private float starsSum=0;
    private int revCounter=0;
    protected ArrayList<Review>reviews=new ArrayList<>();


//
//    public Restaurant(){
//        super(numberOfStarrs);
//        setNumberOfStarrs(numberOfStarrs);
//    }

    public Restaurant(String nameOfRes, float numberOfStarrs, float priceCat){
        super(numberOfStarrs);
        this.nameOfRes=nameOfRes;
        this.numberOfStarrs=numberOfStarrs;
        this.PriceCat = priceCat;
    }
    public String getNameOfRes() {
        return nameOfRes;
    }

    public void setNameOfRes(String nameOfRes) {
        this.nameOfRes = nameOfRes;
    }

//    public float getNumberOfStarrs() {
//        return numberOfStarrs;
//    }
//
//    public void setNumberOfStarrs(float numberOfStarrs) {
//        if(numberOfStarrs>0&&numberOfStarrs<=5){
//            System.out.println("baraa");
//            this.numberOfStarrs = numberOfStarrs;
//        }else {
//            System.out.println("Enter number between 0 and 5");
//            return;
//        }
//    }

    public float getPriceCat() {
        return PriceCat;
    }

    public void setPriceCat(float priceCat) {
        PriceCat = priceCat;
    }
    public void printRes(){
        System.out.println("Baraa");
    }

    @Override
    public String toString(){
//        Review rev=new Review("It is a good resturant","baraa",5);
//        Review rev2=new Review("It is a gbhhhood resturant","baraahvh",3);
//        Review rev3=new Review("It is a gbhhhood resturant","baraahvh",10);
//        addReview(rev);
//        addReview(rev2);
//        addReview(rev3);
//        System.out.println("Resturant Name {"+nameOfRes+"}"+" Rate {"+numberOfStarrs+"}"+" Price Cat {"+PriceCat+"}");
        return "Resturant Name {"+nameOfRes+"}"+" Rate {"+numberOfStarrs+"}"+" Price Cat {"+PriceCat+" $ }\n"+reviews+"\n";
    }

    public void addReview(String body,String auther,float numberOfStarrs){
        if (numberOfStarrs>0&&numberOfStarrs<=5){
            Review rev1=new Review(body,auther,numberOfStarrs);
            this.starsSum+= rev1.getNumberOfStarrs();
            this.revCounter+=1;
            this.numberOfStarrs=this.starsSum/this.revCounter;
            this.reviews.add(rev1);
        }else {
            System.out.println("Please add number beteen 0 and 5");
            return;
        }

    }
}


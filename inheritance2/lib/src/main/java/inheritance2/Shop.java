package inheritance2;

import java.util.ArrayList;

public class  Shop extends Review {
    private String shopName;
    private String shopDesc;
    private String dollarSign;
    private float numberOfStarrs=0;
    private float starsSum=0;
    private int revCounter=0;
    protected ArrayList<Review> reviews=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }


    public float getNumberOfStarrs() {
        return numberOfStarrs;
    }

    public void setNumberOfStarrs(float numberOfStarrs) {
        this.numberOfStarrs = numberOfStarrs;
    }
//    public Shop(){
//        super(numberOfStarrs);
//        setNumberOfStarrs(numberOfStarrs);
//    }

    public Shop(String shopName,String shopDesc,float numberOfStarrs,int dollarSign) {
        super(numberOfStarrs);
        this.shopName = shopName;
        this.shopDesc = shopDesc;
        this.numberOfStarrs=numberOfStarrs;
        for (int i=0;i<dollarSign;i++){
            this.dollarSign+="$";
        }

    }
    @Override
    public String toString(){
        return "Shop name is {"+shopName+"}"+" Shop description {"+shopDesc+"}"+" Number of starts {" +numberOfStarrs+"}"+" Price Categories {"+dollarSign+"}"+"\n"+reviews+"\n";
    }
    public void addShoprev(String body,String auther,float numberOfStarrs) {
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

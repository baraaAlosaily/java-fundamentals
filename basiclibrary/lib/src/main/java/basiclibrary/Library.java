/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;
        import java.util.Arrays;
public class Library {


    public static void main(String[] args) {
        System.out.println("Hello Worldbggbgbgbgb!");
        int numRolls=4;
        int[]myRolls=roll(numRolls);
        containsDuplicate(myRolls);
        average(myRolls);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int[] myArray= lowestTemp(weeklyMonthTemperatures);
        System.out.print("The array that have minum average is :[");
        for (int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+",");
        }
        System.out.print(myArray[myArray.length-1]+"]");
        System.out.println();
//        analyzeWeather(weeklyMonthTemperatures);
        System.out.println(analyzeWeather(weeklyMonthTemperatures));
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    public static int[] roll( int n) {
        int[] array=new int[n];
        int min = 1;
        int max = 6;

        //Generate random int value from 50 to 100
        for(int i=0;i<n;i++) {
            array[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(array[i]);
        }
        return array;
    }
    public static boolean containsDuplicate(int[]myRolls) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<myRolls.length; i++) {
            if (hm.get(myRolls[i])!=null)
            {
                System.out.println("true");
                return true;}
            else{ hm.put(myRolls[i], 1);
            }
        }
        System.out.println("false");
        return false;
    }
    public static double average(int[]myRolls){
        double sum=0;
        for (int i=0;i<myRolls.length;i++){
            sum=sum+myRolls[i];
        }
        System.out.println(sum/myRolls.length);
        return sum/myRolls.length;

    }
    public static int[] lowestTemp ( int[][] array){
        List<Double> averageCollection=new ArrayList<Double>();
        for(int i=0;i<array.length;i++){
            double sum=0;
            for (int j=0;j<array[i].length;j++){
                sum+=array[i][j];
            }
            averageCollection.add(sum/array[i].length);
        }
        System.out.println("The min value is of average at index:"+averageCollection.indexOf(Collections.min(averageCollection)));
        return array[averageCollection.indexOf(Collections.min(averageCollection))];
    }
    public static String analyzeWeather(int[][] array){
        HashSet<Integer> hSetNumbers  = new HashSet<>();
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                hSetNumbers.add(array[i][j]);

            }

        }
        List<Integer> cityList = new ArrayList<>(hSetNumbers);
        Collections.sort(cityList);
        int min =Collections.min(hSetNumbers);
        int max =Collections.max(hSetNumbers);
        System.out.println("High: " + max );
        System.out.print("Low: " + min );

        String missT="";
        for (int i=min;i<=max;i++){
            if (!cityList.contains(i)){
                missT+="\nNever saw temperature:"+i;
            }

        }

        return missT;
    }
    public static String tally(List<String> votes) {
        Map<String,Integer> count  = new HashMap<>() ;
        for ( String word : votes) {
            if (! count.containsKey(word)) {
                count.put(word, 1 ) ;
            }

            else {
                int value = count.get(word) ;
                value++ ;

                count.put(word, value) ;
            }
        }
        String mostCommons="";

        for ( Map.Entry<String,Integer> e : count.entrySet() ) {

            if (e.getValue() == Collections.max(count.values() )){

                mostCommons=e.getKey() ;
            }
        }

        return mostCommons;

    }


}


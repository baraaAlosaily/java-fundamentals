
package basiclibrary;



import java.util.ArrayList;
import java.util.List;
public class LibraryTest {
@Test void temperature(){
    int[][] input = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    String output ="\nNever saw temperature:63"+"\nNever saw temperature:67"+"\nNever saw temperature:68"+"\nNever saw temperature:69";

    assertEquals(output,  analyzingWeatherData(input));


}

    @Test public void testtallymethod() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Bush");
        nameList.add("Bush");
        nameList.add("Shrub");
        nameList.add("Hedge");
        nameList.add("Shrub");
        nameList.add("Bush");
        nameList.add("Hedge");
        nameList.add("Bush");
        nameList.add("Bush");
        String nameString = "Bush";
        System.out.println(Library.tally(nameList));

        assertEquals( nameString ,Library.tally(nameList));
    }
}

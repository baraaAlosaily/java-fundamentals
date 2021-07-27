

import org.junit.Test;
import static org.junit.Assert.*;
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static basiclibrary.Library.*;
import static org.junit.jupiter.api.Assertions.*;
public class LibraryTest {
//    @Test public void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
//    }
@Test void temperature(){
    int[][] input = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    String output ="\nnever saw temperature 63"+"\nnever saw temperature 67"+"\nnever saw temperature 68"+"\nnever saw temperature 69";

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

package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static linter.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testingSplinter(){


        // testing for a no errors js file
        String noErrOut = "";
        Path noErrorFile = Paths.get("../linter/app/src/main/resources/gates.js");

        assertEquals(noErrOut,javaScriptLinter(noErrorFile));



        String oneErrOut = "Line 3: Missing semicolon.\n";
        Path oneErrorFile = Paths.get("../linter/app/src/main/resources/gates.js");

        assertEquals(oneErrOut,javaScriptLinter(oneErrorFile));




        String someErrOut = "Line 3: Missing semicolon.\n"+"Line 5: Missing semicolon.\n";
        Path someErrorsFile = Paths.get("src/main/resources/testSomeError.js");

        assertEquals(someErrOut,javaScriptLinter(someErrorsFile));



    }
}
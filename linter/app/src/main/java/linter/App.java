import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class App {
    public static void baraa(String[] args){
        System.out.println('H');
    }

    public static void main(String[] args) {
        int lineIncre = 0;
        Path path = Paths.get("../linter/app/src/main/resources/gates.js");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                lineIncre++;
                if (!(line.isEmpty())) {
                    if (line.contains("if") || line.contains("else")||line.contains(";")||line.contains("}")||line.contains("{")) {
                    } else {
                        System.out.println("line" + lineIncre + " missing simicolon.");
                    }
                }
            }
        } catch (IOException exception) {
            System.out.println("An error occurred while reading from file");
        }

    }
}

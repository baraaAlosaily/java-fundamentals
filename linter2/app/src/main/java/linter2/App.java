package linter2;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path path;
        path = Paths.get("../linter2/app/src/main/resources/gates.js");
        javaScriptLinter(path);
    }
        public static String javaScriptLinter(Path path){
            int lineIncre = 0;
            String errorMsg="";

            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : lines) {
                    lineIncre++;
                    if (!(line.isEmpty())) {
                        if (line.contains("if") || line.contains("else") || line.contains(";") || line.contains("}") || line.contains("{")) {
                        } else {
                            System.out.println(" Line " + lineIncre + " : Missing semicolon.");
                            errorMsg+=" Line " + lineIncre + " : Missing semicolon.\n";
                        }
                    }
                }
            } catch (IOException exception) {
                System.out.println("An error occurred while reading from file");
            }
            return errorMsg;
        }

}


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/romeo-and-juliet.txt")).useDelimiter("\\W+");
        FileWriter writer = new FileWriter("src/longWord");
        String longWord = "";
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println(longWord);
        writer.write(longWord);
        writer.close();
    }
}
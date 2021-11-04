import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

/**
 * The Application class reads the words and definitions from the .csv file,
 * stores them in a hashmap, prints the hashmap, then searches for five different entries, printing each.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-11-4
 */
public class Application {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>();
            Scanner scan = new Scanner(new File("DictionaryWordValuePairs.csv"));
            while (scan.hasNext()) {
                String newLine = scan.nextLine();
                newLine = newLine.replace("\"", "");
                String[] splitString = newLine.split(",", 2);
                map.put(splitString[0], splitString[1]);
            }
            System.out.println(map + "\n");
            System.out.println("Word: ague; Definition: " + map.get("ague") + "; Hashcode: " + "ague".hashCode() + ";");
            System.out.println("Word: damsel; Definition: " + map.get("damsel") + "; Hashcode: " + "damsel".hashCode() + ";");
            System.out.println("Word: espousal; Definition: " + map.get("espousal") + "; Hashcode: " + "espousal".hashCode() + ";");
            System.out.println("Word: goody; Definition: " + map.get("goody") + "; Hashcode: " + "goody".hashCode() + ";");
            System.out.println("Word: horse-coper; Definition: " + map.get("horse-coper") + "; Hashcode: " + "horse-coper".hashCode() + ";");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
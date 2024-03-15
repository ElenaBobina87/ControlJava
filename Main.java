import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Methods m = new Methods();
        String str = m.inputInFile("input.txt");
        System.out.println("В строке " + m.quantityWords(str) + " слов");
        m.bigestWord(str);
        HashMap<String, Integer> listFruits = m.convertToHashMap(str);
        System.out.println(listFruits);
    }
}
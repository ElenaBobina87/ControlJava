import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Methods {

    public String inputInFile2(String name) throws FileNotFoundException, IOException {
        try (FileReader reader = new FileReader(name)) {
            String str = reader.toString();
            return str;
        }
    }
    
    public String inputInFile(String nameFile) {
        String str;
        try {
            str = Files.readString(Path.of(nameFile));
            return str;
        } catch (IOException e) {
            System.err.println("Exception!!!");
            e.printStackTrace();
            return null;
        }
        
    }

    public String[] convertToArray(String str) {
        String[] list = str.split(" ");
        return list;
    }

    public HashMap<String, Integer> convertToHashMap(String str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] list = convertToArray(str);
        for (int index = 0; index < list.length; index++) {
            if (hashMap.containsKey(list[index])) {
                hashMap.put(list[index], hashMap.get(list[index]) + 1);
            } else {
                hashMap.put(list[index], 1);
            }
        }
        return hashMap;
    }

    public int quantityWords(String str) {
        int res;
        String[] list = convertToArray(str);
        res = list.length;
        return res;
    }

    public void bigestWord(String str) {
        String res = null;
        int quantitylitters = 0;
        String[] list = convertToArray(str);
        for (int index = 0; index < list.length; index++) {
            if (list[index].length() > quantitylitters) {
                quantitylitters = list[index].length();
                res = list[index];
            } 
        }
        System.out.println("Самое длинное слово: " + res);
        
    }
}

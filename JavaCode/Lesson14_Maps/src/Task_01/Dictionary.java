package Task_01;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    String baseOfLanguageFrom;
    String baseOfLanguageTo;
    Map<String, String> map;
    boolean initiated;

    public Dictionary(String baseOfLanguageFrom, String baseOfLanguageTo) {
        this.baseOfLanguageFrom = baseOfLanguageFrom;
        this.baseOfLanguageTo = baseOfLanguageTo;

        this.initiated = initiateDictionary();

    }

    public String translate(String word){

        String value = map.get(word);

        return value;
    }

    private boolean initiateDictionary() {

        this.map = new HashMap<>();
        File fileFrom = new File(baseOfLanguageFrom);
        File fileTo = new File(baseOfLanguageTo);

        boolean initiated = true;

        try {
            BufferedReader brFrom = new BufferedReader(new FileReader(fileFrom.getAbsoluteFile()));
            BufferedReader brTo = new BufferedReader(new FileReader(fileTo.getAbsoluteFile()));

            String key;
            while ((key = brFrom.readLine()) != null) {

                map.put(key, brTo.readLine());


            }

            brFrom.close();
            brTo.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            initiated = false;
        } catch (IOException e) {
            e.printStackTrace();
            initiated = false;
        }

        return initiated;
    }
}

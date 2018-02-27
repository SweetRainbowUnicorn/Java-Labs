package llllab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    private List<String> words = new LinkedList<>();

    public List<String> getWords() {
        return words;
    }

    public String readInputText() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String" + "\n");
        return br.readLine();
    }


    public void processText(String inputText) {
        Pattern p = Pattern.compile("\\w+-\\w+");
        Matcher m = p.matcher(inputText);
        while (m.find()) {
            words.add(inputText.substring(m.start(), m.end()));
        }
    }

    public void showResult(List<String> list) {
        words.sort(String::compareTo);
        System.out.println(words);
    }

}

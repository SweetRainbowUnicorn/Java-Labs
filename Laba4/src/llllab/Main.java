package llllab;

import java.io.IOException;

public class Main {
    public static void main (String[] args){
        StringProcessor stringProcessor = new StringProcessor();
        try {
            stringProcessor.processText(stringProcessor.readInputText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stringProcessor.showResult(stringProcessor.getWords());
    }
}

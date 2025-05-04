package Homework19;

import java.util.regex.Pattern;

public class LineWithWordObserver implements Observer{
    private final Pattern pattern = Pattern.compile("\\s+");
    private String word = "";
    private String lineWithWord = "";
    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        for(int i=0;i<words.length;i++){
            if(words[i].length()>word.length()){
                word=words[i];
                lineWithWord = line;
            }
        }
    }

    public String getLineWithWord(){
        return lineWithWord;
    }
}

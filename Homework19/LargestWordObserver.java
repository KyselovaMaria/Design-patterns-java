package Homework19;

import java.util.regex.Pattern;

public class LargestWordObserver implements Observer {
    private final Pattern pattern = Pattern.compile("\\s+");
    private String word = "";
    @Override
    public void update(String line) {
        String[] words = pattern.split(line);
        for(int i=0;i<words.length;i++){
            if(words[i].length()>word.length()){
                word=words[i];
            }
        }
    }

    public String getWord(){
        return word;
    }
}

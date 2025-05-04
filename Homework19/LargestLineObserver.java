package Homework19;

public class LargestLineObserver implements Observer{
    private String largestLine = "";
    @Override
    public void update(String line) {
        if(largestLine.length()<line.length()){
            largestLine=line;
        }
    }

    public String getLargestLine(){
        return largestLine;
    }
}

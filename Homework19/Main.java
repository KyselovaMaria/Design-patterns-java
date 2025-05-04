package Homework19;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/Homework19/input01.txt");
        LargestLineObserver largestLineObserver = new LargestLineObserver();
        LargestWordObserver largestWordObserver = new LargestWordObserver();
        CounterObserver counterObserver = new CounterObserver();
        LineWithWordObserver lineWithWordObserver = new LineWithWordObserver();

        fileReader.addObserver(largestLineObserver);
        fileReader.addObserver(largestWordObserver);
        fileReader.addObserver(counterObserver);
        fileReader.addObserver(lineWithWordObserver);

        fileReader.read();


        System.out.println("Largest word: " + largestWordObserver.getWord());
        System.out.println("Largest line: " + largestLineObserver.getLargestLine());
        System.out.println("Line with largest word: " + lineWithWordObserver.getLineWithWord());
        System.out.println("Amount of words: " + counterObserver.getCounter());
    }

}

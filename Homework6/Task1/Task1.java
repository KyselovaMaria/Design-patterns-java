package Homework6.Task1;

public class Task1 {
    public static void main(String[] args) {
        String filename = "Task1/input.txt";
        FileReader fileReader = FileReader.getInstance();

        System.out.println("=== File Content ===");
        fileReader.printFile(filename);

        System.out.println("\n=== Word Count ===");
        fileReader.countWords(filename);
    }
}

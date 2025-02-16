package Homework6.Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private static final FileReader instance = new FileReader();

    private FileReader() {}

    public static FileReader getInstance() {
        return instance;
    }

    public String readFile(String filename) {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return "";
        }
    }

    public void printFile(String filename) {
        String fileContent = readFile(filename);
        if (!fileContent.isEmpty()) {
            System.out.println(fileContent);
        } else {
            System.out.println("The file is empty or could not be read.");
        }
    }

    public void countWords(String filename) {
        String fileContent = readFile(filename);
        if (fileContent.isEmpty()) {
            System.out.println("No words found (empty file or error reading).");
            return;
        }
        String[] words = fileContent.trim().split("\\s+");
        System.out.println("Amount of words in file: " + words.length);
    }
}

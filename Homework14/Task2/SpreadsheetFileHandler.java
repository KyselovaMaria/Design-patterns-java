package Homework14.Task2;


import java.util.Arrays;

public class SpreadsheetFileHandler extends FileHandler {
    private static final String[] SUPPORTED_EXTENSIONS = {"xls", "xlsx"};

    @Override
    protected boolean canHandle(String fileName) {
        String extension = getExtension(fileName);
        return Arrays.stream(SUPPORTED_EXTENSIONS).anyMatch(ext -> ext.equalsIgnoreCase(extension));
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Opening spreadsheet file: " + fileName);
    }
}
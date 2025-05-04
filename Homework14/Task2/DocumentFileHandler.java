package Homework14.Task2;

import java.util.Arrays;

public class DocumentFileHandler extends FileHandler {
    private static final String[] SUPPORTED_EXTENSIONS = {"docx", "doc", "pdf"};

    @Override
    protected boolean canHandle(String fileName) {
        String extension = getExtension(fileName);
        return Arrays.stream(SUPPORTED_EXTENSIONS).anyMatch(ext -> ext.equalsIgnoreCase(extension));
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Opening document file: " + fileName);
    }
}


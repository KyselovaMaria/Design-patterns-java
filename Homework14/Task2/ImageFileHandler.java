package Homework14.Task2;

import java.util.Arrays;

public class ImageFileHandler extends FileHandler {
    private static final String[] SUPPORTED_EXTENSIONS = {"jpg", "png"};

    @Override
    protected boolean canHandle(String fileName) {
        String extension = getExtension(fileName);
        return Arrays.stream(SUPPORTED_EXTENSIONS).anyMatch(ext -> ext.equalsIgnoreCase(extension));
    }

    @Override
    protected void open(String fileName) {
        System.out.println("Opening image file: " + fileName);
    }
}
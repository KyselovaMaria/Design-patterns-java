package Homework14.Task2;

public abstract class FileHandler {
    private FileHandler nextHandler;

    public FileHandler setNext(FileHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public void openFile(String fileName) {
        if (canHandle(fileName)) {
            open(fileName);
        } else if (nextHandler != null) {
            nextHandler.openFile(fileName);
        } else {
            System.out.println("Cannot open file: " + fileName + ". Unsupported file format.");
        }
    }

    protected abstract boolean canHandle(String fileName);
    protected abstract void open(String fileName);

    protected String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return "";
    }
}
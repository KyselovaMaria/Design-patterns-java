package Homework14.Task2;

public class Client {
    public static void main(String[] args) {
        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };

        FileHandler imageHandler = new ImageFileHandler();
        FileHandler documentHandler = new DocumentFileHandler();
        FileHandler spreadsheetHandler = new SpreadsheetFileHandler();
        FileHandler presentationHandler = new PresentationFileHandler();

        imageHandler.setNext(documentHandler)
                .setNext(spreadsheetHandler)
                .setNext(presentationHandler);

        for (String file : files) {
            imageHandler.openFile(file);
        }
    }
}

package Homework13;

public class Proxy implements DisplayObject{

    private String path;
    private ImageFile file;

    public Proxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (path != null) {
            this.file = new ImageFile(path);
        }
        file.display();
    }
}

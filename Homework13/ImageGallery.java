package Homework13;

public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject[] images = {
                // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
                new Proxy("resources/image1.jpeg"),
                new Proxy("resources/image2.jpeg"),
                new Proxy("resources/image3.jpeg"),
                new Proxy("resources/image4.jpeg"),
                new Proxy("resources/image5.jpeg"),
                new Proxy("resources/image6.jpeg"),
                new Proxy("resources/image7.jpeg"),
                new Proxy("resources/image8.jpeg"),
                new Proxy("resources/image9.jpeg"),
                new Proxy("resources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}
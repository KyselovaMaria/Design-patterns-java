package task18_3_1.inner;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        for (int index = 0; index < edges.length; index++) {
            caretaker.changeSide(edges[index], values[index]);
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("Undo");

        for (int i = 0; i < edges.length; i++){
            caretaker.undo();
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("Restore max square");

        caretaker.restoreMaxSquare();
        System.out.println("Volume = " + triangle.square());


    }

}

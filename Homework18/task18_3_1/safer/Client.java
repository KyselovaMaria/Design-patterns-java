package task18_3_1.safer;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker();

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
            caretaker.addSnapshot(triangle.save());
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }

            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("Undo");

        for (int i = 0; i < edges.length; i++){
            caretaker.undo();
            System.out.println("Volume = " + triangle.square());
        }


    }

}

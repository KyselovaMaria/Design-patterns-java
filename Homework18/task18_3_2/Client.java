package task18_3_2;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1, // "duplicateA",
                6,
                3,
                1, // "halfA"
        };

        System.out.println("============= Some Actions =============");

        for (int index = 0; index < edges.length; index++) {
            caretaker.changeSide(edges[index], values[index]);
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("============= Undo =============");

        for (int i = 0; i < 4; i++){
            caretaker.undo();
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("============= Redo =============");

        for (int i = 0; i < 2; i++){
            caretaker.redo();
            System.out.println("Volume = " + triangle.square());
        }

        System.out.println("============= Action =============");

        caretaker.changeSide("halfA", 1);
        System.out.println("Volume = " + triangle.square());

        System.out.println("============= Redo =============");
        caretaker.redo();
        System.out.println("Volume = " + triangle.square());

        System.out.println("============= End =============");


//        for (int i = 0; i < edges.length; i++){
//            caretaker.undo();
//            System.out.println("Volume = " + triangle.square());
//        }
//
//        System.out.println("Restore min square");
//
//        caretaker.restoreMinSquare();
//        System.out.println("Volume = " + triangle.square());



    }

}

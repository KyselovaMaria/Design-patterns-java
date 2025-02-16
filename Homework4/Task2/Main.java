package Homework4.Task2;

public class Main {
    public static void main(String[] args) {
        StringBuilderCustom builder = new StringBuilderCustom();

        String result = builder
                .append("Hello, ")
                .append("world!")
                .insert(7, "amazing ")
                .delete(0, 6)
                .build();

        System.out.println(result);  // Output: amazing world!
    }
}

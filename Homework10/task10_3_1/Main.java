package task10_3_1;

import task10_3_1.decorators.*;

public class Main {

    public static void main(String[] args) {
//        PrintableString hello = new PrintableString("Hello, World!");
//        hello.print();

        Printable hello = new PostExclaimDecorator(new PostWordDecorator(new PostSpaceDecorator(new PostComaDecorator(new PrintableString("Hello"))), "World"));
        hello.print();

    }

}

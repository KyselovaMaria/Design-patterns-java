package task10_3_1.decorators;

public class PostSpaceDecorator extends BaseDecorator {

    public PostSpaceDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print(" ");
    }

}


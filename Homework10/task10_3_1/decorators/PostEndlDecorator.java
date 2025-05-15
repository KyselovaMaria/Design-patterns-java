package task10_3_1.decorators;

public class PostEndlDecorator extends BaseDecorator {

    public PostEndlDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print("\n");
    }

}


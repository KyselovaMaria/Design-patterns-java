package task10_3_1.decorators;

public class PostExclaimDecorator extends BaseDecorator {

    public PostExclaimDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print("!");
    }

}


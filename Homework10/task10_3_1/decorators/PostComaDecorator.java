package task10_3_1.decorators;

public class PostComaDecorator extends BaseDecorator {

    public PostComaDecorator(Printable string) {
        super(string);
    }

    @Override
    public void print(){
        super.print();
        System.out.print(",");
    }

}

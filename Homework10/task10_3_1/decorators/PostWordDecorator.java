package task10_3_1.decorators;

public class PostWordDecorator extends BaseDecorator {

    final private String word;

    public PostWordDecorator(Printable string, String word) {
        super(string);
        this.word = word;
    }

    @Override
    public void print(){
        super.print();
        System.out.print(word);
    }

}


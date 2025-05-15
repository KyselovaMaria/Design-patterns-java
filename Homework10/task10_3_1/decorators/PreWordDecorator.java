package task10_3_1.decorators;

public class PreWordDecorator extends BaseDecorator {

    final private String word;

    public PreWordDecorator(Printable string, String word) {
        super(string);
        this.word = word;
    }

    @Override
    public void print(){
        System.out.print(word);
        super.print();
    }

}



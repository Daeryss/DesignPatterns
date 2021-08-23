package context;

public interface CopyMachine {

    void addMoneyToState(int money);

    void selectSource(String device);

    void selectFile(String document);

    void print();

}

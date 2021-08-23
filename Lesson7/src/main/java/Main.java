import context.Context;
import context.CopyMachine;

public class Main {
    public static void main(String[] args) {
        CopyMachine context = new Context();

        context.addMoneyToState(4);
        context.selectSource("usb");
        context.selectFile("file 1");
        context.print();
        context.selectSource("usb 2");
        context.selectFile("file 2");
        context.print();


    }
}

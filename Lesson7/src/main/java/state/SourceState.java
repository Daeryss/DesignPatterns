package state;

import context.Context;

public class SourceState implements State {

    public void addMoneyToState(Context context, int money) {
        context.addMoneyToState(money);
        context.setState(new MoneyState());
    }

    @Override
    public void selectSource(Context context, String source) {
        context.setSource(source);
        context.setState(new FileState());
    }

    @Override
    public void selectFile(Context context, String file) {
        System.out.println("select source (source file)");
    }

    @Override
    public void print(Context context) {
        System.out.println("select source (source print)");
    }

}

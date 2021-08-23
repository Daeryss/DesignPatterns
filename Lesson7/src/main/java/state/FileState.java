package state;

import context.Context;

public class FileState implements State {
    @Override
    public void addMoneyToState(Context context, int money) {
        context.addMoneyToState(money);

    }

    @Override
    public void selectSource(Context context, String source) {
        context.setSource(source);
        context.setState(new SourceState());
    }

    @Override
    public void selectFile(Context context, String file) {
        context.setFile(file);
        context.setState(new PrintState());
    }

    @Override
    public void print(Context context) {
        System.out.println("select file");
    }

}

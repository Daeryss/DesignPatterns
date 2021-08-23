package state;


import context.Context;

public class PrintState implements State {
    @Override
    public void addMoneyToState(Context context, int money) {
        context.addMoneyToState(money);
        context.setState(new MoneyState());
    }

    @Override
    public void selectSource(Context context, String device) {
        context.setSource(device);
        context.setState(new SourceState());
    }

    @Override
    public void selectFile(Context context, String file) {
        context.setFile(file);
    }

    @Override
    public void print(Context context) {
        if (context.getMoney() > context.getCopyPrice()) {
            System.out.printf("print file %s\n", context.getFile());
            context.subtractMoney(context.getCopyPrice());
            context.setState(new SourceState());
        } else {
            System.out.println("insufficient funds on the account");
            context.setState(new MoneyState());
        }
    }

}

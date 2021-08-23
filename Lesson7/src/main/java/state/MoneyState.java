package state;

import context.Context;

public class MoneyState implements State {

    @Override
    public void addMoneyToState(Context context, int money) {
        context.addMoney(money);
        if (context.getMoney() < context.getCopyPrice()) {
            System.out.println("insufficient funds on the account");
            return;
        }
        context.setState(new SourceState());
    }

    @Override
    public void selectSource(Context context, String source) {
        System.out.println("add money");
    }

    @Override
    public void selectFile(Context context, String file) {
        System.out.println("add money");
    }

    @Override
    public void print(Context context) {
        System.out.println("add money");
    }

}

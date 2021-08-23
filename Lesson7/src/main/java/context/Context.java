package context;


import state.*;

public class Context implements CopyMachine {

    private final int copyPrice = 3;

    private State state;

    private int money;

    private String source;

    private String file;

    public Context() {
        state = new MoneyState();
    }

    public void addMoneyToState(int money) {
        state.addMoneyToState(this, money);
    }

    public void selectSource(String source) {
        state.selectSource(this, source);
    }

    public void selectFile(String file) {
        state.selectFile(this, file);
    }

    public void print() {
        state.print(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void subtractMoney(int money) {
        this.money -= money;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getCopyPrice() {
        return copyPrice;
    }

}

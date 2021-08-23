package state;

import context.Context;

public interface State {

    void addMoneyToState(Context context, int money);

    void selectSource(Context context, String source);

    void selectFile(Context context, String file);

    void print(Context context);

}

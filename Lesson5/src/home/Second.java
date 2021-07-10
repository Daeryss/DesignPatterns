package home;

import home.second.SecondOrm;
import home.second.SecondOrmContext;

public class Second implements SecondOrm{
    @Override
    public SecondOrmContext getContext() {
        return null;
    }
}

package LADA;

import structure.YearFactory;

public class LADAYear extends YearFactory {
    protected int year = 2011;

    @Override
    public void year() {
        System.out.println(this.year);
    }
}

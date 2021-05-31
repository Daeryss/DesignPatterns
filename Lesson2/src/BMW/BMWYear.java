package BMW;

import structure.YearFactory;

public class BMWYear extends YearFactory {
    protected int year = 2020;

    @Override
    public void year() {
        System.out.println(this.year);
    }
}

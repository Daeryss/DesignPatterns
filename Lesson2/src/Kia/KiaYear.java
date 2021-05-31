package Kia;

import structure.YearFactory;

public class KiaYear extends YearFactory {
    protected int year = 2017;

    @Override
    public void year() {
        System.out.println(this.year);
    }
}

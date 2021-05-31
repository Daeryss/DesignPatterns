package structure;

public class YearFactory implements Year{
    protected int year;

    @Override
    public void year() {
        System.out.println(this.year);
    }
}

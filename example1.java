interface MonthDescription {
    void describeMonth();
}
class Month implements MonthDescription {
    protected String name;
    protected int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public void describeMonth() {
        System.out.println("Month: " + name);
        System.out.println("Number of Days: " + days);
    }
}
class January extends Month {
    public January() {
        super("January", 31);
    }
}
class February extends Month {
    public February() {
        super("February", 28);
    }
}
class MonthDemo {
    public static void main(String[] args) {
        MonthDescription january = new January();
        MonthDescription february = new February();

        january.describeMonth();
        february.describeMonth();
    }
}



    


class BankAccount {
    private double principal;
    private double rate;
    private int time;

    public BankAccount(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        double interest = (principal * rate * time) / 100;
        return interest;
    }
}

class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 100000.0; 
        double rate = 5.0;
        int time = 5; 

        BankAccount account = new BankAccount(principal, rate, time);

        double simpleInterest = account.calculateSimpleInterest();

        System.out.println("Mr. Bob's Simple Interest after " + time + " years: " + simpleInterest + " RWF");
    }
}


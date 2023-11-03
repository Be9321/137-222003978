public class LoanCalculator {
        private double principal;
        private double annualInterestRate;
        private int numberOfYears;
        private int numberOfMonthsPerYear = 12;
    
        public LoanCalculator(double principal, double annualInterestRate, int numberOfYears) {
            this.principal = principal;
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
        }
    
     double calculateTotalAmount() {
            double monthlyInterestRate = annualInterestRate / 100 / numberOfMonthsPerYear;
            int totalNumberOfMonths = numberOfYears * numberOfMonthsPerYear;
    
            double finalAmount = principal * Math.pow(1 + monthlyInterestRate, totalNumberOfMonths);
            return finalAmount;
        }
    
        public static void main(String[] args) {
            double principal = 500000; // Principal amount
            double annualInterestRate = 18; // Annual interest rate
            int numberOfYears = 3; // Number of years
    
            LoanCalculator loan = new LoanCalculator(principal, annualInterestRate, numberOfYears);
            double totalAmount = loan.calculateTotalAmount();
    
            System.out.println("Total amount paid after " + numberOfYears + " years: $" + totalAmount);
        }
    }
    
    


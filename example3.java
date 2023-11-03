public class example3{
public static void main(String[] args) {
        int years = 80; 
        int currentYear = 0;
        while (currentYear < years) {
            currentYear++;
            System.out.println("Year " + currentYear + ":");
            int daysInYear = 365; 
            int currentDay = 0;
            while (currentDay < daysInYear) {
                currentDay++;
                System.out.println("   Day " + currentDay);
            }
        }
    }
}





public class example4 {
    public static void main(String[] args) {
        int months = 12;
        
        int currentMonth = 0;

        do {
            currentMonth++;
            System.out.println("Month " + currentMonth + ":");
            
            int daysInMonth = 30;
            
            int currentDay = 0;
            do {
                currentDay++;
                System.out.println("   Day " + currentDay);
            } while (currentDay < daysInMonth);
        } while (currentMonth < months);
    }
}






    


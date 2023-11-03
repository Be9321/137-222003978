public class example2 {
    public static void main(String[] args) {
        int daysInYear = 365;

        for (int day = 1; day <= daysInYear; day++) {
            System.out.println("Day " + day + ":");

            int hoursInDay = 24;

            for (int hour = 1; hour <= hoursInDay; hour++) {
                System.out.println("   Hour " + hour);
            }
        }
    }
}


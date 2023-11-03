public class example5 {
    public static void main(String[] args) {
        int lifeGoals = 3;
        int achievedGoals = 0;
        while (achievedGoals < lifeGoals) {
            achievedGoals++;
            System.out.println("Life Goal " + achievedGoals + ": In progress...");
            if (achievedGoals == 2) {
                System.out.println("Congratulations! You've achieved Life Goal " + achievedGoals + "!");
                break; 
            }
        }
    }
}
    


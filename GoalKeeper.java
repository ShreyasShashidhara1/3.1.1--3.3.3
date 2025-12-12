
public class GoalKeeper {
    public static void main(String[] args) {

        // Step 1: Create array using initializer list
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        // Print array reference
        System.out.println(goals);

        // Step 2: Print highest scoring game
        System.out.println("Goals in highest scoring game: " + goals[5]);

        // Step 3: Modify score for game 3
        goals[2] = 1;
        System.out.println("Goals in game 3 is now: " + goals[2]);

        // Step 4: Cause out of bounds error
        // Comment out everything above and uncomment below when needed
        /*
        int[] errorGoals = {1};
        System.out.println(errorGoals[2]);
        */
    }
}
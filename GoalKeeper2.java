public class GoalKeeper2 {
    public static void main(String[] args) {

        // Step 6: Create array using new
        int[] ourGoals = new int[28];

        // Print default value
        System.out.println("Goals in 6th game: " + ourGoals[5]);

        // Step 7: Uninitialized array error
        /*
        int[] theirGoals;
        System.out.println(theirGoals);
        */

        // Step 8: Initialize theirGoals
        int[] theirGoals = new int[28];

        // Step 9: Assign values for game 1
        ourGoals[0] = 3;
        theirGoals[0] = 1;

        System.out.println("Our goals: " + ourGoals[0]);
        System.out.println("Their goals: " + theirGoals[0]);
    }
}
public class Partners {
    public static void main(String[] args) {

        // Step 10: Initialize days array
        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Step 12: Create partners array with new
        String[] partners = new String[7];

        // Step 13: Print default value (null)
        System.out.println("Partner on Sunday: " + partners[0]);

        // Step 14: Assign partners
        partners[1] = "Alex";
        partners[3] = "Jordan";
        partners[5] = "Riley";

        // Step 15: Print practice days and partners
        System.out.println(days[1] + ": " + partners[1]);
        System.out.println(days[3] + ": " + partners[3]);
        System.out.println(days[5] + ": " + partners[5]);

        // Step 16: Shared reference
        String[] friendPartners = partners;

        // Step 18: Change partner using partners array
        partners[1] = "Chris";

        // Confirm change seen by friendPartners
        System.out.println("My partner Monday: " + partners[1]);
        System.out.println("Friend's partner Monday: " + friendPartners[1]);
    }
}
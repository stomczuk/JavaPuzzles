package assignment_15;

import ignore.TestingUtils;

public class App {


    /**
     * Given a string, return the length of the longest streak of the same chars in the string.
     *
     * <br>
     * <br>
     *
     * <b>EXPECTATIONS:</b><br>
     * longestStreak("hayyeu") <b>---></b> 2<br>
     * longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
     * longestStreak("")  <b>---></b> 0 <br>
     */

    public static int longestStreak(String str) {

        int counter = 1;
        int longestLength = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(i - 1)) {
                counter = 1;

            }

            if (str.charAt(i) == str.charAt(i - 1)) {

                counter++;
                if (counter > longestLength) {
                    longestLength = counter;

                }

            }

        }

        if (str.length() == 0) {
            longestLength = 0;
        }

        return longestLength;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestingUtils.runTests();

    }
}


package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(checkIfOneStringSwapCanMakeStringsEqual("bank", "kanb"));
        System.out.println(checkIfOneStringSwapCanMakeStringsEqual("attack", "defend"));
        System.out.println(checkIfOneStringSwapCanMakeStringsEqual("kelb", "kelb"));

    }

    // This method returns whether the two strings can be made equal with one swap or not.
    public static boolean checkIfOneStringSwapCanMakeStringsEqual(String s1, String s2) {

        // Return true if they are equal to begin with.
        if (s1.equals(s2)) { return true; }

        // Otherwise, iterate through every character in string s2.
        for (int i = 0; i < s2.length(); i++) {

            // And for every character, iterate through every character again in string s2.
            for (int j = 0; j < s2.length(); j++) {

                // Record the character at each of the indexes.
                char c1 = s2.charAt(i);
                char c2 = s2.charAt(j);

                // And then conduct a swap between the characters at the two indexes.
                StringBuilder s2swap = new StringBuilder(s2);
                s2swap.setCharAt(i, c2);
                s2swap.setCharAt(j, c1);

                // Finally, conduct an equality check between string s1 and the post-swap string.
                // If they are equal, return true.
                if (s1.contentEquals(s2swap)) { return true; }

            }

        }

        // If we reached this point, return false as equality could
        // not be achieved regardless of the swaps being performed.
        return false;

    }

}

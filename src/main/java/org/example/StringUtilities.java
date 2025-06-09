package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static boolean shortString(String string) {
//      No need for if-else or ternary operator. Can just return the condition and it will return true if condition is
//      true.
        return string.length < 5;
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static Character firstLetter(String string) {
//      Validation: If string input is empty, it will return null;
        if (string == null || string.isEmpty()) {
            return null;
        }
//      Otherwise, return the first index of the string.
        return string.charAt(0);
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String[] censorAsparagus(String string) {

//     .replace changes every instance of the string/word "asparagus" to "****"
       return string.replace("asparagus", "****");
    }

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static String[] bigger(String string1, String string2) {

        if(string1.length > string2.length) {
            return String[] string1;
        } else if(string1.length < string2.length) {
            return string2;
        } else if(string1.length == string2.length) {
            return string1;
        }
    }
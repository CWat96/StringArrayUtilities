package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array != null && array.length > 0) { // if the array is not null "empty" and the length is greater than 0
            return array[array.length -1]; // return array[length of specified array] -1 is to get the last element
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array != null && array.length > 0) { // if the array is not null "empty" and the length is greater than 0
            return array[array.length -2]; // return array[length of specified array] -2 is to get the last element
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s:array) { // for each loop, it iterates through each element of 'String s'
            if (s.equals(value)); // checks if 's' is equal to the specified 'value' using the 'equals' method
            return true;
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array)); // collections.reverse is called to reverse the order of elements. 'Arrays.asList(array)' is a method used to convert the array to a 'List'.
        return array; // After reversing the array the method returns the modified array
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        // assigns array in reversed order to String[]reversedArr
        String [] reversedArr = Arrays.copyOf(array, array.length);

        // reverses the String[] array as an ArrayList
        Collections.reverse(Arrays.asList(array));

        // return boolean that shows if reveredArr is equal to array
        // return reversedArr.equals(array);
        return Arrays.equals(reversedArr, array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String legend = Arrays.toString(array).toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (legend.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int j = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                j = j + 1;
            }
        }
        return j;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        if (array == null) {
            return null;
        }

        return Arrays.stream(array).filter(element -> !valueToRemove.equals(element)).toArray(String[]:: new);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];
        }
        List<String> result = new ArrayList<>();
        result.add(array[0]);

        for(int i =1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                result.add(array[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];
        }
        List<String> result = new ArrayList<>();
        StringBuilder currentString = new StringBuilder(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                currentString.append(array[i]);
            } else {
                result.add(currentString.toString());
                currentString = new StringBuilder(array [i]);
            }
        }
        result.add(currentString.toString());
        return result.toArray(new String[0]);
    }


}

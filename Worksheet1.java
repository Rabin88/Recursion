/**
 * @author <Rabin Pun> This class contains the solution for Worksheet1
 */

public class Worksheet1 {

    // Exercise 1

    /**
     * This method compute m to the power of n for both non-negative integers
     * @param m is an base integer
     * @param n is the exponential integer
     * @return the power of an given integer
     */
    public static int power(int m, int n) {
        if (n == 0)
            return 1;
        else {

            return m * power(m, n - 1);
        }
    }

    /**
     * This method compute m to the power of n for both non-negative integers
     * @param m is an base integer
     * @param n is the exponential integer
     * @return the power of an given integer
     */
    public static int fastPower(int m, int n) {
        if (n == 0)
            return 1;

        if (n % 2 == 0)
            return (fastPower(m * m, n / 2));

        else
            return m * fastPower(m, n - 1);
    }

    // Exercise 2

    /**
     * This method return a list in which all the elements of original list becomes positive to negative
     * and negative to positive.
     * @param a is list of an integer
     * @return a list of integers that become positive integer to negative
     * and negative integer to positive.
     */
    static List<Integer> negateAll(List<Integer> a) {
        if (a.isEmpty()){
            return a;
        }else{
            return new List(-a.getHead(), negateAll(a.getTail()));
        }
    }

    // Exercise 3
    /**
     * This method find the position of a given element x in a list (first occurrence).
     * @param x is an element of the list
     * @param a list of an integer
     * @return the position of the element in the list
     */
    static int find(int x, List<Integer> a) {
        if (a.isEmpty()) {

            throw new IllegalArgumentException("Element not in the list");

        } else if (x == a.getHead()) {
            return 0;
        } else {
            return 1 + find(x, a.getTail());
        }
    }

    // Exercise 4

    /**
     * This method return true if all the elements in a list are positive
     * @param a list of an integers
     * @return true if all elements in a list are positive
     */
    public static boolean allPositive(List<Integer> a) {
        if (a.isEmpty()) {
            return true;
        }
        else if (a.getHead()>0){
            return allPositive(a.getTail());
        }else {
            return false;
        }
    }

    // Exercise 5

    /**
     * This method return a list of all the elements of a list that are positive
     * @param a list of an integer
     * @return a list of all the elements of a list that are positive
     */
    static List<Integer> positives(List<Integer> a) {
        if (a.isEmpty()) {
            return a;
        } else if (a.getHead() > 0) {
            return new List(a.getHead(), positives(a.getTail()));
        }else {
           return positives(a.getTail());
        }
    }


    // Exercise 6

    /**
     * This method check if a list is sorted
     * @param a list of an integer
     * @return a sorted list.
     */
    static boolean sorted(List<Integer> a) {
        if (a.isEmpty()) {
            return true;
        }
        else if (a.getTail().isEmpty()){
            return true;
        }
        else if (a.getHead() <= a.getTail().getHead()){
           return sorted(a.getTail());
        }
        else {
            return false;
        }
    }

    // Exercise 7

    /**
     * This method merge given sorted two lists a and b in ascending order.
     * Any duplicate copies of elements in either a or b or their combination must be retained.
     * @param a list of an integer
     * @param b list of an integer
     * @return  a merge of two lists a and b sorted in ascending order
     */
    static List<Integer> merge(List<Integer> a, List<Integer> b) {
        if (a.isEmpty()) {
            return b;
        }
        else if (b.isEmpty()){
            return a;
        }
        else if (a.getHead() <= b.getHead()) {
            return new List (a.getHead(), merge(a.getTail(), b));
        } else {
            return new List(b.getHead(), merge(a, b.getTail()));
        }
    }

    // Exercise 8
    /**
     * This method return a list with all the duplicate copies of an elements removed from the list
     * This computation method should take an O(n)
     * @param a list of an integer
     * @return a list with duplicate copies removed.
     */
    static List<Integer> removeDuplicates(List<Integer> a) {
        if (a.isEmpty()) {
            return a;
        } else if (a.getTail().isEmpty()) {

            return a;

        } else if (a.getHead() == a.getTail().getHead()) {

            return removeDuplicates(a.getTail()); // head is removed because of duplicate copies

        } else {
            return new List(a.getHead(), removeDuplicates(a.getTail()));
        }
    }

}


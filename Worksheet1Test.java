/** @author
 *  <Rabin Pun>
 * This class contains the test cases for Worksheet1 solutions.
 *
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Worksheet1Test {

    List<Integer> L1; List<Integer> L2; List<Integer> L3; List<Integer> L4; List<Integer> L5;
    List<Integer> L6; List<Integer> L7; List<Integer> L8; List<Integer> L9; List<Integer> L10;
    List<Integer> L11; List<Integer> L12;

    @Before
    public void setUp() {
        L1 = new List<>(2, new List<>(-5, new List<>(8, new List<>(0, new List<>()))));
        L2 = new List<>(7, new List<>(5, new List<>(3, new List<>(8, new List<>()))));
        L3 = new List<>(-2, new List<>(9, new List<>(1, new List<>(5, new List<>()))));
        L4 = new List<>(1, new List<>(2, new List<>(6, new List<>(3, new List<>()))));
        L5 = new List<>(2, new List<>(-6, new List<>(8, new List<>(3, new List<>()))));
        L6 = new List<>(2, new  List<>(8, new List<>(3, new List<>())));
        L7 = new List<>(1, new List<>(1, new List<>(11, new List<>(2, new List<>()))));
        L8 = new List<>(2, new List<>(2, new List<>(23, new List<>(30, new List<>()))));
        L9 = new List<>(5, new List<>(11, new List<>(33, new List<>(33, new List<>()))));
        L10 = new List<>(2, new List<>(2, new List<>(5, new List<>(11, new List<>(23,
                new List<>(30, new List<>(33, new List<>(33,new List<>()))))))));
        L11 = new List<>();
        L12 = new List<>(2, new List<>(23, new List<>(30, new List<>())));

    }
    // Testing on power
    @Test
    public void power() {
        int m = 3, n = 2;
        assertEquals( Worksheet1.power(m, n), 9);
    }
    // Testing on fastPower
    @Test
    public void fastPower() {
        int m = 2, n = 6;
        assertEquals( Worksheet1.fastPower(m, n), 64);
    }

    // Testing for positive to negative and negative to positive integer
    @Test
    public void negateAll() {
        List<Integer> L0 = new List<Integer>(-2, new List<Integer>(5, new List<Integer>(-8, new List<>(0, new List<>()))));
        assertEquals(Worksheet1.negateAll(L1), (L0));
    }

    // Testing for finding the position of element
    @Test
    public void find() {
        assertEquals(Worksheet1.find(8,(L2)), 3);
    }
    
    // Testing to check if all the elements in list are positive
    @Test
    public void allPositive() {
        Assert.assertFalse(Worksheet1.allPositive(L3));
    }

    // Testing to check if all the elements in list are positive
    @Test
    public void allPositive2() {
        Assert.assertTrue(Worksheet1.allPositive(L4));
    }

    // Testing for finding the positive elements in a list
    @Test
    public void positives() {
        assertEquals(Worksheet1.positives(L5), (L6));
    }

    // Testing to check if all the elements are sorted in ascending order
    @Test
    public void sorted() {
        Assert.assertFalse(Worksheet1.sorted(L7));
    }

    // Testing to check if all the elements are sorted in ascending order
    @Test
    public void sorted2() {
        Assert.assertTrue(Worksheet1.sorted(L8));
    }

    // Testing to check if the merge list contain all the elements of given two sorted list
    @Test
    public void merge() {
        assertEquals(Worksheet1.merge(L8,L9), L10);
    }

    // Testing to check if the merge list contain all the elements, if one the list is empty
    @Test
    public void merge2() {
        assertEquals(Worksheet1.merge(L8,L11), L8);
    }

    // Testing to check if the duplicate elements are removed from the list
    @Test
    public void removeDuplicates() {
        assertEquals(Worksheet1.removeDuplicates(L8), L12);
    }
}

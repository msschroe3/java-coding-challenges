package codility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OddOccurencesTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message            |   testArray                                   |   result
                { "array with 1 odd occurence",     new int[] {9,3,9,3,9,7,9},                      7 },
                { "test int bounds",                new int[] {1,1,1000000,1000000,1000000000},     1000000000 },
                { "test array with 1 element",      new int[] {13},                                 13 }
                // add performance tests that hit the upper bound limit of the array
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int[] testArray;

    @Parameterized.Parameter(2)
    public int expected;

    /**********************
     * Parameterized Tests
     **********************/

    private OddOccurences oddOccurences;

    @Before
    public void setup() {
        this.oddOccurences = new OddOccurences();
    }

    @Test
    public void oddOccurencesTests() {
        // when
        int result = this.oddOccurences.solution(testArray);

        // then
        assertEquals(expected, result);
    }
}
package codility.lesson3.timecomplexity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PermMissingElemTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message        |   array                   |   expected
                { "simple test",                new int[] {2,3,1,5},        4            },
                { "1st element is missing",     new int[] {2,3,4,5},        1            },
                { "last element is missing",    new int[] {1,2,3,4},        5            },
                { "empty list",                 new int[] {},               1            }
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int[] array;

    @Parameterized.Parameter(2)
    public int expected;

    /**********************
     * Parameterized Tests
     **********************/

    private PermMissingElem permMissingElem;

    @Before
    public void setup() {
        this.permMissingElem = new PermMissingElem();
    }

    @Test
    public void permMissingElemTests() {
        // when
        int result = this.permMissingElem.solution(array);

        // then
        assertEquals(expected, result);
    }
}
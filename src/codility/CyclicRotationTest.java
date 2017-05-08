package codility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class CyclicRotationTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message    |   array                   |   rotationCount     |   expected
                { "rotate by 2",            new int[] {3,8,9,7,6},      3,                    new int[] {9,7,6,3,8} },
                { "rotate by 3",            new int[] {2, 3, 4},        2,                    new int[] {3, 4, 2} },
                { "multiple full rotations",new int[] {2, 3, 4},        5,                    new int[] {3, 4, 2} },
                { "0 rotation",             new int[] {2, 3, 4},        0,                    new int[] {2, 3, 4} },
                { "empty array",            new int[] {},               2,                    new int[] {} }
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int[] array;

    @Parameterized.Parameter(2)
    public int rotationCount;

    @Parameterized.Parameter(3)
    public int[] expected;

    /**********************
     * Parameterized Tests
     **********************/

    private CyclicRotation cyclicRotation;

    @Before
    public void setup() {
        this.cyclicRotation = new CyclicRotation();
    }

    @Test
    public void cyclicRotationTests() {
        // when
        int[] result = this.cyclicRotation.solution(array, rotationCount);

        // then
        assertArrayEquals(expected, result);
    }
}
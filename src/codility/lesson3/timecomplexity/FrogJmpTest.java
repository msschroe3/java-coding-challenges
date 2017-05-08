package codility.lesson3.timecomplexity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FrogJmpTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message        |   currPosition    |   nextPosition    |   distance    |   expected
                { "simple test",                10,                 85,                 30,             3 },
                { "lower bound",                1,                  85,                 1,              84 },
                { "upper bound",                1,                  1000000000,         65,             15384616 },
                { "distance greater than gap",  1,                  85,                 90,             1 }
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int currPosition;

    @Parameterized.Parameter(2)
    public int nextPosition;

    @Parameterized.Parameter(3)
    public int distance;

    @Parameterized.Parameter(4)
    public int expected;

    /**********************
     * Parameterized Tests
     **********************/

    private FrogJmp frogJmp;

    @Before
    public void setup() {
        this.frogJmp = new FrogJmp();
    }

    @Test
    public void permMissingElemTests() {
        // when
        int result = this.frogJmp.solution(currPosition, nextPosition, distance);

        // then
        assertEquals(expected, result);
    }
}
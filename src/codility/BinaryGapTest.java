package codility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryGapTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message            |   testBinary  |   expectedGap
                { "valid binary with gap of 4",     1041,           5 },
                { "valid binary with gap of 0",     15,             0 },
                { "test lower bound",               0,              0 },
                { "test upper bound",               2147483647,     0 },
                { "trailing zeros 1",               6,              0 },
                { "trailing zeros 2",               328,            2 },
                { "trailing zeros 3",               51712,          2 }
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int number;

    @Parameterized.Parameter(2)
    public int expectedGap;

    /**********************
     * Parameterized Tests
     **********************/

    private BinaryGap binaryGap;

    @Before
    public void setup() {
        this.binaryGap = new BinaryGap();
    }

    @Test
    public void binaryGapTests() {
        // when
        int gap = this.binaryGap.solution(number);

        // then
        assertEquals(expectedGap, gap);
    }
}
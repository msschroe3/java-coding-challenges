package codility;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EquilibriumIndexTest {

    /*************************
     * Parameterized Test Data
     *************************/

    @Parameterized.Parameters(name = "Test {index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // test case message    |   testArray                   |   expectedIndex
                { "equi index found",       new int[]{-4, 10, -4, 4, 2},    2 },
                { "equi index not found",   new int[]{-4, 10, -3, 40, 2},   -1 },
                { "empty array returns -1", new int[]{},                    -1 },
                { "null param returns -1",  null,                           -1 }
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public String message;

    @Parameterized.Parameter(1)
    public int[] testArray;

    @Parameterized.Parameter(2)
    public int expectedIndex;

    /**********************
     * Parameterized Tests
     **********************/

    private EquilibriumIndex equi;

    @Before
    public void setup() {
        this.equi = new EquilibriumIndex();
    }

    @Test
    public void equiTests() {
        // when
        int index = this.equi.computeIndex(testArray);

        // then
        assertEquals(expectedIndex, index);
    }
}
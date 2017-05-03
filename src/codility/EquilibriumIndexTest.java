package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquilibriumIndexTest {
    private EquilibriumIndex equi;

    @Before
    public void setup() {
        this.equi = new EquilibriumIndex();
    }

    @Test
    public void equiIndexFound() {
        // setup
        int[] testArray = {-4, 10, -4, 4, 2};

        // when
        int index = this.equi.computeIndex(testArray);

        // then
        assertEquals(2, index);
    }

    @Test
    public void equiIndexNotFound() {
        // setup
        int[] testArray = {-4, 10, -3, 40, 2};

        // when
        int index = this.equi.computeIndex(testArray);

        // then
        assertEquals(-1, index);
    }

    @Test
    public void emptyArray() {
        // setup
        int[] testArray = {};

        // when
        int index = this.equi.computeIndex(testArray);

        // then
        assertEquals(-1, index);
    }

    @Test
    public void nullArray() {
        // when
        int index = this.equi.computeIndex(null);

        // then
        assertEquals(-1, index);
    }
}
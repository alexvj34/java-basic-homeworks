import org.junit.Test;
import ru.otus.java.basic.homework22.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {


    @Test
    public void testElementsAfterLastOne_WithOnes() {
        int[] input = {1, 2, 1, 2, 2};
        int[] expectedOutput = {2, 2};
        assertArrayEquals(expectedOutput, ArrayUtils.elementsAfterLastOne(input));
    }

    @Test
    public void testElementsAfterLastOne_WithoutOnes() {
        int[] input = {2, 2, 2, 2};
        assertThrows(RuntimeException.class, () -> ArrayUtils.elementsAfterLastOne(input));
    }

    @Test
    public void testElementsAfterLastOne_OneAtEnd() {
        int[] input = {2, 2, 1};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, ArrayUtils.elementsAfterLastOne(input));
    }


    @Test
    public void testIsArrayOneAndTwoOnly_ValidArray() {
        int[] input = {1, 2, 1, 2};
        assertTrue(ArrayUtils.isArrayOneAndTwoOnly(input));
    }

    @Test
    public void testIsArrayOneAndTwoOnly_OnlyOnes() {
        int[] input = {1, 1, 1};
        assertFalse(ArrayUtils.isArrayOneAndTwoOnly(input));
    }

    @Test
    public void testIsArrayOneAndTwoOnly_InvalidElement() {
        int[] input = {1, 2, 3};
        assertFalse(ArrayUtils.isArrayOneAndTwoOnly(input));
    }

    @Test
    public void testIsArrayOneAndTwoOnly_NoOnesOrTwos() {
        int[] input = {3, 4};
        assertFalse(ArrayUtils.isArrayOneAndTwoOnly(input));
    }
}

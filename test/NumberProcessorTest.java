import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    public void testMixedNumbers() {
        int[] arr = {2, 3};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testAllEven() {
        int[] arr = {2, 4};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(1, result);
    }

    @Test
    public void testZeroSum() {
        int[] arr = {2, 3, 1};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(0, result);
    }

    // ===== Issue #2 bổ sung =====

    @Test
    public void testNegativeSum() {
        int[] arr = {1, 3};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testSingleEven() {
        int[] arr = {2};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(1, result);
    }

    @Test
    public void testSingleOdd() {
        int[] arr = {1};
        int result = NumberProcessor.processNumbers(arr);
        assertEquals(-1, result);
    }
}
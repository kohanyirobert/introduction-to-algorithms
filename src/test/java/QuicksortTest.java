import org.testng.annotations.Test;

@Test
public class QuicksortTest {

    private static void assertQuicksort(int[] a) {
        Quicksort.quicksort(a);
        assert isSorted(a);
    }

    private static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() throws Exception {
        assertQuicksort(new int[]{});
        assertQuicksort(new int[]{1});
        assertQuicksort(new int[]{1, 1});
        assertQuicksort(new int[]{1, 2});
        assertQuicksort(new int[]{2, 1});
        assertQuicksort(new int[]{1, 2, 3});
        assertQuicksort(new int[]{5, 3, 2, 6, 4, 1, 3, 7});
    }
}

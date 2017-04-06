// Introduction to Algorithms, 3rd Edition, 7-1 Hoare partition correctness
// https://en.wikipedia.org/wiki/Quicksort#Hoare_partition_scheme
public class Quicksort {

    public static void quicksort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quicksort(a, p, q);
            quicksort(a, q + 1, r);
        }
    }

    private static int partition(int[] a, int p, int r) {
        int x = a[p];
        int i = p - 1;
        int j = r + 1;
        while (true) {
            do {
                j--;
            } while (a[j] > x);
            do {
                i++;
            } while (a[i] < x);
            if (i < j) {
                exchange(a, i, j);
            } else {
                return j;
            }
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    private Quicksort() {
    }
}

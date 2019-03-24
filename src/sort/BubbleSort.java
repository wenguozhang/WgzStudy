package sort;
 
/**
 * Created by david on 2018/8/16
 * √∞≈›≈≈–Ú
 */
public class BubbleSort {
    private static int[] bubbleSort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len - 1; i++) {
            for (int j = 1; j < len - 1-i; j++) {
                if (a[j + 1] < a[j]) {
                    swap(a, j + 1, j);
                }
            }
        }
        return a;
    }
 
    //Ωªªª∑Ω∑®
    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
 
    //≤‚ ‘
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 99, 9, 2, 99};
        int[] sort = bubbleSort(a);
        for (int s : sort) {
            System.out.print(s + " ");
        }
 
    }
}

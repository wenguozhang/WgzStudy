package sort;
 
/**
 * Created by david on 2018/8/16
 * ��������
 * ���ȶ���ʱ�临�Ӷ� ������ O(nlogn) ���ʱ��O(n^2)
 */
public class QuickSort {
    private static int[] quickSort(int[] a, int low, int high) {
        //���ĵ�
        int mid = 0;
        if (low < high) {
            mid = partition(a, low, high);
            quickSort(a, low, mid - 1);
            quickSort(a, mid + 1, high);
        }
        return a;
    }
 
    private static int partition(int[] a, int low, int high) {
        int b = a[low];
        while (low < high) {
            while (low < high && a[high] >= b) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= b) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = b;
        return low;
    }
 
    //����
    public static void main(String[] args) {
        int[] a = {99, 14, 6, 8, 1, 9, 2, 99};
        int[] sort = quickSort(a, 0, 7);
        for (int s : sort) {
            System.out.print(s + " ");
        }
    }
}

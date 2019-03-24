package sort;
 
/**
 * Created by david on 2018/8/16
 * 查找前的数据必须是已经排好序的, 然后得到数组的开始位置start和结束位置end,
 * 取中间位置mid的数据a[mid]跟待查找数据key进行比较, 若 a[mid] > key, 则取end = mid - 1;
 * 若 a[mid] < key, 则取start = mid + 1; 若 a[mid] = key 则直接返回当前mid为查找到的位置.
 * 依次遍历直到找到数据或者最终没有该条数据
 */
public class BinarySearch {
    public static int binarySearch(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                end = mid - 1;
            } else if (a[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
 
    // 测试
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 99};
        int i = binarySearch(a, 99);
        System.out.println(i);
    }
}

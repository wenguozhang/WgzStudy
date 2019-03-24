package sort;
 
/**
 * Created by david on 2018/8/16
 * ����ǰ�����ݱ������Ѿ��ź����, Ȼ��õ�����Ŀ�ʼλ��start�ͽ���λ��end,
 * ȡ�м�λ��mid������a[mid]������������key���бȽ�, �� a[mid] > key, ��ȡend = mid - 1;
 * �� a[mid] < key, ��ȡstart = mid + 1; �� a[mid] = key ��ֱ�ӷ��ص�ǰmidΪ���ҵ���λ��.
 * ���α���ֱ���ҵ����ݻ�������û�и�������
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
 
    // ����
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 99};
        int i = binarySearch(a, 99);
        System.out.println(i);
    }
}

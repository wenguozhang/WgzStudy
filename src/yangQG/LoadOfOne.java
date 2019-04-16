package yangQG;

public class LoadOfOne {
	public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] result = new int[m+n];   //从起点一共需要m+n步走到头，定义的数组长度为m+n
        Load(m,n,result);
    }
	
    public static void Load(int m,int n,int[] result){
        if(m==0&&n==0){
            Print(result);
            return;
        }
        if(m>0){
            result[m+n-1] = 0;
            Load(m-1,n,result);
        }
        if(n>0) {
            result[m+n-1] = 1;
            Load(m, n - 1, result);
        }
    }
    public static void Print(int[] result){
//        int countx = 0;
//        int county = 0;
//        System.out.println("我是分割线");
//        for (int i = 0; i <result.length ; i++) {
//            if(result[i] == 0){
//                countx++;
//            }else{
//                county++;
//            }
//            System.out.println(countx + " "+county + ";");
//        }
        for(int i : result){
        	System.out.print(i);
        }
        System.out.println();
    }
}

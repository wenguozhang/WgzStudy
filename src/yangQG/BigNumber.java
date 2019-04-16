package yangQG;

import java.math.BigInteger;
import java.util.LinkedList;

public class BigNumber {
	public static void main(String[] args){
		int num = 12455;
		char[] a = (num+"").toCharArray();
		System.out.println(Integer.valueOf(String.valueOf(a[1])));
		System.out.println(isHeFa(""));
		int[] arr = {2,4,0,5,7,0,4,3,0};
		arr = remove(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}

//	public static void add(char a[],char b[],char c[]){  
//		int max = Math.max(a.length, b.length);
//		int fi,num;
//		for(int i=max-1; (int)a[i]-(int)('0') !=0 || (int)b[i]-(int)('0') !=0 || fi!=0; i--){
//			(int)a[i]-(int)'0' == 0? a[i]='0': 0; 
//			
//			(int)b[i]-(int)'0' == 0? b[i]='0': 0;
//			
//			num = a[i]-'0'+b[i]-'0'+fi;
//			c[i]= (char) (num%10 +'0');
//			fi = num/10;
//		}
//	}
	
	/**检查括号是否匹配 */
	public static String isHeFa(String str){
		char[] a = str.toCharArray();
		LinkedList left = new LinkedList();
		LinkedList right = new LinkedList();
		for(char c : a){
			if(c=='(' || c=='[' || c=='{')
				left.offer(c);
			if(c==')' || c==']' || c=='}')
				right.offer(c);
		}
		String ret = "Ok";
		for(int i = 0; i<left.size(); i++){
			if(!isPiPai((char)left.pollLast(),(char)right.pollFirst()))
				ret = "Wrong";	
		}
		return ret;
	}
	private static boolean isPiPai(char c1, char c2){
		if(c1=='(' && c2==')' || c1=='[' && c2==']' || c1=='{' && c2=='}')
			return true;
		return false;
	}
	
	private static int[] remove(int[] arr){
		int r = arr.length-1;
		int i = 0;
		while(i<r){
			while(arr[r] == 0)
				r--;
			if(arr[i]==0){
				arr[i] = arr[r];
				arr[r] = 0;
				r--;
			}
			i++;
		}
		return arr;
	}
}

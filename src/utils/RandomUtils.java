package utils;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * ��װ��������Ψһ��ID�㷨�Ĺ�����.
 * 
 * @author calvin
 */
public class RandomUtils {

	private static SecureRandom random = new SecureRandom();

	/**
	 * ��װJDK�Դ���UUID, ͨ��Random��������, �м���-�ָ�.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * ��װJDK�Դ���UUID, ͨ��Random��������, �м���-�ָ�.
	 */
	public static String uuid2() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * ʹ��SecureRandom�������Long. 
	 */
	public static long randomLong() {
	  long l =  random.nextLong();
	  if(l==Long.MIN_VALUE){
	   l = Long.MIN_VALUE + 1;
	  }
	  if(l>0){
	   return l;
	  }else{
	   return Math.abs(l);
	  }
	}
}
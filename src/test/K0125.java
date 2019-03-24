package test;



public class K0125 {
	 public static void main(String[] args){
		int i = 7;        //111
		System.out.println(i >> 1);
		System.out.println(i >> 1 << 1);
		System.out.println(i >> 1 << 1 != i);
		 
	 }
	 
	 private static class Item<E> {  
	     private E obj = null; 
	     public E get(){
	    	 return obj;
	     }
	     public void set(E o){
	    	 obj =o;
	     }
	 }
	  
}

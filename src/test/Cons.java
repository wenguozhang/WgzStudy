package test;

public class Cons extends Ee {
	private Aa a = new Aa();
	private Bb b = new Bb();
	private Cc c = new Cc();
	public Cons(){ System.out.println("Cons()");}
	public static void main(String[] args){
		new Cons();
	}
}
class Aa{
	Aa(){ System.out.println("Aa()");}
}
class Bb{
	Bb(){ System.out.println("Bb()");}
}
class Cc{
	Cc(){ System.out.println("Cc()");}
}
class Dd{
	Dd(){ System.out.println("Dd()");}
}
class Ee extends Dd{
	Ee(){ System.out.println("Ee()");}
}

//1、基类构造器
//2、声明顺序初始化
//3、导出类构造	器

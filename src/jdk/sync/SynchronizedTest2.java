package jdk.sync;
public class SynchronizedTest2 {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc1=new MyClass();
        MyClass mc2=new MyClass();
        Thread t1=new Thread(new Runnable1(mc1));
        Thread t2=new Thread(new Runnable1(mc2));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        //延迟,保证t1先执行
        Thread.sleep(1000);
        t2.start();
    }
}
class Runnable1 implements Runnable{
    MyClass mc;
    Runnable1(MyClass mc){
        this.mc=mc;
    }
    @Override
    public void run() {
        if("t1".equals(Thread.currentThread().getName())){
            MyClass.m1();//因为是静态方法,用的还是类锁,和对象锁无关
        }
        if("t2".equals(Thread.currentThread().getName())){
            MyClass.m2();
        }
    }
}
class MyClass{
    //synchronized添加到静态方法上,线程执行此方法的时候会找类锁,类锁只有一把
    public synchronized static void m1(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1()............");
    }
    /**
     *  m2()不会等m1结束,因为该方法没有被synchronized修饰
     */
    public static void m2(){
        System.out.println("m2()........");
    }
    /**
     * m2方法等m1结束之后才能执行,该方法有synchronized
     * 线程执行该方法需要"类锁",而类锁只有一个.
     */
//    public synchronized static void m2(){
//        System.out.println("m2()........");
//    }
}
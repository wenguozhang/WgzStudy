package jdk.sync;
public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizeTest1();
    }

    private static void SynchronizeTest1() {
        Account account=new Account("Actno-001",5000.0);
        Thread t1=new Thread(new Processor(account));
        Thread t2=new Thread(new Processor(account));
        t1.start();
        t2.start();
    }

}
/**
 * 取款线程
 */
class Processor implements Runnable{
    Account act;
    Processor(Account act){
        this.act=act;
    }
    @Override
    public void run() {
        act.withdraw(1000.0);
        System.out.println("取款1000.0成功,余额: "+act.getBalance());
    }

}
class Account {

    private String actno;
    private double balance;

    public Account() {
        super();
    }

    public Account(String actno, double balance) {
        super();
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 对外提供一个取款的方法 对当前账户进行取款操作
     */
    public void withdraw(double money) {
        //把需要同步的代码,放到同步语句块中.
        //遇到synchronized就找锁,找到就执行,找不到就等
        /**
         * 原理: t1线程和t2线程
         * t1线程执行到此处,遇到了synchronized关键字,就会去找this的对象锁,
         * 如果找到this对象锁,则进入同步语句块中执行程序,当同步语句块中的代码执行结束之后,
         * t1线程归还this的对象锁.
         * 
         * 在t1线程执行同步语句块的过程中,如果t2线程也过来执行以下代码,也遇到synchronized关键字,
         * 所以也去找this对象锁,但是该对象锁被t1线程持有,只能在这等待this对象的归还.
         * 
         * synchronized关键字添加到成员方法上,线程拿走的也是this的对象锁.
         * 
         */
        synchronized (this) {
            double after = balance - money;
            try {
                //延迟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新
            this.setBalance(after);
        }
    }
}

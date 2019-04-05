package jdk.thread;
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable2());
        t1.setName("t1");
        // 将t1这个用户线程修改成守护线程.在线程没有启动时可以修改以下参数
        t1.setDaemon(true);
        t1.start();
        // 主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            Thread.sleep(1000);
        }
    }
}

class Runnable2 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(Thread.currentThread().getName() + "-------->" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
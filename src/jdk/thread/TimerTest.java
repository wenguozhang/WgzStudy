package jdk.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 关于定时器的应用 作用: 每隔一段固定的时间执行一段代码
 */
public class TimerTest {

    public static void main(String[] args) throws ParseException {
        // 1.创建定时器
        Timer t = new Timer();
        // 2.指定定时任务
        t.schedule(new LogTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-03-31 17:14:00 000"), 10 * 1000);
    }
}

// 指定任务
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}
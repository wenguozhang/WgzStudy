package quartz.simpleTrigger;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/** 
* @author wgz
* @version 
* ����ʱ�䣺2018��6��2�� ����4:11:27 
* ��˵�� 
*/ 
public class HelloScheduler {
	public static void main(String[] args) throws SchedulerException{
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Current exec time is : "+ sf.format(date));
		
		//����һ��JobDetail ʵ��������ʵ����HelloJob ʵ����
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myjob", "jobgroup1").build();
		Date endDate = new Date();		endDate.setTime(endDate.getTime() + 10000);
		SimpleTrigger trigger = (SimpleTrigger) TriggerBuilder.newTrigger().withIdentity("myTrigger", "trigroup1")
				.startAt(date).endAt(endDate).withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2)
						.withRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY)).build();
		
		//����Schedulerʵ��
		SchedulerFactory sfact = new StdSchedulerFactory();
		Scheduler scheduler = sfact.getScheduler();
		scheduler.scheduleJob(jobDetail, trigger);
		scheduler.start();
	}
}

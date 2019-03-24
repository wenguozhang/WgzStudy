package quartz.simpleTrigger;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/** 
* @author wgz
* @version 
* 创建时间：2018年6月2日 下午3:26:28 
* 类说明 
*/ 
public class HelloJob implements Job {
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException{
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Current exec time is : "+ sf.format(date));
		System.out.println("Hello world!");
	}
}

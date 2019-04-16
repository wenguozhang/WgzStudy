package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test1 {
	 public static void main(String[] args) throws ClassNotFoundException {

	        ApplicationContext ctx = new FileSystemXmlApplicationContext
	                ("spring-beans/src/test/resources/beans.xml");
	        System.out.println("number : " + ctx.getBeanDefinitionCount());
//	        ((Person) ctx.getBean("person")).work();
	    }
}

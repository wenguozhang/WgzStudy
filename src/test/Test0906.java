package test;

import java.util.HashMap;
import java.util.Map;

public class Test0906 {
//	private String date = "20180906";
	public static void main(String[] args){
		int i = Integer.MAX_VALUE;
		int j = i+5;
		System.out.println(i>j);
		System.out.println(i);
		System.out.println(j);
//		String s1 = new String("www");
//		String s2 = s1;
//		String s3 = new String("www");
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		HashMap m = new HashMap();
//		m.put("ww", new Integer(2));
//		ok: 
//		for(int i=0;i<10;i++) { 
//			for(int j=0;j<10;j++) { 
//				System.out.println("i" + i +",j" + j);
//				if(j == 5) 
//					break ok;
//			} 
//		} 
//	System.out.println(String.format("%04d", 6));
//	System.out.println(System.getenv().entrySet());
	//{USERDOMAIN_ROAMINGPROFILE=WENGUOZHANG, LOCALAPPDATA=C:\Users\wgz.WENGUOZHANG\AppData\Local, PROCESSOR_LEVEL=6, USERDOMAIN=WENGUOZHANG, FPS_BROWSER_APP_PROFILE_STRING=Internet Explorer, LOGONSERVER=\\WENGUOZHANG, JAVA_HOME=D:\Program Files\Java\jdk1.8.0_76, SESSIONNAME=Console, ALLUSERSPROFILE=C:\ProgramData, PROCESSOR_ARCHITECTURE=AMD64, PSModulePath=C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules, SystemDrive=C:, MAVEN_HOME=D:\Development\AppSupport\apache-maven-3.3.9, OneDrive=C:\Users\wgz.WENGUOZHANG\OneDrive, APPDATA=C:\Users\wgz.WENGUOZHANG\AppData\Roaming, USERNAME=wgz, ProgramFiles(x86)=C:\Program Files (x86), CommonProgramFiles=C:\Program Files\Common Files, Path=D:/Program Files/Java/jdk1.8.0_76/bin/../jre/bin/server;D:/Program Files/Java/jdk1.8.0_76/bin/../jre/bin;D:/Program Files/Java/jdk1.8.0_76/bin/../jre/lib/amd64;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;"D:\Program Files\Java\jdk1.8.0_76\bin;D:\Program Files\Java\jdk1.8.0_76\jre\bin;";D:\Development\AppSupport\apache-maven-3.3.9\bin;D:\Development\AppSupport\apache-maven-3.3.9\bin;D:\Development\AppSupport\apache-tomcat-7.0.40\bin;D:\Development\AppSupport\mysql-5.7.16-winx64\bin;D:\Program Files\Git\cmd;C:\Users\wgz.WENGUOZHANG\AppData\Local\Microsoft\WindowsApps;;D:\Development\eclipse;, FPS_BROWSER_USER_PROFILE_STRING=Default, PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, OS=Windows_NT, COMPUTERNAME=WENGUOZHANG, CATALINA_HOME=D:\Development\AppSupport\apache-tomcat-7.0.40, PROCESSOR_REVISION=3a09, CLASSPATH=.;D:\Program Files\Java\jdk1.8.0_76\lib\dt.jar;D:\Program Files\Java\jdk1.8.0_76\lib\tools.jar;, CommonProgramW6432=C:\Program Files\Common Files, ComSpec=C:\Windows\system32\cmd.exe, ProgramData=C:\ProgramData, ProgramW6432=C:\Program Files, HOMEPATH=\Users\wgz.WENGUOZHANG, SystemRoot=C:\Windows, TEMP=C:\Users\WGZ~1.WEN\AppData\Local\Temp, HOMEDRIVE=C:, PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 58 Stepping 9, GenuineIntel, USERPROFILE=C:\Users\wgz.WENGUOZHANG, TMP=C:\Users\WGZ~1.WEN\AppData\Local\Temp, M2_HOME=D:\Development\AppSupport\apache-maven-3.3.9, CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, ProgramFiles=C:\Program Files, PUBLIC=C:\Users\Public, NUMBER_OF_PROCESSORS=4, windir=C:\Windows, =::=::\}
	//[USERDOMAIN_ROAMINGPROFILE=WENGUOZHANG, LOCALAPPDATA=C:\Users\wgz.WENGUOZHANG\AppData\Local, PROCESSOR_LEVEL=6, USERDOMAIN=WENGUOZHANG, FPS_BROWSER_APP_PROFILE_STRING=Internet Explorer, LOGONSERVER=\\WENGUOZHANG, JAVA_HOME=D:\Program Files\Java\jdk1.8.0_76, SESSIONNAME=Console, ALLUSERSPROFILE=C:\ProgramData, PROCESSOR_ARCHITECTURE=AMD64, PSModulePath=C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules, SystemDrive=C:, MAVEN_HOME=D:\Development\AppSupport\apache-maven-3.3.9, OneDrive=C:\Users\wgz.WENGUOZHANG\OneDrive, APPDATA=C:\Users\wgz.WENGUOZHANG\AppData\Roaming, USERNAME=wgz, ProgramFiles(x86)=C:\Program Files (x86), CommonProgramFiles=C:\Program Files\Common Files, Path=D:/Program Files/Java/jdk1.8.0_76/bin/../jre/bin/server;D:/Program Files/Java/jdk1.8.0_76/bin/../jre/bin;D:/Program Files/Java/jdk1.8.0_76/bin/../jre/lib/amd64;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;"D:\Program Files\Java\jdk1.8.0_76\bin;D:\Program Files\Java\jdk1.8.0_76\jre\bin;";D:\Development\AppSupport\apache-maven-3.3.9\bin;D:\Development\AppSupport\apache-maven-3.3.9\bin;D:\Development\AppSupport\apache-tomcat-7.0.40\bin;D:\Development\AppSupport\mysql-5.7.16-winx64\bin;D:\Program Files\Git\cmd;C:\Users\wgz.WENGUOZHANG\AppData\Local\Microsoft\WindowsApps;;D:\Development\eclipse;, FPS_BROWSER_USER_PROFILE_STRING=Default, PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, OS=Windows_NT, COMPUTERNAME=WENGUOZHANG, CATALINA_HOME=D:\Development\AppSupport\apache-tomcat-7.0.40, PROCESSOR_REVISION=3a09, CLASSPATH=.;D:\Program Files\Java\jdk1.8.0_76\lib\dt.jar;D:\Program Files\Java\jdk1.8.0_76\lib\tools.jar;, CommonProgramW6432=C:\Program Files\Common Files, ComSpec=C:\Windows\system32\cmd.exe, ProgramData=C:\ProgramData, ProgramW6432=C:\Program Files, HOMEPATH=\Users\wgz.WENGUOZHANG, SystemRoot=C:\Windows, TEMP=C:\Users\WGZ~1.WEN\AppData\Local\Temp, HOMEDRIVE=C:, PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 58 Stepping 9, GenuineIntel, USERPROFILE=C:\Users\wgz.WENGUOZHANG, TMP=C:\Users\WGZ~1.WEN\AppData\Local\Temp, M2_HOME=D:\Development\AppSupport\apache-maven-3.3.9, CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, ProgramFiles=C:\Program Files, PUBLIC=C:\Users\Public, NUMBER_OF_PROCESSORS=4, windir=C:\Windows, =::=::\]

	}
}

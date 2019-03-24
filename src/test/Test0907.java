package test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;

import javax.annotation.Resource;
import javax.sql.rowset.spi.XmlWriter;

import org.apache.commons.logging.Log;


public class Test0907 {
	public static void main(String[] args){
		Class<?> c = Test0906.class;
		for(Field field : c.getDeclaredFields()){
			Resource r = field.getAnnotation(Resource.class);
			System.out.println(r+"-------------------");
		} 
	}
	private static String formatXML(String inputXML) throws Exception{
		SAXReaser reader = new SAXReader();
		Cocument doc = reader.read(new StringReader(inputXML));
		String requestXML = null;
		XmlWriter writer = null;
		if(doc != null){
			try{
				StringWriter stringWriter = new StringWriter();
				OutputFormat format = new OutputFormat("",true);
				writer.write(doc);
				writer.flush();
				requestXML = stringWriter.getBuffer().toString();
			}finally{
				if(writer != null){
					try{
						writer.close():
					}catch(IOException e){
						Log.error("IO关闭异常:"+e);
					}
				}
			}
			return requestXML;
		}
	}
	public static String formatXml(String xmlStr) throws Exception{
		String wholeXml = "";
		if(xmlStr.indexOf("<?xnl")>1){
			String xmlHead = xmlStr.substring(0, xmlStr.indexOf("<?xnl")-1);
			String xmlBody = 	xmlStr.substring( xmlStr.indexOf("<?xnl"),xmlStr.length());	
			wholeXml = xmlHead + formatXML(xmlBody);		
		}else{
			wholeXml = xmlStr;
		}
		return wholeXml.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "");
	}
}

package com.yuchengtech.bione.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
/**
 * 输出JSON串
 */
public class OutJsonUtils {
	public static void outJson(HttpServletResponse response, Object jsonDataStr) {
		try {
			response.setContentType("application/json;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(jsonDataStr);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			//SysLogs.printError("异常" + e.getClass(), e);
			
		}
	}
	public static void myOutJson(HttpServletResponse response, Object jsonDataStr) {
		try {
			response.setContentType("application/json;charset=utf-8");
			/*PrintWriter out = response.getWriter();
			out.print(jsonDataStr);
			out.flush();
			out.close();*/
			OutputStream o=response.getOutputStream();
			PrintWriter out=new PrintWriter(o);
			out.print(jsonDataStr);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			//SysLogs.printError("异常" + e.getClass(), e);
			
		}
	}
}

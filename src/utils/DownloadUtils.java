package com.yuchengtech.bione.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
public class DownloadUtils {
	
	/**
	 * 导出文件
	 * 
	 * @param response
	 * @param file
	 *            导出文件
	 * @param contentType
	 * @throws IOException
	 */
	public static void download(HttpServletResponse response, File file) throws Exception {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		response.setContentType("application/octet-stream;charset=UTF-8");
		response.addHeader("Content-disposition", "attachment; filename=" + new String(file.getName().getBytes("GB18030"), "ISO-8859-1"));
		response.addHeader("Content-Length", String.valueOf(file.length()));
		bis = new BufferedInputStream(new FileInputStream(file));
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		bis.close();
		bos.close();
	}
		/**
		 * 导出文件
		 * 
		 * @param response
		 * @param file
		 *            导出文件
		 * @param contentType
		 * @throws IOException
		 */
		public static void download(HttpServletResponse response, File file,String fileName) throws Exception {
			response.setContentType("text/html;charset=UTF-8");
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			fileName = new String(fileName.getBytes("GBK"), "ISO8859_1");
			long fileLength = file.length();
			
			response.setContentType("application/octet-stream");
			response.setHeader("Content-disposition", "attachment; filename="+ fileName);
			response.setHeader("Content-Length", String.valueOf(fileLength));
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
			bis.close();
			bos.close();
		}
}

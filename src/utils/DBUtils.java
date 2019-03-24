package com.yuchengtech.bione.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

public class DBUtils {
	
	public static Connection getConnection() {
		DataSource ds = (DataSource)SpringContextHolder.getBean("AppDataSource");
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void savelog(String id,String name,long time1,long time2,long time3,long time4 ){
		PreparedStatement ps = null;
		Connection conn = null;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		try {
			
			StringBuffer buff = new StringBuffer();
			buff.append(" insert into rpt_tx_log (TX_ID, TX_NAME, TX_TIME1, TX_TIME2, TX_TIME3, TX_TIME4, TX_ESCAPE_TIME) VALUES( ?,?,?,?,?,?,?)");
	
			conn = getConnection() ;
			ps = conn.prepareStatement(buff.toString());
			
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setTimestamp(3, new Timestamp(time1));
			ps.setTimestamp(4, new Timestamp(time2));
			ps.setTimestamp(5, new Timestamp(time3));
			ps.setTimestamp(6, new Timestamp(time4));
			ps.setLong(7, time4 - time1);

//			conn.setAutoCommit(false);
			ps.execute();
//			conn.commit();
		}catch(SQLException se){
			se.printStackTrace();
			if(se.getNextException() != null){				
				se.getNextException().printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}	

	
	public static void savelog(String type, String id,String name,long time1,long escape ){
		
		PreparedStatement ps = null;
		Connection conn = null;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		try {
			conn = getConnection() ;
			
			StringBuffer buff = new StringBuffer();
			if(type.equals("1")){

				buff.append(" insert into rpt_tx_log (TX_ID, TX_NAME, TX_TIME1, TX_ESCAPE_TIME) VALUES( ?,?,?,?)");
				
				ps = conn.prepareStatement(buff.toString());
				
				ps.setString(1, id);
				ps.setString(2, name);
				ps.setTimestamp(3, new Timestamp(time1));
				ps.setLong(4, escape);
			}
			
			if(type.equals("2")){
				
				buff.append(" update rpt_tx_log set TX_TIME2=? where TX_ID=?");

				ps = conn.prepareStatement(buff.toString());
				ps.setTimestamp(1, new Timestamp(time1));
				ps.setString(2, id);
			}
			if(type.equals("3")){
				buff.append(" update rpt_tx_log set TX_TIME3=? where TX_ID=?");

				ps = conn.prepareStatement(buff.toString());
				ps.setTimestamp(1, new Timestamp(time1));
				ps.setString(2, id);
			}
			if(type.equals("4")){
				buff.append(" update rpt_tx_log set TX_TIME4=? where TX_ID=?");

				ps = conn.prepareStatement(buff.toString());
				ps.setTimestamp(1, new Timestamp(time1));
				ps.setString(2, id);
			}
	

//			conn.setAutoCommit(false);
			ps.execute();
//			conn.commit();
		}catch(SQLException se){
			se.printStackTrace();
			if(se.getNextException() != null){				
				se.getNextException().printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

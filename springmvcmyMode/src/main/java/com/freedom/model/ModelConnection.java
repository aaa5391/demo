package com.freedom.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.freedom.freemarkerutil.CodeResourceUtil;

 
public class ModelConnection
 {

	private static Connection conn;
	private static Statement stmt;
	private static String sql;
	private static ResultSet rs;
 
	//拿到数据
	public static  ArrayList<ModelProperty> GetModelPropertyList(String tablename){
		//System.out.println(CodeResourceUtil.DATABASE_TYPE);
		if( CodeResourceUtil.DATABASE_TYPE.equals("mysql") ){
			return getMysqlList(tablename);
		}
		else if( CodeResourceUtil.DATABASE_TYPE.equals("oracle") ){
			return getOracleList(tablename);
		}
		return null;
	}
	
	
	//得到数据库的字段和注释 Oracle
	private static ArrayList<ModelProperty> getOracleList(String tablename) {	
		String ispk2= getOracleispk( tablename);//拿到主键名字 
		ArrayList<ModelProperty> List = new ArrayList<ModelProperty>();
		Connection conn = getConnection();
		String sql = " select * from user_tab_cols colstable  inner join user_col_comments commentstable on colstable.column_name = commentstable.column_name  where colstable.table_name = commentstable.table_name  and colstable.table_name ='"+tablename.toUpperCase().trim()+"' "; 
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				ModelProperty mode=new ModelProperty();
				String comments=rs.getString("comments") == null ? "" :rs.getString("comments") ;
				mode.setComments(comments);
				String column_name=rs.getString("column_name");
				mode.setColumn_name(column_name.toLowerCase());
				String data_type=rs.getString("data_type");
				data_type=formatDataType(data_type);
				mode.setData_type(data_type);
				String isnull=rs.getString("nullable");//是否是空
				if(isnull.equalsIgnoreCase("Y"))isnull="可空";else
				if(isnull.equalsIgnoreCase("N"))isnull="不可";
				mode.setIsnull(isnull);
				String ispk=rs.getString("column_id");//是否主键 
				if(column_name.equalsIgnoreCase(ispk2)) ispk="主键"; else ispk="";
				mode.setIspk(ispk);
				List.add(mode);
				//System.out.println(comments+"---"+column_name+"---"+data_type+"---"+isnull+"--"+ispk); 
			}
			if(List.size()==0){
				System.out.println("------没有找到表信息，请检查  "+tablename.toUpperCase()+" 是否存在!");
			}
		} catch (SQLException e) {
			System.out.println("数据异常查看异常！");
		}
		
		return List;
	}
	
	//查询主键 ispk()
	private static String getOracleispk(String tablename){
		Connection conn = getConnection();
		String comments="";
		String sql=" select column_name from user_cons_columns cu, user_constraints au where cu.constraint_name = au.constraint_name and au.constraint_type = 'P' and au.table_name ='"+tablename.toUpperCase()+"'";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				 comments=rs.getString("column_name") ;	
			}
		} catch (SQLException e) {
			
		}
		return comments;

	}
	 //得到数据库的字段和注释Mysql
		private static  ArrayList<ModelProperty> getMysqlList(String tablename) {	
			
			ArrayList<ModelProperty> List = new ArrayList<ModelProperty>();
			Connection conn = getConnection();
			String sql = " select column_name,data_type,column_comment,0,0 from information_schema.columns where table_name = '"+ tablename.toUpperCase()+"' and table_schema ='"+CodeResourceUtil.DATABASE_NAME+"' "; 
			PreparedStatement stmt;
			try {
				stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					ModelProperty mode=new ModelProperty();
					String comments=rs.getString("comments") == null ? "" :rs.getString("comments") ;
					mode.setComments(comments);
					String column_name=rs.getString("column_name");
					mode.setColumn_name(column_name.toLowerCase());
					String data_type=rs.getString("data_type");
					data_type=formatDataType(data_type);
					mode.setData_type(data_type);
					String isnull=rs.getString("nullable");//是否是空
					if(isnull.equalsIgnoreCase("Y"))isnull="可空";else
					if(isnull.equalsIgnoreCase("N"))isnull="不可";
					mode.setIsnull(isnull);
					String ispk=rs.getString("column_id");//是否主键 
					if(ispk.equals("1")) ispk="//主键"; else ispk="";
					mode.setIspk(ispk);
					List.add(mode);
				//	System.out.println(comments+"---"+column_name+"---"+data_type+"---"+isnull+"--"+ispk); 
				}
				if(List.size()==0){
					System.out.println("------没有找到表信息，请检查  "+tablename.toUpperCase()+" 是否存在!");
				}
			} catch (SQLException e) {
				System.out.println("数据异常查看异常！");
			}
			return List;
		}
		
	
		//数据库连接
		private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(CodeResourceUtil.DIVER_NAME);
			String url = CodeResourceUtil.URL;
			String user = CodeResourceUtil.USERNAME;
			String pass =  CodeResourceUtil.PASSWORD;
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("异常连接！");
		}
		return conn;
	}
	
	
	//类型转换 可扩展
	private static String formatDataType(String dataType){
		String datatype="";
		if(dataType.equalsIgnoreCase("Integer"))
		datatype="Integer";
		if(dataType.equalsIgnoreCase("VARCHAR2")||dataType.equalsIgnoreCase("CHAR")||dataType.equalsIgnoreCase("NVARCHAR2"))
		datatype="String";
		if(dataType.equalsIgnoreCase("float"))
		datatype="Float";
		if(dataType.equalsIgnoreCase("double"))
			datatype="Double";
		if(dataType.equalsIgnoreCase("number"))
			datatype="Integer";
		if(dataType.equalsIgnoreCase("date"))
			datatype="Date";
		if(dataType.equalsIgnoreCase("time"))
			datatype="Date";
		if(dataType.equalsIgnoreCase("clob"))
			datatype="String";
		if(dataType.equalsIgnoreCase("numeric"))
			datatype="BigDecimal";
		if(dataType.equalsIgnoreCase("blob"))
			datatype="byte[]";
		
		return datatype;
	}
 }


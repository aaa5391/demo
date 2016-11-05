package com.freedom.freemarkerutil;

import java.util.ResourceBundle;

public class CodeResourceUtil {
	public static final ResourceBundle bundle = ResourceBundle.getBundle("generator/generator_database");
	public static String DIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	public static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static String USERNAME = "web";
	public static String PASSWORD = "a";
	public static String DATABASE_NAME = "";
	public static String DATABASE_TYPE = "oracle";

	static {
		DIVER_NAME = getDIVER_NAME();
		URL = getURL();
		USERNAME = getUSERNAME();
		PASSWORD = getPASSWORD();
		DATABASE_NAME = getDATABASE_NAME();

		if ((URL.indexOf("mysql") >= 0) || (URL.indexOf("MYSQL") >= 0))
			DATABASE_TYPE = "mysql";
		else if ((URL.indexOf("oracle") >= 0) || (URL.indexOf("ORACLE") >= 0))
			DATABASE_TYPE = "oracle";
		else if ((URL.indexOf("postgresql") >= 0)
				|| (URL.indexOf("POSTGRESQL") >= 0))
			DATABASE_TYPE = "postgresql";
	}

	private static final String getDIVER_NAME() {
		return bundle.getString("diver_name");
	}

	private static final String getURL() {
		return bundle.getString("url");
	}

	private static final String getUSERNAME() {
		return bundle.getString("username");
	}

	private static final String getPASSWORD() {
		return bundle.getString("password");
	}

	private static final String getDATABASE_NAME() {
		return bundle.getString("database_name");
	}
}

package com.freedom.freemarkerutil;

import freemarker.template.Configuration;

public class ConfigurationHelper {
	
	private static Configuration cfg = null;

	public static Configuration getConfiguration() {
		if (cfg == null) {
			cfg = new Configuration();
			cfg.setClassForTemplateLoading(ConfigurationHelper.class,"/template");//设置路径
			cfg.setDefaultEncoding("UTF-8");
		}
		return cfg;
	}
	
	
}

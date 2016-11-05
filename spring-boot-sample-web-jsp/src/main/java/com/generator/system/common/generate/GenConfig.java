/**
 * 
 */
package com.generator.system.common.generate;

import java.io.File;
import java.io.IOException;

import cn.org.rapid_framework.generator.GeneratorProperties;
import cn.org.rapid_framework.generator.util.ArrayHelper;
import cn.org.rapid_framework.generator.util.SystemHelper;

/**
 * @Description TODO
 * @author JIAYUAN
 * @createDate 2016年10月21日 下午4:47:16
 * @modifier
 * @modifyDate
 * @version 1.0
 */
public class GenConfig {

	public static void checkAndMakeOutRootDirs() throws IOException{
        // renfufei 处理目录不存在的问题
        String outRoot = GeneratorProperties.getRequiredProperty("outRoot").replace('/', File.separatorChar);
        //
        File outRootDir = new File(outRoot);
        if(!outRootDir.exists()){
            outRootDir.mkdirs();
        }
        windowsOsOpenOutRoot();
    }

	public static String getIncludes(String[] args, int i) {
	    String includes = ArrayHelper.getValue(args, i);
	    if(includes == null) return null;
	    return includes.indexOf("*") >= 0 || includes.indexOf(",") >= 0 ? includes : includes+"/**";
	}
	
	public static String getTemplateRootDir() {
	    return System.getProperty("templateRootDir", "template");
	}
	
	public static void windowsOsOpenOutRoot() throws IOException{
		if(SystemHelper.isWindowsOS) {
            // renfufei 处理目录不存在的问题
            String outRoot = GeneratorProperties.getRequiredProperty("outRoot").replace('/', File.separatorChar);
            // 打开目录
            Runtime.getRuntime().exec("cmd.exe /c start "+ outRoot);
        }
	}
	
}

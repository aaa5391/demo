/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.generator.system.core.main;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.generator.system.core.service.UserService;


@SpringBootApplication
@ComponentScan("com.generator.system")
public class StarWebApplication extends SpringBootServletInitializer implements CommandLineRunner{

    private Logger logger = LoggerFactory.getLogger(StarWebApplication.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    Environment env;
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserService();
	}
	
/*	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	}*/
    
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StarWebApplication.class);
		
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StarWebApplication.class, args);
	}
	
	@Override
    public void run(String... strings) throws Exception {
        //应用起来后,先尝试关闭db连接,避免一些冷门应用,无人访问占用连接资源，同时也测试db连接关闭是否正常
        try {
            dataSource.getConnection().close();
            logger.info("当前环境: " + env.getProperty("profile"));
            logger.info("db连接正常关闭");
        } catch (Exception e) {
            logger.error("db连接关闭失败:", e);
        }
    }

}

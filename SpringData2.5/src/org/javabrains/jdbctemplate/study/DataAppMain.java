package org.javabrains.jdbctemplate.study;

import org.apache.log4j.Logger;
import org.javabrains.jdbctemplate.data.UserJdbcImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataAppMain {
	public static Logger log = Logger.getLogger(DataAppMain.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appliationContext.xml"); ;
		UserJdbcImpl uji = (UserJdbcImpl) context.getBean("userJdbcImpl",UserJdbcImpl.class);
		uji.getUser(1);
		
		log.info("come to the end of the program");
	}

}

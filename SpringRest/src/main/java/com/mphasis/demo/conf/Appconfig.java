package com.mphasis.demo.conf;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.mphasis.demo")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Appconfig {
      
     @Bean
     public DriverManagerDataSource getDataSource()
     {
     	DriverManagerDataSource ds = new DriverManagerDataSource();
     	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
     	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
     	ds.setUsername("system");
     	ds.setPassword("system");
     	return ds;
     	
     }
     @Bean
     public LocalSessionFactoryBean getSsessionFactory()
     {
     	LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
     	sf.setDataSource(getDataSource());
     	Properties props = new Properties();
     	props.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
     	props.put("hibernate.hbm2ddl.auto","update");
     	/*props.put("hibernate.show_sql","true");
     	props.put("hibernate.format_sql","true");*/
     	sf.setHibernateProperties(props);
     	sf.setPackagesToScan("com.mphasis.demo.entities");
     	return sf;
     	
     }
     
     @Bean
     public AspectHelper getAspect() {
     	return new AspectHelper();
     }
     
}


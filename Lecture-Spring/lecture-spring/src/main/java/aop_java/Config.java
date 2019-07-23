package aop_java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAspectJAutoProxy
@ComponentScan(basePackages= {"aop_java"})
@Configuration
public class Config {
	

}

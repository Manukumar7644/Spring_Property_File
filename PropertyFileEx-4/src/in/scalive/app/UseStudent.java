package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Student;
import in.scalive.config.AppConfig;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Container started");
		Student s1=(Student)container.getBean("student");
		s1.show();
	}
}

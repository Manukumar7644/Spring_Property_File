package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${student.roll}")
	private int roll;	
	
	@Value("${student.name}")
    private String name;    
    public Student() {
    	System.out.println("Student bean created...");
    }
    
	
	public void show() {
    	System.out.println("Name:"+name);
    	System.out.println("Roll="+roll);
    }
}

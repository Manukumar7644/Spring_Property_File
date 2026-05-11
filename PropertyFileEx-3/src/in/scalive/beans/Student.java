package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int roll;	
	
	
    private String name;    
    public Student(@Value("${student.roll}")int roll,@Value("${student.name:guest}")String name) {
    	this.roll=roll;
    	this.name=name;
    	System.out.println("Student bean created...");
    }
    
	
	public void show() {
    	System.out.println("Name:"+name);
    	System.out.println("Roll="+roll);
    }
}

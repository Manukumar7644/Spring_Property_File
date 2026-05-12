package in.scalive.beans;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int roll;	
    private String name; 
    List<String>subjects;
    public Student(@Value("${student.roll}")int roll, @Value("${student.name}")String name, @Value("${student.subjects}")List<String>subjects) {
    	this.roll=roll;
    	this.name=name;
    	this.subjects=subjects;
    	System.out.println("Student bean created...");
    	System.out.println("subjects:"+this.subjects.getClass().getName());
    }
    
	
	public void show() {
    	System.out.println("Name:"+name);
    	System.out.println("Roll="+roll);
    	System.out.println("Subjects:"+subjects);
    }
}

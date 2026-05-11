package in.scalive.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int roll;	
    private String name; 
    String []subjects;
    public Student(@Value("${student.roll}")int roll, @Value("${student.name}")String name, @Value("${student.subjects}")String []subjects) {
    	this.roll=roll;
    	this.name=name;
    	this.subjects=subjects;
    	System.out.println("Student bean created...");
    }
    
	
	public void show() {
    	System.out.println("Name:"+name);
    	System.out.println("Roll="+roll);
    	System.out.println("Subjects:"+Arrays.toString(subjects));
    }
}

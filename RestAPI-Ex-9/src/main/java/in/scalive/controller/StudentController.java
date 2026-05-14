package in.scalive.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.scalive.model.ErrorResponse;
import in.scalive.model.Student;

@RestController
@RequestMapping(value="/api")
public class StudentController {
	private Map<Integer, Student>stdMap;
	public StudentController() {
		stdMap=new HashMap(Map.of(101,new Student(101,"Amit",45.6),102,new Student(102,"Deepak",87.3),103,new Student(103,"Gagan",67.2)));
	}
    @GetMapping("/students")
    public Collection<Student> getAllStudents(){
    	return stdMap.values();
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable Integer id) {
    	Student s=stdMap.get(id);
    	return s;
    }
    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student s) {
    	int id=100+stdMap.size()+1;
    	s.setId(id);
    	stdMap.put(id, s);
    	return s;
    }
    @PutMapping("/students/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Student s,@PathVariable Integer id){
    	Student existingStudent=stdMap.get(id);
    	if(existingStudent==null) {
    		ErrorResponse obj=new ErrorResponse(HttpStatus.NOT_FOUND.value(), "No record of student id "+id+" found!");
    		return new ResponseEntity<>(obj,HttpStatus.NOT_FOUND);
    	}
    	existingStudent.setName(s.getName());
    	existingStudent.setPer(s.getPer());
    	return ResponseEntity.ok(existingStudent);
    	
    }
}

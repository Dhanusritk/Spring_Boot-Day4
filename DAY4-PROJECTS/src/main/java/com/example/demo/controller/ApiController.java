package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;


@RestController
public class ApiController {
	@Autowired
	ApiService sser;
	@PostMapping("addstudent")
	
	 public Student add(@RequestBody Student ss) {
		 return sser.addinfo(ss);
	 }
//	@PostMapping("addnstudent")
//	public List<Student> addn(@RequestBody List<Student> ss){
//		return (List<Student>)sser.savendetails(ss);
//	}
	@GetMapping("showdetails")
	public List<Student> show(){
		return sser.showinfo();
		
	}
	@PutMapping("updateDetails")
	public Student updateValue(@RequestBody Student ss) {
		return sser.update(ss);
	}
	@DeleteMapping("deleteDetails")
	public String deleteDetail(@RequestBody Student ss) {
		sser.delete(ss);
		return "Deleted Successfully";
	}

}
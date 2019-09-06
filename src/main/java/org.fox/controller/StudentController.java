package org.fox.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.fox.entity.Student;
import org.fox.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="controller")
@Controller
public class StudentController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping(value="queryStudentByNo") 
	public String queryStudentByNo(@PathParam("sno") Integer sno,Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(sno);
		map.put("student",student);
		return "success";
	}
	
	@RequestMapping(value="queryStudentById") 
	public String queryStudentById(@PathParam("sno") Integer sno,Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(sno);
		System.out.println(sno);
		map.put("student",student);
		return "success";
	}
	
	@RequestMapping(value="test") 
	public String test() {
		return "success";
	}
}

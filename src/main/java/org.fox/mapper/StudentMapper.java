package org.fox.mapper;

import org.fox.entity.Student;
import org.springframework.stereotype.Repository;

@Repository("studentMapper")
public interface StudentMapper {
	//根据No查询学生
	public Student queryStudentByNo(int sno);
	
	//增加学生
	public void addStudent(Student student);
	
}

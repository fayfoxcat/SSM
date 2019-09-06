package org.fox.mapper;

import org.fox.entity.Student;
import org.springframework.stereotype.Repository;

@Repository("studentMapper")
public interface StudentMapper {
	//����No��ѯѧ��
	public Student queryStudentByNo(int sno);
	
	//����ѧ��
	public void addStudent(Student student);
	
}

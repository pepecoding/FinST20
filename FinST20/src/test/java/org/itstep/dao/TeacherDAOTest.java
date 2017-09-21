package org.itstep.dao;

import static org.junit.Assert.*;

import org.itstep.dao.pojo.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherDAOTest {

@Autowired
TeacherDAO teacherDAO;
	
@Test
	public void testFindGroupsByTeacher() {
		Teacher teacher = new Teacher();
		teacher.setLogin("Zoyas");
	    teacher.setPassword("2344576");
	    teacher.setFirstName("Zoya");
	    teacher.setLastName("Abdin");
	    teacher.setSubject("ST20");
	  
	    Teacher teacherDB = teacherDAO.save(teacher);
	    
	    assertNotNull(teacher);
	     Teacher checkedTeacher = teacherDAO.findOne(teacher.getLogin());
	     assertNotNull(teacher);
	     assertEquals("Abdin", checkedTeacher.getLastName());
	    teacherDAO.delete(teacherDB.getLogin());
	
	}

	
	
}

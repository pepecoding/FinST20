package org.itstep.dao;

import static org.junit.Assert.*;

import org.itstep.App;
import org.itstep.dao.pojo.Lesson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class LessonDAOTest {
	@Autowired
	LessonDAO lessonDAO;
	
	@Test
	public void createAndGetAndDelete() {
		Lesson lesson = new Lesson();
		lesson.setLessonStart((long)(9));
		lesson.setLength((long)(1000*60*45));
		lesson.setTeacher("Ivanov");
		lesson.setGroup("ST-20");
		lesson.setRoom("2");
		lesson.setSubject("Math");
		Lesson lessonFromDB = lessonDAO.saveAndFlush(lesson);
		assertNotNull(lessonFromDB);
		Lesson checkedLesson = lessonDAO.findOne(lessonFromDB.getLessonId());
		assertNotNull(checkedLesson);
		assertEquals("Math", lessonFromDB.getSubject());
		lessonDAO.delete(lessonFromDB.getLessonId());
	
		
		
	}

	

}

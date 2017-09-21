package org.itstep.service;

import static org.junit.Assert.*;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.StudentDAO;
import org.itstep.dao.pojo.Group;
import org.itstep.dao.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class GroupServiceTest {
	
	@Autowired
	GroupService groupService;

	@Test
	public void testCreateAndUpdate() {
		Group group = new Group();
		group.setCourse(1);
		group.setGroupName("ST20");
		Group groupFromDB = groupService.createAndUpdateGroup(group);		
		assertNotNull(groupFromDB);
		
	}

	@Test
	public void testGetGroup() {
//		Group checkedGroup = groupService.findOne(groupFromDB.getGroupName());
//		assertNotNull(checkedGroup);
//		assertEquals("ST20", groupFromDB.getCourse());
//		groupService.delete(groupFromDB.getGroupName());
		
	}

	@Test
	public void testFindAllByCourse() {
//		List<Group> groupList = groupService.findAllByCourse(1);
//		assertTrue(!groupList.isEmpty());
//		groupService.delete(groupFromDB.getGroupName());
	}

	@Test
	public void testDelete() {
//		groupService.delete(groupFromDB.getGroupName());
		
		
	}

}
package org.itstep.service;

import static org.junit.Assert.*;

import org.itstep.App;
import org.itstep.dao.StudentDAO;
import org.itstep.dao.pojo.Group;
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
		
	}

	@Test
	public void testFindAllByCourse() {
	}

	@Test
	public void testDelete() {
		
	}

}
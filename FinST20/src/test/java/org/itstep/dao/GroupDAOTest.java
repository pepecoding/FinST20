/**
 * 
 */
package org.itstep.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Group;
import org.itstep.dao.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author student
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class GroupDAOTest {
	
	@Autowired
	GroupDAO groupDAO;
	/**
	 * Test method for {@link org.itstep.dao.GroupDAO#findAllByCourse(int)}.
	 */
	@Test
	public void testFindAllByCourse() {
		Group group = new Group();
		group.setGroupName("ST20");
		group.setCourse(3);
		Group groupFromDB = groupDAO.save(group);
		List<Group> groupList = groupDAO.findAllByCourse(3);
		assertTrue(!groupList.isEmpty());
		
		
	}

	/**
	 * Test method for {@link org.itstep.dao.GroupDAO#save(org.itstep.dao.pojo.Group)}.
	 */
	
	
	@Test
	public void testCreateAndSaveAndDeleteGroup() {
			Group group = new Group();
			group.setGroupName("ST20");
			group.setCourse(3);
			Group groupFromDB = groupDAO.save(group);
			assertNotNull(groupFromDB);
			Group checkedGroup = groupDAO.findOne(groupFromDB.getGroupName());
			assertNotNull(checkedGroup);
			assertEquals("ST20", groupFromDB.getCourse());
			groupDAO.delete(groupFromDB.getGroupName());
	}

}

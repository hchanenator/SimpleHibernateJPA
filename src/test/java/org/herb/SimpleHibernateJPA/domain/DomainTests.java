/**
 * 
 */
package org.herb.SimpleHibernateJPA.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import junit.framework.TestCase;

import org.herb.SimpleHibernateJPA.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author herb
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class DomainTests extends TestCase {

	private static final Logger logger = LoggerFactory
			.getLogger(DomainTests.class);

	private final String DEPT_NAME = "Development";

	@PersistenceContext
	private EntityManager em;
		
	@Test
	public void testDepartment() {
		Department deptTest = new Department();
		deptTest.setDeptName(DEPT_NAME);
		logger.info(deptTest.toString());
		
		assertNotNull(em);
//
//		try {
//
//			em.persist(deptTest);
//			em.flush();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//		assertTrue(deptTest.getDeptId() != 0);
	}

}

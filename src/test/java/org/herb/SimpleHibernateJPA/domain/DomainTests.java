/**
 * 
 */
package org.herb.SimpleHibernateJPA.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author herb
 *
 */

@Transactional
public class DomainTests extends TestCase {
	
	private static final Logger logger = LoggerFactory.getLogger(DomainTests.class);
	
	private final String DEPT_NAME = "Development";
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	public void testDepartment() {
		Department deptTest = new Department();
		deptTest.setDeptName(DEPT_NAME);
		logger.info(deptTest.toString());
		
		try {
		em.persist(deptTest);
		em.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		assertTrue(deptTest.getDeptId() != 0);
	}

}

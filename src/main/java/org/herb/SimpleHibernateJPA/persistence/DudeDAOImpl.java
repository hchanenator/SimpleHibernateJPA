/**
 * 
 */
package org.herb.SimpleHibernateJPA.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.herb.SimpleHibernateJPA.domain.Dude;
import org.junit.runner.RunWith;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author herb
 *
 */

@Transactional
public class DudeDAOImpl {

	@PersistenceContext
	private EntityManager em;
	
	public Long save(Dude user) {
		em.persist(user);
		return user.getId();
	}
	
	public List<Dude> getAll() {
		return em.createQuery("select d from Dude d", Dude.class).getResultList();
	}
}

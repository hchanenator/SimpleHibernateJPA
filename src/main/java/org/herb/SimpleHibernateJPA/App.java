package org.herb.SimpleHibernateJPA;

import java.util.List;

import org.herb.SimpleHibernateJPA.domain.Dude;
import org.herb.SimpleHibernateJPA.persistence.DudeDAOImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DudeDAOImpl dao = (DudeDAOImpl)ctx.getBean("dudeDao");
        
        Dude herb = new Dude();
        herb.setName("Herb");
        
        Dude karen = new Dude();
        karen.setName("Karen");
        
        dao.save(herb);
        dao.save(karen);
        
        List<Dude> users = dao.getAll();
        for (Dude user : users) {
        	System.out.println(user);
        }
        
        ctx.close();
        
    }
}

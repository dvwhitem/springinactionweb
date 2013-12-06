
package com.habuma.spitter.persistence;

import com.habuma.spitter.domain.Spitter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dv
 */
public class SimpleJdbcTemplateSpitterDaoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("com/habuma/spitter/persistence/persistence.xml");
        
        SpitterDao dao = (SpitterDao) ctx.getBean("spitterDao");
        
//        Spitter spitter = new Spitter();
//        
//        spitter.setUsername("Mark");
//        spitter.setPassword("435454");
//        spitter.setFullName("Mark O'Connar");
//        spitter.setEmail("mark.mailru");
//        spitter.setUpdateByEmail(true);
//        dao.addSpitter(spitter);
        
        Spitter user = dao.getSpitterById(2);
        System.out.println(user.getFullName());
    }
}

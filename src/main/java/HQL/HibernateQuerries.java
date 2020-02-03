package HQL;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ncr.todo.Helper.CommonUtils;
@Transactional
public class HibernateQuerries {
 
private EntityManager em;
public HibernateQuerries(EntityManager em) {
	super();
	this.em = em;
	}
}

package com.whroid.ee.whros.test.dao;

import java.util.List;

import javax.annotation.Resources;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import antlr.debug.TraceAdapter;

import com.whroid.ee.whros.base.dao.BaseDao;
import com.whroid.ee.whros.test.entity.User;


@Repository
public class UserDao extends BaseDao{

	
	@SuppressWarnings("unchecked")
	public User getUser(String id)
	{
		Transaction  tx= getSession().beginTransaction();
//		List<User> users = this.getSession().createQuery("select * from c_user where id=:id").setParameter("id", id).list();
		List<User> users = this.getSession().getNamedQuery("c.getUserById").setParameter("id", id).list();
		tx.commit();
		if(users != null&&users.size()>0)
		{
			return users.get(0);
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUser()
	{
		Transaction  tx = getSession().beginTransaction();
//		List<User> users = getSession().createQuery("select * from c_user").list();
		List<User> users = this.getSession().getNamedQuery("c.getUsers").list();
		tx.commit();
		return users;
	}
	
	public User save(User user)
	{
		return (User) getSession().save(user);
	}
}

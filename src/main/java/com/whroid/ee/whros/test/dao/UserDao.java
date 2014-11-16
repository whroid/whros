package com.whroid.ee.whros.test.dao;

import java.util.List;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.whroid.ee.whros.base.dao.BaseDao;
import com.whroid.ee.whros.test.entity.User;


@Repository
public class UserDao extends BaseDao{

	
	public User getUser(String id)
	{
		getSession().beginTransaction();
		List<User> users = getSession().createQuery("select * from c_user where id=:id").setParameter("id", id).list();
		if(users != null&&users.size()>0)
		{
			return users.get(0);
		}
		
		return null;
	}
	
	public List<User> getUser()
	{
		getSession().beginTransaction();
		List<User> users = getSession().createQuery("select * from c_user").list();
		return users;
	}
	
	public User save(User user)
	{
		return (User) getSession().save(user);
	}
}

package com.whroid.ee.whros.test.service;

import java.util.List;
import com.whroid.ee.whros.test.entity.User;

public interface UserService {
	 User getUser(String id);
	 List<User> getUser();	
	 User save(User user);
}

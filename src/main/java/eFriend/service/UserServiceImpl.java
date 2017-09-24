package eFriend.service;

import org.springframework.beans.factory.annotation.Autowired;

import eFriend.Dao.UserDAO;
import eFriends.model.Login;
import eFriends.model.User;

public class UserServiceImpl implements UserService {

	  @Autowired
	  public UserDAO userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}

package com.gtafe.service;

import java.util.List;
import java.util.Map;

import com.gtafe.model.User;


public interface IUserService {
	    User selectUserByID(int id);
	    User login(String username,String password);
	    List<User> findAllUser();
	    List<User> selectUsers(String userName);
	    void addUser(User user);
	    void updateUser(User user);
	    void deleteUser(int id);
	    int addUserList(List<User> userList) throws Exception;
	    
	    List<User> getDataByPage(Map map);
	    int getDataCount(String sql);
}

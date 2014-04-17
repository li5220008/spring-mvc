package com.gtafe.service;

import java.util.List;
import java.util.Map;

import com.gtafe.model.User;


public interface IUserService {
	   public User selectUserByID(int id);   
	    public User login(Map map);
	    public List<User> findAllUser();
	    public List<User> selectUsers(String userName);    
	    public void addUser(User user);
	    public void updateUser(User user);
	    public void deleteUser(int id); 
	    public int addUserList(List<User> userList) throws Exception;
	    
	    public List<User> getDataByPage(Map map);
	    public int getDataCount(String sql);
}

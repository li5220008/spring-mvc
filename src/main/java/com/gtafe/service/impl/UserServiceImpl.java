package com.gtafe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gtafe.utils.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gtafe.dao.IUserOperation;
import com.gtafe.model.User;
import com.gtafe.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
    private IUserOperation userMapper;

	public void addUser(User user) {
        //md5加密
        user.setPassword(ServiceUtils.md5(user.getPassword()));
		userMapper.addUser(user);
	}

	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

	public List<User> findAllUser() {
		List<User> userList=userMapper.findAllUser();
		return userList;
	}

	public User login(String username,String password) {
        password = ServiceUtils.md5(password);
        Map map = new HashMap();
        map.put("username",username);
        map.put("password",password);
		return  userMapper.login(map);
	}

	public User selectUserByID(int id) {
		// TODO Auto-generated method stub

		return null;
	}

	public List<User> selectUsers(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}
    public List<User> getDataByPage(Map map){
    	return userMapper.getDataByPage(map);
    };
    public int getDataCount(String sql){
    	return userMapper.getDataCount(sql);
    };
    
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int addUserList(List<User> userList) throws Exception{  
    	try {
			for (int i = 0; i <userList.size(); i++) {
				User user = userList.get(i);
				if(i==8){
					user.setPassword(null);
				}
				userMapper.addUser(user);
			}
		} catch (Exception e) {			
				 throw e;//注意，这里必须是重新抛出，让spring来处理，不然是不会rollback的。
		}
		return 10;
    }
}

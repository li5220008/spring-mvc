package com.gtafe.dao;

import java.util.List;
import java.util.Map;

import com.gtafe.model.User;





/**
 * User操作接口
 * 方法名 selectUserByID 必须与 User.xml 里面配置的 
 * select 的id 对应（<select id="selectUserByID"）
 * @author Free
 *
 */
public interface IUserDao {
    User selectUserByID(int id);
    User login(Map map);
    List<User> findAllUser();
    List<User> selectUsers(String userName);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getDataByPage(Map map);
    int getDataCount(String sql);
}

package com.gtafe.service.impl;

import com.gtafe.BaseTest;
import com.gtafe.model.User;
import com.gtafe.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-17
 * Time: 下午1:53
 */
public class UserServiceImplTest extends BaseTest {

    @Autowired
    IUserService userService;

    @Test
    public void testAddUser() throws Exception {
        User user = new User();
        user.setUsername("li");
        user.setPassword("123456");
        user.setUserAge(28);
        user.setUserAddress("深圳");
        user.setBirthday(new Date());
        userService.addUser(user);
    }

    @Test
    public void testDeleteUser() throws Exception {
        userService.deleteUser(1);
    }

    @Test
    public void testFindAllUser() throws Exception {
        List<User> allUser = userService.findAllUser();
        for(User user: allUser){
            System.out.println(user);
        }
    }

    @Test
    public void testLogin() throws Exception {
        Map map = new HashMap();
        map.put("username","li");
        map.put("password","123456");
        User login = userService.login(map);
        System.out.println(login);
    }

    @Test
    public void testSelectUserByID() throws Exception {
        User user = userService.selectUserByID(4);
        System.out.println(user);

    }

    @Test
    public void testSelectUsers() throws Exception {
        List<User> username = userService.selectUsers("li");
        for(User user : username){
            System.out.println(user);
        }
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User();
        user.setUsername("li");
        user.setPassword("123456");
        user.setUserAge(28);
        user.setUserAddress("深圳");
        user.setBirthday(new Date());
        userService.updateUser(user);
    }

    @Test
    public void testGetDataByPage() throws Exception {
        //userService.getDataByPage();
    }

    @Test
    public void testGetDataCount() throws Exception {

    }

    @Test
    public void testAddUserList() throws Exception {

    }
}

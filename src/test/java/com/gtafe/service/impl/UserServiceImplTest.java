package com.gtafe.service.impl;

import com.gtafe.dao.IUserOperation;
import com.gtafe.model.User;
import com.gtafe.service.IUserService;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-17
 * Time: 下午1:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:webapp/WEB-INF/spring-mvc-servlet.xml","classpath:applicationContext.xml"})
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    IUserService userService;

    @Test
    public void testAddUser() throws Exception {
        User user = new User();
        user.setId(1);
        user.setUsername("li");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setUserAge(28);
        user.setUserAddress("深圳");
        userService.addUser(user);
    }

    @Test
    public void testDeleteUser() throws Exception {

    }

    @Test
    public void testFindAllUser() throws Exception {

    }

    @Test
    public void testLogin() throws Exception {

    }

    @Test
    public void testSelectUserByID() throws Exception {

    }

    @Test
    public void testSelectUsers() throws Exception {

    }

    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testGetDataByPage() throws Exception {

    }

    @Test
    public void testGetDataCount() throws Exception {

    }

    @Test
    public void testAddUserList() throws Exception {

    }
}

package com.gtafe.web.formbean;

import javax.validation.constraints.Size;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-21
 * Time: 下午3:00
 */
public class LoginForm {

    @Size(max=64)
    String username;
    String password;
    String checkcode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
}

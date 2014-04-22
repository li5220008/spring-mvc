package com.gtafe.web.formbean;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-21
 * Time: 下午3:00
 */
public class LoginForm {

    @Size(min = 4, max = 14)
    String username;
    @Email
    @Range(min =20, max = 30)
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

    public LoginForm() {
    }

    public LoginForm(String username, String password, String checkcode) {
        this.username = username;
        this.password = password;
        this.checkcode = checkcode;
    }
}

package com.gtafe.web.formbean;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Desc:
 * User: weiguili(li5220008@gmail.com)
 * Date: 14-4-22
 * Time: 下午6:12
 */
public class LoginFormTest {

    private static Validator validator;
    @Before
    public void setUp() throws Exception {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();

    }
    @Test
    public void formIsValid(){
        LoginForm form = new LoginForm( "k"," ","yy");

        Set<ConstraintViolation<LoginForm>> constraintViolations = validator.validate(form);
        System.out.println(constraintViolations.size());
        System.out.println(constraintViolations.iterator().next().getMessage());
        //assertEquals( 1, constraintViolations.size() );
        //assertEquals( "may not be null", constraintViolations.iterator().next().getMessage() );
    }

}

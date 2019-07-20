package com.xbog.mini.spring.test;

import com.xbog.mini.spring.beans.factory.BeanFactory;
import com.xbog.mini.spring.context.FileSystemXmlApplicationContext;

/**
 * Created by wenbo.shen on 2017/12/18.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new FileSystemXmlApplicationContext("minispringframework.xml");
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.hello();
    }

}

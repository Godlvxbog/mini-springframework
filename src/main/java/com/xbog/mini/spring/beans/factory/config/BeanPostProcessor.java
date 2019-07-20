package com.xbog.mini.spring.beans.factory.config;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName);

    Object postProcessAfterInitialization(Object bean, String beanName);

}

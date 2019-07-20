package com.xbog.mini.spring.support;

import com.xbog.mini.spring.beans.BeanDefinition;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

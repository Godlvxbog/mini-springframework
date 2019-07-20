package com.xbog.mini.spring.beans.factory;

import com.xbog.mini.spring.beans.BeanDefinition;
import com.xbog.mini.spring.exception.BeanDefinitionStoreException;
import com.xbog.mini.spring.support.BeanDefinitionRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry, ListableBeanFactory {

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        BeanDefinition oldBeanDefinition = beanDefinitionMap.get(beanName);

        if (oldBeanDefinition != null) {
            throw new BeanDefinitionStoreException(beanName + "is exist");
        }
        if (beanDefinitionMap.containsKey(beanName)) {
            beanDefinitionMap.remove(beanName);
        }
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    public List<Object> getBeansForType(Class<?> type) throws Exception {
        List beans = new ArrayList<Object>();
        for (Map.Entry<String, BeanDefinition> map : beanDefinitionMap.entrySet()) {
            if (type.isAssignableFrom((Class<BeanDefinition>) beanDefinitionMap.get(map.getKey()).getBeanClass())) {
                beans.add(getBean(map.getKey()));
            }
        }
        return beans;
    }
}

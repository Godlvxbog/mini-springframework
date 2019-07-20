package com.xbog.mini.spring.context;

import com.xbog.mini.spring.beans.factory.DefaultListableBeanFactory;
import com.xbog.mini.spring.exception.BeansException;
import com.xbog.mini.spring.support.XmlBeanDefinitionReader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public abstract class AbstractXmlApplicationContext extends AbstractApplicationContext {


    public AbstractXmlApplicationContext() {

    }

    public AbstractXmlApplicationContext(ApplicationContext parent) {
        super(parent);
    }

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException, IOException, ParserConfigurationException, SAXException, ClassNotFoundException {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(getConfigLocations());
    }
}



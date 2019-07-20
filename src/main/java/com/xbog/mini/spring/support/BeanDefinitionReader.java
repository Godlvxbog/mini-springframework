package com.xbog.mini.spring.support;

import com.xbog.mini.spring.beans.Io.Resource;
import com.xbog.mini.spring.beans.Io.ResourceLoader;
import com.xbog.mini.spring.exception.BeanDefinitionStoreException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(Resource resource) throws IOException, ParserConfigurationException, SAXException, ClassNotFoundException;

    void loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException, ParserConfigurationException, SAXException, IOException, ClassNotFoundException;

    ResourceLoader getResourceLoader();

}

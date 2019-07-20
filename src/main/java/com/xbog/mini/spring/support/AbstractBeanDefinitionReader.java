package com.xbog.mini.spring.support;

import com.xbog.mini.spring.beans.Io.DefaultResourceLoader;
import com.xbog.mini.spring.beans.Io.Resource;
import com.xbog.mini.spring.beans.Io.ResourceLoader;
import com.xbog.mini.spring.exception.BeanDefinitionStoreException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    protected final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;


    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this.registry = registry;
        this.resourceLoader = new DefaultResourceLoader();
    }

    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    public void loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException, ParserConfigurationException, SAXException, IOException, ClassNotFoundException {
        for (String location : locations) {
            ResourceLoader resourceLoader = getResourceLoader();
            Resource resource = resourceLoader.getResource(location);
            loadBeanDefinitions(resource);
        }
    }


}

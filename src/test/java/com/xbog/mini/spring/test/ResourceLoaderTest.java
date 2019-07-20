package com.xbog.mini.spring.test;

import com.xbog.mini.spring.beans.Io.DefaultResourceLoader;
import com.xbog.mini.spring.beans.Io.Resource;
import com.xbog.mini.spring.beans.Io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wenbo.shen on 2017/12/18.
 */
public class ResourceLoaderTest {
    public static void main(String[] args) throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("minispringframework.xml");
        InputStream inputStream = resource.getInputStream();
        System.out.println();
    }
}

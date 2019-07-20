package com.xbog.mini.spring.beans.factory;

import java.util.List;

/**
 * Created by wenbo.shen on 2017/12/17.
 */
public interface ListableBeanFactory extends BeanFactory {

    List<Object> getBeansForType(Class<?> type) throws Exception;

}

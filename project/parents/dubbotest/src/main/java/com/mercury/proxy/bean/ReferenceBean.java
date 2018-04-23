package com.mercury.proxy.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-11:05
 * @Description:
 * @return:
 */
public class ReferenceBean<T> extends ReferenceConfig<T> implements FactoryBean {
  @Nullable
  @Override
  public Object getObject() throws Exception {
    return getRefenrece();
  }

  @Nullable
  @Override
  public Class<?> getObjectType() {
    return getInterfaceClass();
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}

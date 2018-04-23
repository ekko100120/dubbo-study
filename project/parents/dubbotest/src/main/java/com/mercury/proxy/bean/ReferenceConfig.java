package com.mercury.proxy.bean;

import com.mercury.proxy.ProxyDemo;
import sun.misc.Cache;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:58
 * @Description:
 * @return:
 */
public class ReferenceConfig<T> {
  private Class<T> interfaceClass;
  private transient  volatile  T refenrece;
  public synchronized  T getRefenrece(){
    if (refenrece==null){
      init();
    }
    return refenrece;
  }

  private void init() {
     refenrece = new ProxyDemo(interfaceClass).getProxyObject();
  }

  public Class<T> getInterfaceClass() {
    return interfaceClass;
  }

  public void setInterfaceClass(Class<T> interfaceClass) {
    this.interfaceClass = interfaceClass;
  }
}

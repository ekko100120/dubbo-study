package com.mercury.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:04
 * @Description:
 * @return:
 */

public class ProxyFactory implements InvocationHandler {
    private  Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyTarge() {
    return Proxy.newProxyInstance(
        this.getClass().getClassLoader(),
        target.getClass().getInterfaces(),
        this
    );
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("Before++++++");
    System.out.println(method);
    System.out.println(proxy.getClass().getName());
    method.invoke(target,args);
    System.out.println("after++++++");
    return  null;
  }
}

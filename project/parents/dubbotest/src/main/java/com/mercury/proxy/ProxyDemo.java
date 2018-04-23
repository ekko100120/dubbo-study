package com.mercury.proxy;

import com.mercury.proxy.impl.MenuServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:25
 * @Description:
 * @return:
 */
public class ProxyDemo implements InvocationHandler {
  private Class interfaceClass;
  public ProxyDemo(Class interfaceClass) {
    this.interfaceClass = interfaceClass;
  }
  //返回代理对象,此处用泛型为了调用时不用强转,用Object需要强转
  public <T> T getProxyObject(){
    return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),//类加载器
        new Class[]{interfaceClass},//为哪些接口做代理(拦截哪些方法)
        this);//(把这些方法拦截到哪处理)
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println(method);
    System.out.println("进行编码");
    System.out.println("发送网络请求");
    System.out.println("将网络请求结果进行解码并返回");
    System.out.println("编码前");
    method.invoke(new MenuServiceImpl(),args);
    System.out.println("编码后+++++++");
    return null;
  }

}

package com.mercury.provider;

import com.alibaba.dubbo.rpc.Invoker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/19-11:26
 * @Description:
 * @return:
 */
public class Provider {

  public static void main(String[] args) throws IOException {

    System.setProperty("java.net.preferIPv4Stack", "true");
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
    context.start();
    System.in.read();
  }
}

package com.mercury.consumer;

import com.mercury.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/19-12:14
 * @Description:
 * @return:
 */
public class Consumer {

  public static void main(String[] args) {
    //Prevent to get IPV6 address,this way only work in debug mode
    //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
    System.setProperty("java.net.preferIPv4Stack", "true");
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
    context.start();
    DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

    while (true) {
      try {
        Thread.sleep(1000);
        String hello = demoService.sayHello("Kenny"); // call remote method
        System.out.println(hello); // get result

      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }


    }

  }
}

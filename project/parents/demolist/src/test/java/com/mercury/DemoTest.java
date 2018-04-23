package com.mercury;

import com.mercury.springevent.EmailEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-15:34
 * @Description:
 * @return:
 */
public class DemoTest {
  @Test
  public void test(){
    ApplicationContext context =
        new ClassPathXmlApplicationContext("classpath:application.xml");
    EmailEvent emailEvent = new EmailEvent("Hello","100@100.com","zzzzz");
    context.publishEvent(emailEvent);
  }
}

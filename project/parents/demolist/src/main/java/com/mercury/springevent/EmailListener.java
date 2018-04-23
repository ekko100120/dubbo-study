package com.mercury.springevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-15:11
 * @Description:
 * @return:
 */
public class EmailListener implements ApplicationListener {
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof EmailEvent){
      EmailEvent emailEvent = (EmailEvent) event;
      System.out.println("email 地址:"+emailEvent.getAddress());
      System.out.println("email 内容:"+ emailEvent.getText());
    }else {
      System.out.println("非Email");
    }
  }
}

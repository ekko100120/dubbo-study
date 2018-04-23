package com.mercury.springevent;

import com.sun.scenario.effect.impl.prism.PrImage;
import org.springframework.context.ApplicationEvent;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-15:08
 * @Description:
 * @return:
 */
public class EmailEvent extends ApplicationEvent {

  private  String address;
  private  String text;

  public EmailEvent(Object source, String address, String text) {
    super(source);
    this.address = address;
    this.text = text;
  }

  public EmailEvent(Object source) {
    super(source);
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}

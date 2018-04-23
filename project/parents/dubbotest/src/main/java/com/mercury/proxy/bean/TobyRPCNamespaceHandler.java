package com.mercury.proxy.bean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-11:30
 * @Description:
 * @return:
 */
public class TobyRPCNamespaceHandler extends NamespaceHandlerSupport {
  @Override
  public void init() {
    registerBeanDefinitionParser("reference",new TobyRPCBeanDefinitionParser());
  }
}

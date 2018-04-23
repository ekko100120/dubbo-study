package com.mercury.proxy.bean;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-11:08
 * @Description:
 * @return:
 */
public class TobyRPCBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

  @Override
  protected  Class getBeanClass(Element element){
    return ReferenceConfig.class;
  }

  @Override
  protected void doParse(Element element, BeanDefinitionBuilder bean){
    String interfaceClass =element.getAttribute("interface");
    if (StringUtils.hasText(interfaceClass)){
      bean.addPropertyValue("interfaceClass",interfaceClass);
    }
  }
}

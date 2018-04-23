package com.mercury.provider.service;

import com.mercury.api.DemoService;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/19-11:28
 * @Description:
 * @return:
 */
public class DemoServiceImpl  implements DemoService {
  @Override
  public String sayHello(String name) {
    return "Hello "+ name;
  }
}

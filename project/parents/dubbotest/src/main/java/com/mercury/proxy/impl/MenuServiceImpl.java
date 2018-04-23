package com.mercury.proxy.impl;

import com.mercury.proxy.MenuService;
import org.springframework.stereotype.Repository;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:03
 * @Description:
 * @return:
 */

public class MenuServiceImpl implements MenuService {
  @Override
  public void sayHello(String name) {
    System.out.println("Hello"+ name);
  }
}

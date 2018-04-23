package proxy;

import com.mercury.proxy.MenuService;
import com.mercury.proxy.ProxyDemo;
import org.junit.Test;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:28
 * @Description:
 * @return:
 */

public class ProxyDemoTest {
  @Test
  public void test(){
    ProxyDemo demo = new ProxyDemo(MenuService.class);
    MenuService service =demo.getProxyObject();
    service.sayHello(" demo!!!!!");

  }
}

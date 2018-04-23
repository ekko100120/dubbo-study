package proxy;

import com.mercury.proxy.MenuService;
import com.mercury.proxy.ProxyFactory;
import com.mercury.proxy.impl.MenuServiceImpl;
import org.junit.Test;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-10:15
 * @Description:
 * @return:
 */
public class ProxyTest {

  @Test
  public void test(){
    ProxyFactory factory = new ProxyFactory(new MenuServiceImpl());
    MenuService service = (MenuService) factory.getProxyTarge();
    service.sayHello("kenny");
  }
}

//package proxy;
//
//import com.mercury.proxy.MenuService;
//import com.mercury.proxy.ProxyDemo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * @param :
// * @author: kenny [411316753@qq.com]
// * @Date: 2018/4/20-12:18
// * @Description:
// * @return:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class BeanTest {
//
//  @Autowired
//  private MenuService menuService;
//  @Test
//  public void test() {
//    ProxyDemo proxyDemo = new ProxyDemo(MenuService.class);
//    MenuService menuService = proxyDemo.getProxyObject();
//    menuService.sayHello("kenny!!!!!!!!!!!");
//  }
//  @Test
//  public void test1() {
//    menuService.sayHello("demo!!!!!!!!!!!!1");
//  }
//
//}

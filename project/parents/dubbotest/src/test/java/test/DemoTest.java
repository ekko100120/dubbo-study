package test;

import org.junit.Test;

/**
 * @param :
 * @author: kenny [411316753@qq.com]
 * @Date: 2018/4/20-17:17
 * @Description:
 * @return:
 */
public class DemoTest {
  {
    System.out.println("init block");
  }

  public DemoTest() {
    System.out.println("constructor");
  }

  static {
    System.out.println("static block");
  }

  //运行后输出结果?
  @Test
  public void test() {
    {
      int a = 10;
      //10
      System.out.println("in block+++++++++++++++++++++++++++++++");
    }

    new DemoTest();
    new DemoTest();
    new DemoTest();
  }

}

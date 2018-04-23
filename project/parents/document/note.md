## dubbo 学习笔记

#### 1. dubbo-demo 

##### 遇到的问题：
* Caused by: java.lang.NoClassDefFoundError: org/apache/curator/RetryPolicy
* 解决方法：导入curator-frameworkjar包即可; [没搞懂，mac上没有半点问题,另外maven导入jar包时已经有了个包了，但是就是不行，不过版本有差异]

*  RMI(remote method Invocation) Stubs skeletons codec--编解码器[todo]

##### 核心接口:
* Invoker: 实体域, dubbo核心模型，其他接口转换成或者被他转换成[invoker.invoke()]
* Invocation: 会话域，调用过程中的变量,比如方法名和参数
* Result:会话域,调用过程中返回值和异常等
* Filter：过滤器接口;
* ProxyFactory: 代理工厂;
* Protocol: 服务域, 服务暴露和引用的主功能入口;
* Exporter： Invoker暴露服务在protocol上的对象
* InvokerListener： Invoker 监听器
* ExporterListener: Exporter 监听器

#### Dubbo SPI(Service Provider Interface) 机制
> SPI的全称是Service Provider Interface, SPI机制提供了一个表达`接口和其具体实现类之间的绑定关系`的方案;具体是在JAR包的"META-INF/services/"目录下建立一个文件，
文件名是接口的全限定名，文件的内容可以有多行，每行都是该接口对应的具体实现类的全限定名。

* maven 打包包含META-INF/services/包的方法：
```shell
//1.配置maven plugin [jar]
     <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.1.0</version>
        <configuration>
            <!--<archive>-->
                设置为false 取消自动生成的maven配置文件(里面默认生成META-INF文件夹无法配置)
            <!--</archive>-->
            <archive>
                <addMavenDescriptor>false</addMavenDescriptor>
            </archive>
        </configuration>
    </plugin>
    
 //2.在resources文件夹中新建/META-INF/resources/文件夹
 
```
**要点:**
* 文件夹目录META-INFO/services/
* 文件名: 接口的完全限定名,eg:com.mercury.HelloService
* 文件内容: 接口的实现的完全限定名： eg:com,mercury.impl.ServiceB
* 调用方法:
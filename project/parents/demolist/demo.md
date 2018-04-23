### demolist

##### spring事件

* class Event类继承ApplicationEvent;
* class Listen类实现ApplicationListener接口的onApplicationEvent方法;
* 配置spring的配置文件,申明 Event事件
* context.publishEvent()函数发布事件 Event
* spring 容器自动监听事件触发功能
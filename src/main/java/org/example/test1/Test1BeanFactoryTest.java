package org.example.test1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test1BeanFactoryTest {

    public static void main(String[] args) {
        // 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 创建读取器 xml 文件
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        // 读取配置文件给工厂
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");

        // 根据id获取实例，控制反转给第三方容器创建。同时验证了依赖注入
        UserService userService = (UserService) beanFactory.getBean("userService");
//        UserDao userDao = (UserDao) beanFactory.getBean("userDao");

        System.out.println(userService);
    }
}

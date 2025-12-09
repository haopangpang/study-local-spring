package org.example.test1;

public class UserServiceImpl implements UserService{

    // 该方法是BeanFactory去获取UserDao设置到 UserService中
    public void setUserDao(UserDao userDao) {
        System.out.println("here userService set userDao:" + userDao);
    }
}

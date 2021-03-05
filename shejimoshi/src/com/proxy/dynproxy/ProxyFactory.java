package com.proxy.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 赵星宇
 * @date 2017/12/27
 *
 * 动态代理对象
 * 动态代理不需要实现代理的接口，但是要指定接口的类型
 */
public class ProxyFactory {
    //维护一个目标对象（保存明星对象）
    private Object userDao;
    public ProxyFactory(Object obj){
        this.userDao = obj;
    }

    public Object getProxyIns(){
        return Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(userDao, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                });
    }
}

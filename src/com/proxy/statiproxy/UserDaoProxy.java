package com.proxy.statiproxy;

/**
 * @author 赵星宇
 * @date 2017/12/27
 */

/**
 * 代理类（经纪人）
 * 静态代理
 */
public class UserDaoProxy implements IUserDao{

    //接受保存代理对象
    private IUserDao iUserDao;
    public UserDaoProxy (IUserDao iUserDao){
        this.iUserDao = iUserDao;
    }

    @Override
    public void save() {
        System.out.println("-前-");
        iUserDao.save();//执行目标对象的方法
        System.out.println("-后-");
    }
}

package com.proxy.statiproxy;

/**
 * @author 赵星宇
 * @date 2017/12/27
 *
 * 目标类（明星）
 */
public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("-----已经保存----");
    }
}

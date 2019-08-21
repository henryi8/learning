package com.proxy.dynproxy;

/**
 * @author 赵星宇
 * @date 2017/12/27
 *
 * 被代理者（明星）
 */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("--这是保存；明星的--");
    }
}

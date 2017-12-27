package spring.aop;

/**
 * @author 赵星宇
 * @date 2017/12/27
 */

/**
 * 目标方法
 */
public class Hello implements IHello{

    @Override
    public void sayHello(String str) {
        System.out.println("Hello" + str);
    }
}

package spring.aop;

/**
 * @author 赵星宇
 * @date 2017/12/27
 * 代理类
 * 我们给它添加日志记录功能，在方法开始前后执行特定的方法，是不是和AOP特别像呢？
 */
public class HelloProxy implements IHello{

    private Hello hello;
    public HelloProxy(Hello hello){
        this.hello = hello;
    }

    @Override
    public void sayHello(String str) {
        Logger.start(); //特定的方法
        hello.sayHello(str);
        Logger.end();
    }
}

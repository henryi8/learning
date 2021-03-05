package spring.aop;

/**
 * @author 赵星宇
 * @date 2017/12/27
 * http://www.jb51.net/article/81788.htm 深入浅析Spring 的aop实现原理
 * 这样我们就实现了一个最简单的AOP，但是这样会存在一个问题：如果我们像Hello这样的类很多，那么，我们是不是要去写很多个HelloProxy这样的类呢。
 * 其实也是一种很麻烦的事。在jdk1.3以后，jdk跟我们提供了一个API java.lang.reflect.InvocationHandler的类， 这个类可以让我们在JVM调用某个类的方法时动态的为些方法做些什么事。
 */
public class App {

    public static void main(String[] args) {
        HelloProxy hello = new HelloProxy(new Hello());//如果我们需要日志功能，则使用代理类
        //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
        hello.sayHello("java");

    }
}

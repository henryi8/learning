package java8.lambda;

import org.junit.Test;

import java.util.function.Consumer;

public class LambdaTest {

    /**
     * 语法格式一： 无参数，无返回值
     * ()-> System.out.println("Hello lambda!");
     */
    @Test
    public void test(){
        int num = 1;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("hello world!" + num);
            }
        };
        runnable.run();

        Runnable runnable1 = ()-> System.out.println("Hello lambda!"+num);
        runnable1.run();
    }


    /**
     * 语法格式二 ：有一个参数，并且无返回值
     *  (x)-> System.out.println(x);
     *
     *  （如果只有一个参数，小括号可以不用写）
     *  x -> System.out.println(x);
     */
    @Test
    public void test1() {
        Consumer<String> consumer = (x)-> System.out.println(x);
        consumer.accept("ad");
    }

    /**
     * 语法格式四：有两个以上的参数，并且lambda体中有多条语句
     *
     */
    @Test
    public void test2(){

    }


}

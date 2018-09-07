package java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * lambda表达式测试
 */
public class TestLambda {

    /**
     * 获得一个list集合
     */
    private static List<User> getLoopList() {
        List<User> all = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            all.add(new User("lxk_" + i, "pwd_" + i));
        }
        return all;
    }

    /**
     * 获得一个map集合
     */
    private static Map<String, Integer> getLoopMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key"+String.valueOf(i), i);
        }
        return map;
    }

    /**
     * 打印分行符公共方法
     */
    private static void println() {
        System.out.println("___________________我是分行符___________________");
    }


    /**
     * list 遍历
     */
    @Test
    public void test(){
        List<User> list = getLoopList();
        System.out.println();
//        list.forEach(p-> System.out.println(p));
        final List<String> collect = list.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(collect.toString());
    }

    @Test
    public void tset() {
        Map<String, Integer> loopMap = getLoopMap();
        System.out.println("keyset:::"+loopMap.keySet());
        System.out.println("values:::"+loopMap.values());
        System.out.println("entry:::"+loopMap.entrySet());
        for (Map.Entry<String, Integer> entry : loopMap.entrySet()) {
            System.out.println(entry);
        }

        loopMap.forEach((k,v)-> System.out.println("key:"+k+" ;value:"+v));
    }

    interface LambdaTest11{

//        void tirma(String url);

        int test(int i,int y);

    }

    /**
     *
     */
    @Test
    public void test1(){
        LambdaTest11 test11 = new LambdaTest11() {
//            @Override
//            public void tirma(String url) {
//                System.out.println(url);
//            }

            @Override
            public int test(int i, int y) {
                return i+y;
            }
        };

//        String rl = "ahdisad";
//        test11.tirma(rl);

        System.out.println("------------------");

        LambdaTest11 test111 = (e,b)-> e*b;
        final int test = test111.test(2, 3);
        System.out.println(test);

    }


}

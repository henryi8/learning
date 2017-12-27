package spring.aop;

import java.util.Date;

/**
 * @author 赵星宇
 * @date 2017/12/27
 *
 * 日志类
 */
public class Logger {

    public static void start(){
        System.out.println(new Date()+ " say hello start...");
    }
    public static void end(){
        System.out.println(new Date()+ " say hello end");
    }
}

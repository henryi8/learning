package com.github.zhaoxny.test.DesignPattern.SingletonPattern;

import com.github.zhaoxny.SingletonPattern.HungrySingleton.Hungry;
import com.github.zhaoxny.SingletonPattern.SeriableHungry;

import java.io.*;

/**
 * 2 序列化破坏最屌单例
 * @author henry
 * @date 2021/5/30 10:42
 *
 * 解决办法：在单例中重写 readResolve方法。
 */
public class SeriableTest {

    public static void main(String[] args) {

        SeriableHungry h1 = null;
        SeriableHungry h2 = SeriableHungry.getInstance();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("hungrySingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(h2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("hungrySingleton.obj");
            ObjectInputStream ooi = new ObjectInputStream(fis);
            h1 = (SeriableHungry) ooi.readObject();
            ooi.close();

            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h1 == h2);

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}

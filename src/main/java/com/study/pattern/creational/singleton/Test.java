package com.study.pattern.creational.singleton;

import java.io.*;

/**
 * @author 潘根山
 * @create 2018-10-11 21:52
 * @since 1.0.0
 */
public class Test {
    //    public static void main(String[] args) {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("Program end");
//    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String file = "singleton_file";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(file)));
        HungrySingleton instance = HungrySingleton.getInstance();
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(file)));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
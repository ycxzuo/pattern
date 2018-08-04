package com.yczuoxin.pattern.singleton.test;

import com.yczuoxin.pattern.singleton.serialize.Serialize;

import java.io.*;

/**
 * @program: pattern
 * @description: 序列化的测试用例
 * @author: yczuoxin
 * @create: 2018-08-04 16:11
 **/
public class SerializableTest {
    public static void main(String[] args) {
        Serialize serialize = Serialize.getInstance();
        System.out.println(serialize);
        writeFile("D://serialize.txt", serialize);
        Serialize serialized = (Serialize)readFile("D://serialize.txt");
        System.out.println(serialized);
    }

    private static void writeFile(String path, Object object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Object readFile(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object object = null;
        try{
            fis = new FileInputStream(new File(path));
            ois = new ObjectInputStream(fis);
            object = ois.readObject();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (null != ois){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }
}

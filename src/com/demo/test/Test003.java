package com.demo.test;/**
 * @ClassName Test003.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年04月08日 15:39:00
 */

import com.demo.test.entity.UserTest003;

import java.beans.Transient;
import java.io.*;

/**
 * @author hg
 * @date 2022年04月08日 15:39
 */
public class Test003 {

    public static void main(String[] args) {

        UserTest003 userTest003 = new UserTest003();
        userTest003.setUserName("张三");
        userTest003.setPassWord("123456");

        System.out.println("read before Serializable");
        System.out.println("userName:"+userTest003.getUserName());
        System.out.println("password:"+userTest003.getPassWord());

        try {
            ObjectOutputStream  out = new ObjectOutputStream(new FileOutputStream("D:/user.txt"));
            out.writeObject(userTest003);//将User对象写进文件
            out.flush();
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/user.txt"));
            UserTest003 userTest004 = (UserTest003) in.readObject();//从流中读取User的数据
            in.close();
            System.out.println("\n read after Serializable");
            System.out.println("userName:"+userTest004.getUserName());
            System.out.println("passWord:"+userTest004.getPassWord());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}

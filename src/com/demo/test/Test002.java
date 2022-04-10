package com.demo.test;/**
 * @ClassName Test002.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年04月08日 13:52:00
 */

/**
 * @author hg
 * @date 2022年04月08日 13:52
 */
public class Test002 {

    public static void main(String[] args) {

        /*int i = 0;
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Object);
        */

        TestClass testClass = new TestClass();
        System.out.println(testClass instanceof TestClass);



    }

    static class TestClass{


    }

    static  class TestClass2{

    }

}



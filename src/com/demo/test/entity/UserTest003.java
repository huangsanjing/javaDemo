package com.demo.test.entity;/**
 * @ClassName UserTest003.java
 * @author admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年04月08日 15:42:00
 */

import java.beans.Transient;
import java.io.Serializable;

/**
 * @author hg
 * @date 2022年04月08日 15:42
 */
public class UserTest003 implements Serializable {

    private String userName;
    private transient String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

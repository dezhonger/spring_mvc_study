package com.dezhonger.object;

/**
 * Created by Administrator on 2016/7/28.
 */
public class User {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString(){
        return this.userName +","+this.userId;
    }
}

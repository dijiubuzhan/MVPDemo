package com.test.myapplication.biz;

/**
 * Created by wilsen on 2017/1/23.
 */
public interface IUserBiz {
    void login(String username,String password,OnLoginListener loginListener);
}

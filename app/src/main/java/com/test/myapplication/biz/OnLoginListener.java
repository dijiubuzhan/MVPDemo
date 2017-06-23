package com.test.myapplication.biz;

import com.test.myapplication.bean.User;

/**
 * Created by wilsen on 2017/1/23.
 */
public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}

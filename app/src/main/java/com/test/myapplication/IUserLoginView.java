package com.test.myapplication;

import com.test.myapplication.bean.User;

/**
 * Created by wilsen on 2017/1/23.
 */
public interface IUserLoginView {
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}

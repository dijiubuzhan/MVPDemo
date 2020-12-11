package com.test.myapplication.biz;

import androidx.databinding.ObservableField;

import com.test.myapplication.bean.User;

/**
 * Created by wilsen on 2017/1/23.
 */
public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (("wilsen".equals(username) && "123".equals(password))) {
                    User user=new User();
                    user.setUsername(new ObservableField<String>(username));
                    user.setPassword(new ObservableField<String>(password));
                    loginListener.loginSuccess(user);
                }else {
                    loginListener.loginFailed();
                }

            }
        }.start();
    }
}

package com.test.myapplication.presenter;

import android.os.Handler;

import com.test.myapplication.IUserLoginView;
import com.test.myapplication.bean.User;
import com.test.myapplication.biz.IUserBiz;
import com.test.myapplication.biz.OnLoginListener;
import com.test.myapplication.biz.UserBiz;

/**
 * Created by wilsen on 2017/1/23.
 */
public class UserLoginPresenter {
    private IUserBiz m_userBiz;
    private IUserLoginView m_userLoginView;
    private Handler m_handler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.m_userLoginView = userLoginView;
        this.m_userBiz = new UserBiz();
    }

    public void login() {
        m_userLoginView.showLoading();
        m_userBiz.login(m_userLoginView.getUserName(), m_userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                m_handler.post(new Runnable() {
                    @Override
                    public void run() {
                        m_userLoginView.toMainActivity(user);
                        m_userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                m_handler.post(new Runnable() {
                    @Override
                    public void run() {
                        m_userLoginView.showFailedError();
                        m_userLoginView.hideLoading();
                    }
                });
            }
        });
    }

    public void clear(){
        m_userLoginView.clearPassword();
        m_userLoginView.clearUserName();
    }
}

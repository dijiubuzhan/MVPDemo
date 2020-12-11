package com.test.myapplication.bean;

import android.view.View;

import androidx.databinding.ObservableField;

import com.test.myapplication.LogUtil;

/**
 * Created by wilsen on 2017/1/23.
 */
public class User {
    private ObservableField<String> username;
    private ObservableField<String> password;


    public ObservableField<String> getUsername() {
        return username;
    }

    public void setUsername(ObservableField<String> username) {
        this.username = username;
    }

    public ObservableField<String> getPassword() {
        return password;
    }

    public void setPassword(ObservableField<String> password) {
        this.password = password;
    }

    public View.OnClickListener loginClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LogUtil.d("name="+username.get()+",pwd="+password.get());
        }
    };
}

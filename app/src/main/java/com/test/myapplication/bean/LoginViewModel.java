package com.test.myapplication.bean;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.test.myapplication.LogUtil;
import com.test.myapplication.databinding.ActivityMvvmBinding;

/**
 * Author by wuyishan, Date on 2020/12/10.
 */
public class LoginViewModel {
    public volatile User user;

    public LoginViewModel(ActivityMvvmBinding binding) {
        binding.setLoginModel(this);
        user = new User();
        user.setUsername("Sunzxyong");
        user.setPassword("12345678");
        //SystemClock.sleep(2000);

       // user.setUsername("11");
    }

    public TextWatcher nameWatcher=new TextWatcher(){

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            LogUtil.d("nameWatcher,s="+s.toString());
            user.setUsername(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public TextWatcher pwdWatcher=new TextWatcher(){

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            LogUtil.d("pwdWatcher,s="+s.toString());
            user.setPassword(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public View.OnClickListener loginClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LogUtil.d("name="+user.getUsername()+",pwd="+user.getPassword());
        }
    };
}

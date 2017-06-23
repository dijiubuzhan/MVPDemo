package com.test.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.test.myapplication.bean.User;
import com.test.myapplication.databinding.ActivityMvvmBinding;


public class MvvmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        ActivityMvvmBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_mvvm);
        User user = new User();
        user.setUsername("Sunzxyong");
        user.setPassword("12345678");
        binding.setUser(user);

    }
}

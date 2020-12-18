package com.test.myapplication;


import android.os.Bundle;


import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;

import com.test.myapplication.bean.User;
import com.test.myapplication.databinding.ActivityMvvmBinding;


public class MvvmActivity extends AppCompatActivity {
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_mvvm);
        user=new User();
        user.setUsername(new ObservableField<String>("wilson"));
        user.setPassword(new ObservableField<String>("123"));
        binding.setUser(user);
        binding.setListener(new Listener());
    }

    public class Listener {
        public void login(){
            LogUtil.d("name="+user.getPassword().get()+",pwd="+user.getUsername());
        }
    }

}

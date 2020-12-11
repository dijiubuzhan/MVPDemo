package com.test.myapplication;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButtferKnifeActivity extends AppCompatActivity {


    @BindView(R.id.txt1)
    TextView m_Txt1;
    @BindView(R.id.txt2)
    TextView m_Txt2;
    @BindView(R.id.btn1)
    Button m_Btn1;
    @BindView(R.id.btn2)
    Button m_Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

}

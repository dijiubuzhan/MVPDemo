package com.test.myapplication;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ButtferKnifeActivity extends AppCompatActivity {


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
        m_Btn1=findViewById(R.id.btn1);
        m_Btn2=findViewById(R.id.btn2);
        m_Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.container,MainFragment.newInstance())
                                    .commit();
            }
        });
        m_Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container,SecondFragment.newInstance(null,null))
                        .commit();
            }
        });
    }



}

package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button 토스트버튼;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        토스트버튼 = findViewById(R.id.button); //버튼 개체 찾기

        토스트버튼.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBtnClicked();
            }
        });



    }

    public void onBtnClicked(){
        //토스트를 인플레이트함
        LayoutInflater 인플레이터 = getLayoutInflater();

        View 레이아웃 = 인플레이터.inflate(
                R.layout.toastborder,
                (ViewGroup) findViewById(R.id.toast_layout_root)
        );

        TextView text = 레이아웃.findViewById(R.id.text);
        Toast toast = new Toast(this);
        text.setText("모양 바꾼 토스트");
        toast.setView(레이아웃);
        toast.show();

    }
}
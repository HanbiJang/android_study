package com.makeus.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리사이클러뷰1
        RecyclerView rv_test = findViewById(R.id.rv_test);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        rv_test.setLayoutManager(layoutManager);

/*
        PersonAdapter personAdapter = new PersonAdapter();
        //이미지
        Drawable img1 = getResources().getDrawable(R.drawable.ic_launcher_foreground);
        Drawable img2 = getResources().getDrawable(R.drawable.ic_launcher_background);

        personAdapter.addItem(new Person("양치하기","02/01/2021", "키점드", img1 ));
        personAdapter.addItem(new Person("숙제하기","02/10/2021","철수", img2));
        personAdapter.addItem(new Person("밥먹기","02/17/2021","영희", img1));
*/

        PersonAdapter_moreView personAdapter_moreView = new PersonAdapter_moreView();

        //이미지
        Drawable img1 = getResources().getDrawable(R.drawable.ic_launcher_foreground);

        personAdapter_moreView.addItem(new Person("키점드님이 입장하셨습니다","02/01/2021", "키점드", img1, ViewTypeCode.VIEW_CENTER));
        personAdapter_moreView.addItem(new Person("안녕하세요","02/01/2021", "키점드", img1, ViewTypeCode.VIEW_OTHER_CHAT_START));
        personAdapter_moreView.addItem(new Person("반갑습니다","02/01/2021", "나", img1, ViewTypeCode.VIEW_MY_CHAT_START));
        personAdapter_moreView.addItem(new Person("저도 반갑습니다","02/01/2021", "키점드", img1, ViewTypeCode.VIEW_OTHER_CHAT_START));
        personAdapter_moreView.addItem(new Person("지금 뭐하세요?","02/01/2021", "키점드", img1, ViewTypeCode.VIEW_OTHER_CHAT));
        personAdapter_moreView.addItem(new Person("코딩 공부 중입니다","02/01/2021", "나", img1, ViewTypeCode.VIEW_MY_CHAT_START));
        personAdapter_moreView.addItem(new Person("재밌네요","02/01/2021", "나", img1, ViewTypeCode.VIEW_MY_CHAT));

        rv_test.setAdapter(personAdapter_moreView); //리사이클러뷰에 어답터 설정
    }
}
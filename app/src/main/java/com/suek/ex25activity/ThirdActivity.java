package com.suek.ex25activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Third Activity");

        // 제목줄 제목 왼쪽에 '뒤로가기 화살표' 아이콘 =upkey (돌아갈 곳이 있는..)
        // 이 아이콘을 눌렀을대 돌아갈 액티비티(화면)를 Manifest.xml 에서 지정
        actionBar.setDisplayHomeAsUpEnabled(true);   //홈아이콘이 있는 자리


    }
}

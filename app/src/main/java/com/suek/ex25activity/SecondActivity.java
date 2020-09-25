package com.suek.ex25activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    // 2) MainActivity 처럼 자동으로 처음 발동되는 onCreate() 만들기
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 이 액티비티가 보여줄 뷰들을 설정하는 메소드 호출
        setContentView(R.layout.activity_second);

        // 제목줄(ActionBar) 관리객체 얻어오기
        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Second Activity");      //제목변경
    }
}

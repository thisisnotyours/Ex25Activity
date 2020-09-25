package com.suek.ex25activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//onCreate



    // 1) 버튼을 누르면 발동되는 -> Activity 를 상속받은 SecondActivity 만들기
    public void clickBtn(View view) {
        //SecondActivity 실행시켜주는 택배기사같은객체(Intent)를 생성하여 요청
        Intent intent= new Intent(this, SecondActivity.class);    // this =나(운영체제의 능력이 있는)
        startActivity(intent);

        // 만약 현재 MainActivity 를 세컨드를 실행시키면서 종료시키고 싶다면
        finish();



    }//clickBtn


    // 3)
    public void clickBtn2(View view) {
        Intent intent= new Intent(this, ThirdActivity.class);
        startActivity(intent);


    }



}//MainActivity

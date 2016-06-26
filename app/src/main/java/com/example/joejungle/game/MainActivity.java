package com.example.joejungle.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joejungle.game.R;
import com.example.joejungle.game.ViewController.newCharacter.SelectCharacter;

public class MainActivity extends AppCompatActivity {

    @Override
    //onCreate建立畫面
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //顯示哪一個畫面
        setContentView(R.layout.activity_main);
    }

    protected void GameStartClick (View view){
        //this 表示這一頁，表示從main跳到哪一個頁面
        Intent intent=new Intent(this, SelectCharacter.class);
        //開啟下一個activity
        startActivity(intent);
    }
    //結束動作
    protected void ExitClick (View view){
        finish();
    }
}

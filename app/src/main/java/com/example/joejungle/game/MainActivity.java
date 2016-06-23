package com.example.joejungle.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joejungle.game.R;
import com.example.joejungle.game.ViewController.newCharacter.SelectCharacter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void GameStartClick (View view){
        Intent intent=new Intent(this, SelectCharacter.class);
        startActivity(intent);
    }

    protected void ExitClick (View view){
        finish();
    }
}

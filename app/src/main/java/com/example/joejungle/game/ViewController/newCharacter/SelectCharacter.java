package com.example.joejungle.game.ViewController.newCharacter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.joejungle.game.GameContent.Role.Kronos;
import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.Role.Uranus;
import com.example.joejungle.game.R;
import com.example.joejungle.game.ViewController.battle.Battle;

public class SelectCharacter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_character);


    }

    protected void KronosSelect(View view){
        Role role=new Kronos();
        Intent intent =new Intent(this,Battle.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("role",role);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    protected void UranusSelect(View view ){
        Role role=new Uranus();
        Intent intent =new Intent(this,Battle.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("role",role);
        intent.putExtras(bundle);
        startActivity(intent);
     }
}

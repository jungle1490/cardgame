package com.example.joejungle.game.ViewController.battle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.joejungle.game.GameContent.card.BattleCard;
import com.example.joejungle.game.GameContent.card.Card;
import com.example.joejungle.game.GameContent.card.F_Adamantine_Sickle;
import com.example.joejungle.game.GameContent.card.F_SkyFall;
import com.example.joejungle.game.GameContent.card.FunctionCard;
import com.example.joejungle.game.R;

public class Battle extends AppCompatActivity {
    private Card[] carddeck_user,carddeck_com;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);



        carddeck_user = getrandombcard();
        carddeck_com = getrandombcard();


    }

    //發牌組的methods
    public Card[] getrandombcard(){
        Card[] list = new Card[5];
        for(int i =0; i<4; i++){
            int n = (int)Math.random()*10+1;
            list[i] = new BattleCard(n);
        }
        int n = (int)Math.random()*2+1;
        if(n==1){
            list[4] = new F_Adamantine_Sickle();
        }
        else {
            list[4] = new F_SkyFall();
        }
        return list;
    }

    public void setAttackButton(){

    }



}

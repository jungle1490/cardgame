package com.example.joejungle.game.ViewController.battle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.joejungle.game.GameContent.card.BattleCard;
import com.example.joejungle.game.GameContent.card.Card;
import com.example.joejungle.game.GameContent.card.F_Adamantine_Sickle;
import com.example.joejungle.game.GameContent.card.F_SkyFall;
import com.example.joejungle.game.R;

public class Battle extends AppCompatActivity {
    public Card[] carddeck_user,carddeck_com;
    private FrameLayout layoutusercard1,layoutusercard2,layoutusercard3,layoutusercard4,layoutusercard5;
    private CharacterStatusFragment cardstatusfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        layoutusercard1 = (FrameLayout)findViewById(R.id.ucard1);
        //layoutusercard2 = (FrameLayout)findViewById(R.id.ucard2);
        //layoutusercard3 = (FrameLayout)findViewById(R.id.ucard3);
        //layoutusercard4 = (FrameLayout)findViewById(R.id.ucard4);
        //layoutusercard5 = (FrameLayout)findViewById(R.id.ucard5);

        FragmentManager fManager = getSupportFragmentManager();
        FragmentTransaction ftrans = fManager.beginTransaction();

        carddeck_user = getrandombcard();
        carddeck_com = getrandombcard();
        cardstatusfragment = CharacterStatusFragment.newInstance(carddeck_user[0]);
        ftrans.replace(R.id.ucard1, cardstatusfragment);
        ftrans.commit();



    }

    //發牌組的methods
    public Card[] getrandombcard(){
        Card[] list = new Card[5];
        for(int i =0; i<4; i++){
            int n = (int)(Math.random()*11)+1;
            list[i] = new BattleCard(n);
        }
        int n = (int)(Math.random()*2)+1;
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

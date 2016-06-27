package com.example.joejungle.game.ViewController.battle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.card.BattleCard;
import com.example.joejungle.game.GameContent.card.Card;
import com.example.joejungle.game.GameContent.card.F_Adamantine_Sickle;
import com.example.joejungle.game.GameContent.card.F_SkyFall;
import com.example.joejungle.game.R;



public class Battle extends AppCompatActivity {
    public Card[] carddeck_user,carddeck_com;
    private FrameLayout layoutusercard1,layoutusercard2,layoutusercard3,layoutusercard4,layoutusercard5,layoutrole;

    private Role role,mob;
    private RoleStatusFragment roleStatusFragment;


    private CharacterStatusFragment cardstatusfragment1,cardstatusfragment2,cardstatusfragment3,cardstatusfragment4,cardstatusfragment5;
    private Button btAttack;
    private TextView txview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        layoutusercard1 = (FrameLayout)findViewById(R.id.ucard1);
        layoutusercard2 = (FrameLayout)findViewById(R.id.ucard2);
        layoutusercard3 = (FrameLayout)findViewById(R.id.ucard3);
        layoutusercard4 = (FrameLayout)findViewById(R.id.ucard4);
        layoutusercard5 = (FrameLayout)findViewById(R.id.ucard5);

        layoutrole=(FrameLayout) findViewById(R.id.layoutrole);
        role=(Role)getIntent().getExtras().getSerializable("role");


        FragmentManager fManager = getSupportFragmentManager();
        FragmentTransaction ftrans = fManager.beginTransaction();

        carddeck_user = getrandombcard();
        carddeck_com = getrandombcard();
        cardstatusfragment1 = CharacterStatusFragment.newInstance(carddeck_user[0]);
        ftrans.replace(R.id.ucard1, cardstatusfragment1);
        cardstatusfragment2 = CharacterStatusFragment.newInstance(carddeck_user[1]);
        ftrans.replace(R.id.ucard2, cardstatusfragment2);
        cardstatusfragment3 = CharacterStatusFragment.newInstance(carddeck_user[2]);
        ftrans.replace(R.id.ucard3, cardstatusfragment3);
        cardstatusfragment4 = CharacterStatusFragment.newInstance(carddeck_user[3]);
        ftrans.replace(R.id.ucard4, cardstatusfragment4);
        cardstatusfragment5 = CharacterStatusFragment.newInstance(carddeck_user[4]);
        ftrans.replace(R.id.ucard5, cardstatusfragment5);
        ftrans.commit();


        ftrans = fManager.beginTransaction();
        roleStatusFragment =RoleStatusFragment.newInstance(role);
        ftrans.replace(R.id.layoutrole, roleStatusFragment);
        ftrans.commit();


    }

    //發牌組的methods
    public Card[] getrandombcard(){
        Card[] list = new Card[5];
        for(int i =0; i<4; i++){
            int n = (int)((Math.random()*11)+1);
            list[i] = new BattleCard(n);
        }
        int n = (int)(Math.random()*2);
        if(n==1){
            list[4] = new F_Adamantine_Sickle();
        }
        else {
            list[4] = new F_SkyFall();
        }
        return list;
    }

    public void selectcardAttack(View view){
        Card card = new Card();
        int i=0;
        Card comcard = carddeck_com[i];
        if(card instanceof BattleCard){
            int imageId = card.getImage();
            String text = ((BattleCard) card).AttackCard((BattleCard) comcard);
            if(((BattleCard) comcard).getHP()==0){
                comcard = carddeck_com[i++];
            }
            if(((BattleCard) card).getHP()==0){
                //這張卡的fragment消失

            }
        }

        else if (card instanceof F_Adamantine_Sickle){
            int imageId = card.getImage();
            String text = ((F_Adamantine_Sickle) card).Skill((BattleCard) comcard);
            if(((BattleCard) comcard).getHP()==0){
                comcard = carddeck_com[i++];
            }
            //這張卡的fragment 消失
        }

        //如果其中一方失去所有的血量，遊戲結束。
        if(mob.getHP()==0 || role.getHP()==0)
            finish();


        }

    public void setAttackButton(){

    }




}

package com.example.joejungle.game.GameContent.Role;


import com.example.joejungle.game.GameContent.action.Talk;
import com.example.joejungle.game.GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/16.
 */
public class Kronos extends Role  {

    Kronos(){

        this.name="Kronos";
    }

    Kronos(String name,int image){
        this.name = name;
        this.image = image;
        this.HP = 50;
    }

    @Override
    public String Talk1(){
        return"噗噗噗噗噗噗";
    }
    @Override
    public String Talk2(){
        return"我喜歡唱歌，你喜歡嗎";
    }
    @Override
    public String Talk3(){
        return"你要死了";
    }
}

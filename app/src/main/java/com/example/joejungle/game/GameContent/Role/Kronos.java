package com.example.joejungle.game.GameContent.Role;


import com.example.joejungle.game.GameContent.action.Talk;
import com.example.joejungle.game.GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/16.
 */
public class Kronos extends Role  {

    public Kronos(){
        this.name="Kronos";
        this.image=this.getImageList().get(0);
    }



    @Override
    //this skill belongs to Kronos
    //it attacks cards, depending on how many card will there be on the screen.
    public String Skill(BattleCard target) {
        //damage remains constant
        int damage = 5;
        //attack details
        target.setHP(target.value_left(target.getHP(),damage));
        String text = this.getName()+"cause"+damage+"damage to "+target.getName();
        return text;
    }

    public String Skill(BattleCard target1, BattleCard target2) {
        int damage = 3;
        target1.setHP(target1.value_left(target1.getHP(),damage));
        target2.setHP(target2.value_left(target2.getHP(),damage));
        String text = this.getName()+"cause"+damage+"damage to "+target1.getName()+"and "+target2.getName()+"independently.";
        return text;
    }

    public String Skill(BattleCard target1, BattleCard target2, BattleCard target3) {
        int damage = 2;
        target1.setHP(target1.value_left(target1.getHP(),damage));
        target2.setHP(target2.value_left(target2.getHP(),damage));
        target3.setHP(target3.value_left(target3.getHP(),damage));
        String text = this.getName()+"cause"+damage+"damage to "+target1.getName()+" ,"+target2.getName()+" and "+target3.getName()+"independently.";
        return text;
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

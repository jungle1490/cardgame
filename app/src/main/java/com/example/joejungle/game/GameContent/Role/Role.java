package com.example.joejungle.game.GameContent.Role;

import com.example.joejungle.game.GameContent.action.Skill_interface;
import com.example.joejungle.game.GameContent.action.Talk;
import com.example.joejungle.game.GameContent.card.BattleCard;


/**
 * Created by joejungle on 2016/6/16.
 */
public class Role implements Skill_interface, Talk  {

    //Basic information of the role
    protected String name;
    protected int image;
    protected int HP;

    public Role(){

        this.HP=50;
    };

    //user can set names and image but the HP
    public Role(String name,int image){
        this.name=name;
        this.image=image;
        this.HP=50;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
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
    //this skill belongs to Uranus
    public String Skill(Role target) {
        int damage = 13;
        target.setHP(target.getHP()-damage);
        String text ="";
        //if enemy gets 0 hp in the end, game will be over
        if(target.getHP()>0){
            text = this.getName()+"cause"+damage+"damage to "+target.getName();
        }
        else{
            text = "You die!";
        }

        return text;
    }

    @Override
    public String Talk1() {
        return null;
    }

    @Override
    public String Talk2() {
        return null;
    }

    @Override
    public String Talk3() {
        return null;
    }
}

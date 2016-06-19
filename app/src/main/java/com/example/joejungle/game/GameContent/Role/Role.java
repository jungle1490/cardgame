package com.example.joejungle.game.GameContent.Role;

import com.example.joejungle.game.GameContent.action.Skill_interface;
import com.example.joejungle.game.GameContent.action.Talk;
import com.example.joejungle.game.GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/16.
 */
public class Role implements Skill_interface, Talk{

    protected String name;
    protected int image;
    protected int HP;

    public Role(){

        this.HP=50;
    };

    public Role(String name,int image){
        this.name=name;
        this.image=image;
        this.HP=50;
    };

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getHP() {
        return HP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


    @Override
    public String Skill(BattleCard target) {
        return null;
    }

    @Override
    public String Skill(Role target) {
        return null;
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

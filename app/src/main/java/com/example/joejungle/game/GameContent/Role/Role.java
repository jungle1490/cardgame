package com.example.joejungle.game.GameContent.Role;

import com.example.joejungle.game.GameContent.action.Skill_interface;
import com.example.joejungle.game.GameContent.action.Talk;
import com.example.joejungle.game.GameContent.card.BattleCard;
import com.example.joejungle.game.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by joejungle on 2016/6/16.
 */
public class Role implements Skill_interface, Talk, Serializable {

    //Basic information of the role
    protected String name;
    protected int image;
    protected int HP;

    public Role(){
        this.HP=50;};

    private List<Integer> imageList;

    protected List<Integer> getImageList(){
        imageList=new ArrayList<>();
        imageList.add(R.drawable.kronus);
        imageList.add(R.drawable.uranus);
        return imageList;
    }

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

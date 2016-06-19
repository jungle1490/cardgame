package com.example.joejungle.game.GameContent.card;


import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.action.Skill_interface;

/**
 * Created by joejungle on 2016/6/16.
 */
//postpone
public class FunctionCard extends Card implements Skill_interface {

    FunctionCard(){}

    @Override
    public String Skill(BattleCard target) {
        return null;
    }

    @Override
    public String Skill(Role target) {
        return null;
    }
}

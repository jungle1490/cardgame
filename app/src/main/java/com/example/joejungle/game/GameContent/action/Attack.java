package com.example.joejungle.game.GameContent.action;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/18.
 */
public interface Attack{
     //Allowing Card to attack another Card
     String  AttackCard(BattleCard enemy);
     String  AttackRole(Role enemy);


}

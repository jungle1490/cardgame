package com.example.joejungle.game.GameContent.action;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/16.
 */
  public interface Skill_interface {
     String Skill(BattleCard target);
     String Skill(Role target);
     
}

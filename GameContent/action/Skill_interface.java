package GameContent.action;

import GameContent.Role.Role;
import GameContent.card.BattleCard;

/**
 * Created by joejungle on 2016/6/16.
 */
  public interface Skill_interface {
     String Skill(BattleCard target);
     String Skill(Role target);
     
}

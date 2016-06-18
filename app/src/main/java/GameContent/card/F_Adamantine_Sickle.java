package GameContent.card;

/**
 * Created by joejungle on 2016/6/18.
 */
public class F_Adamantine_Sickle extends FunctionCard {

    F_Adamantine_Sickle(){
        this.Name="Adamantine Sickle";
    }

    @Override
    public String Skill(BattleCard target) {
        int damage=8-target.getDEF();
        target.setHP((target.getHP()-damage));

        String text= target.getName() +"receives "+damage+" damage from"+ F_Adamantine_Sickle.super.getName();;
        return text;
    }
}

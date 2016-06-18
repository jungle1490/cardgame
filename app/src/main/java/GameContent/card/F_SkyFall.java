package GameContent.card;

/**
 * Created by joejungle on 2016/6/18.
 */
public class F_SkyFall extends FunctionCard {

    F_SkyFall(){
        this.Name="SkyFall";
    }

    @Override
    public String Skill(BattleCard target) {
        int DEF_decrease=target.getDEF()-6;
        target.Action=1;
        String text= target.getName() +"'s DEF decrease "+DEF_decrease+" and can't take action for 1 round.";;
        return text;
    }
}

package GameContent.card;

import GameContent.Role.Role;
import GameContent.action.Attack;

/**
 * Created by joejungle on 2016/6/16.
 */
public class BattleCard extends Card implements Attack{
    protected int HP; protected int ATK; protected int DEF; protected int Race; protected int round;


    BattleCard(int num){
        switch(num){
            case 1:
                this.Name="Alpha"; this.HP=1; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2); this.round=0;
            case 2:
                this.Name="Beta"; this.HP=2; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2);this.round=0;
            case 3:
                this.Name="Gamma"; this.HP=3; this.ATK=2; this.DEF=1; this.Race=(int)(Math.random()*2);this.round=0;
            case 4:
                this.Name="Delta"; this.HP=3; this.ATK=3; this.DEF=2; this.Race=(int)(Math.random()*2);this.round=0;
            case 5:
                this.Name="Epsilon"; this.HP=2; this.ATK=6; this.DEF=2; this.Race=(int)(Math.random()*2);this.round=0;
            case 6:
                this.Name="Zeta"; this.HP=4; this.ATK=4; this.DEF=4; this.Race=(int)(Math.random()*2);this.round=0;
            case 7:
                this.Name="Eta"; this.HP=6; this.ATK=2; this.DEF=6; this.Race=(int)(Math.random()*2);this.round=0;
            case 8:
                this.Name="Theta"; this.HP=6; this.ATK=0; this.DEF=10; this.Race=(int)(Math.random()*2);this.round=0;
            case 9:
                this.Name="Iota"; this.HP=7; this.ATK=11; this.DEF=0; this.Race=(int)(Math.random()*2);this.round=0;
            case 10:
                this.Name="Kappa"; this.HP=10; this.ATK=5; this.DEF=5; this.Race=(int)(Math.random()*2);this.round=0;
        }

    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }




    public String AttackCard(BattleCard enemy){
        int damage=this.getATK()-enemy.getDEF();
        enemy.setHP((enemy.getHP()-damage));
        this.setHP((this.getHP()-1));
        String text=this.getName() + "causes "+damage+" damage to"+enemy.getName();
        return text;
}

    public String AttackRole(Role enemy){

        int damage=this.getATK();
        enemy.setHP((enemy.getHP()-damage));
        this.setHP((this.getHP()-1));
        String text=this.getName() + "causes "+damage+" damage to"+enemy.getName();
        return text;
    }

}

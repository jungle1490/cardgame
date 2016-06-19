package com.example.joejungle.game.GameContent.card;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.action.Attack;

/**
 * Created by joejungle on 2016/6/16.
 */
public class BattleCard extends Card implements Attack{
    //the Hp of the card, if Hp goes to 0, then this card will disappear.
    protected int HP;
    //how much value you can deal with the opponent when you are attacking.
    protected int ATK;
    //how much value you can decrease when you are attacked.
    protected int DEF;
    //It could be 0 or 1, and you can only attack the cards with same race with your card.
    protected int Race;
    //It could be 0 and 1.
    //It will turn into 0 everytime when it comes to your turn.
    //1 means you have already done the action in this round.
    //0 means you can still do the action in this round.
    protected int Action;



    BattleCard(int num){
        switch(num){
            case 1:
                this.Name="Alpha"; this.HP=1; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2); this.Action=1;
            case 2:
                this.Name="Beta"; this.HP=2; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2);this.Action=1;
            case 3:
                this.Name="Gamma"; this.HP=3; this.ATK=2; this.DEF=1; this.Race=(int)(Math.random()*2);this.Action=1;
            case 4:
                this.Name="Delta"; this.HP=3; this.ATK=3; this.DEF=2; this.Race=(int)(Math.random()*2);this.Action=1;
            case 5:
                this.Name="Epsilon"; this.HP=2; this.ATK=6; this.DEF=2; this.Race=(int)(Math.random()*2);this.Action=1;
            case 6:
                this.Name="Zeta"; this.HP=4; this.ATK=4; this.DEF=4; this.Race=(int)(Math.random()*2);this.Action=1;
            case 7:
                this.Name="Eta"; this.HP=6; this.ATK=2; this.DEF=6; this.Race=(int)(Math.random()*2);this.Action=1;
            case 8:
                this.Name="Theta"; this.HP=6; this.ATK=0; this.DEF=10; this.Race=(int)(Math.random()*2);this.Action=1;
            case 9:
                this.Name="Iota"; this.HP=7; this.ATK=11; this.DEF=0; this.Race=(int)(Math.random()*2);this.Action=1;
            case 10:
                this.Name="Kappa"; this.HP=10; this.ATK=5; this.DEF=5; this.Race=(int)(Math.random()*2);this.Action=1;
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

    public int getRace() {
        return Race;
    }

    public void setRace(int race) {
        Race = race;
    }


    public int getAction() {
        return Action;
    }

    public void setAction(int action) {
        Action = action;
    }

    public String AttackCard(BattleCard enemy){
        //to distinguish both of the cards are same race or not.
        //if yes:
        if(this.getRace()==enemy.getRace()){
            //damage is count by attacker's ATK - DEF of the card attacked.
            int damage=this.getATK()-enemy.getDEF();
            //reset the HP of the card attacked.
            enemy.setHP(value_left(enemy.getHP(),damage));


            //the HP of the card attacking enemy will decrease 1 as well.
            this.setHP((this.getHP()-1));
            String text=this.getName() + "causes "+damage+" damage to"+enemy.getName();
            return text;
        }
        //if not:
        else {
            String text="You cna only attack the Cards with same race.";
            return text;
        }

}

    public String AttackRole(Role enemy){

        int damage=this.getATK();
        enemy.setHP(value_left(enemy.getHP(),damage));
        this.setHP((this.getHP()-1));
        String text=this.getName() + "causes "+damage+" damage to"+enemy.getName();
        return text;
    }

}


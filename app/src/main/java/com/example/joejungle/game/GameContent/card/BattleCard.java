package com.example.joejungle.game.GameContent.card;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.action.Attack;
import com.example.joejungle.game.R;

import java.util.ArrayList;
import java.util.List;

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
    private List<Integer> imageList;

    public List<Integer> getImageList() {
        imageList=new ArrayList<>();
        imageList.add(R.drawable.b1);imageList.add(R.drawable.b2);imageList.add(R.drawable.b3);imageList.add(R.drawable.b4);imageList.add(R.drawable.b5);
        imageList.add(R.drawable.b6);imageList.add(R.drawable.b7);imageList.add(R.drawable.b8);imageList.add(R.drawable.b9);imageList.add(R.drawable.b10);
        imageList.add(R.drawable.r1);imageList.add(R.drawable.r2);imageList.add(R.drawable.r3);imageList.add(R.drawable.r4);imageList.add(R.drawable.r5);
        imageList.add(R.drawable.r6);imageList.add(R.drawable.r7);imageList.add(R.drawable.r8);imageList.add(R.drawable.r9);imageList.add(R.drawable.r10);
        return imageList;
    }

    public BattleCard(int num){

        switch(num){
            case 1:
                this.Name="Alpha"; this.HP=1; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2); this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(0));
                else if (Race==1)
                    this.setImage(this.getImageList().get(10));
                break;

            case 2:
                this.Name="Beta"; this.HP=2; this.ATK=1; this.DEF=1; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(1));
                else if (Race==1)
                    this.setImage(this.getImageList().get(11));
                break;
            case 3:
                this.Name="Gamma"; this.HP=3; this.ATK=2; this.DEF=1; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(2));
                else if (Race==1)
                    this.setImage(this.getImageList().get(12));
                break;
            case 4:
                this.Name="Delta"; this.HP=3; this.ATK=3; this.DEF=2; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(3));
                else if (Race==1)
                    this.setImage(this.getImageList().get(13));
                break;
            case 5:
                this.Name="Epsilon"; this.HP=2; this.ATK=6; this.DEF=2; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(4));
                else if (Race==1)
                    this.setImage(this.getImageList().get(14));
                break;
            case 6:
                this.Name="Zeta"; this.HP=4; this.ATK=4; this.DEF=4; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(5));
                else if (Race==1)
                    this.setImage(this.getImageList().get(15));
                break;
            case 7:
                this.Name="Eta"; this.HP=6; this.ATK=2; this.DEF=6; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(6));
                else if (Race==1)
                    this.setImage(this.getImageList().get(16));
                break;
            case 8:
                this.Name="Theta"; this.HP=6; this.ATK=0; this.DEF=10; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(7));
                else if (Race==1)
                    this.setImage(this.getImageList().get(17));
                break;
            case 9:
                this.Name="Iota"; this.HP=7; this.ATK=11; this.DEF=0; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(8));
                else if (Race==1)
                    this.setImage(this.getImageList().get(18));
            case 10:
                this.Name="Kappa"; this.HP=10; this.ATK=5; this.DEF=5; this.Race=(int)(Math.random()*2);this.Action=1;
                if(Race==0)
                    this.setImage(this.getImageList().get(9));
                else if (Race==1)
                    this.setImage(this.getImageList().get(19));
                break;
            default:
                break;

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
        String text;
        //to distinguish both of the cards are same race or not.
        //if yes:
        if(this.getRace()==enemy.getRace()){
            //damage is count by attacker's ATK - DEF of the card attacked.
            int damage=this.getATK()-enemy.getDEF();
            //reset the HP of the card attacked.
            enemy.setHP(value_left(enemy.getHP(),damage));


            //the HP of the card attacking enemy will decrease 1 as well.
            this.setHP((this.getHP()-1));
            if(this.getHP()==0){
                text = this.getName()+" is no more useful, but "+this.getName() + "causes "+damage+" damage to"+enemy.getName();;
            }
            else
            text=this.getName() + "causes "+damage+" damage to"+enemy.getName();
            return text;
        }
        //if not:
        else {
            text="You cna only attack the Cards with same race.";
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


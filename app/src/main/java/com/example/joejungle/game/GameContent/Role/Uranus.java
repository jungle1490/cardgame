package com.example.joejungle.game.GameContent.Role;


import java.util.List;

/**
 * Created by joejungle on 2016/6/16.
 */
public class Uranus extends Role   {
    private List<Integer> List;
     public Uranus(){

         this.name="Uranus";
         this.image=this.getImageList().get(1);;
    }


    @Override
    //this skill belongs to Uranus
    public String Skill(Role target) {
        int damage = 13;
        target.setHP(target.getHP()-damage);
        String text ="";
        //if enemy gets 0 hp in the end, game will be over
        if(target.getHP()>0){
            text = this.getName()+"cause"+damage+"damage to "+target.getName();
        }
        else{
            text = "You die!";
        }

        return text;
    }

    @Override
    public String Talk1(){
        return"宋仲基好帥<3";
    }
    @Override
    public String Talk2(){
        return"多喝水沒事，沒事多喝水";
    }
    @Override
    public String Talk3(){
        return"ㄌㄩㄝ";
    }
}

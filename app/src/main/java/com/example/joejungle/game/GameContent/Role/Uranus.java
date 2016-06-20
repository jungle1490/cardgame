package com.example.joejungle.game.GameContent.Role;


/**
 * Created by joejungle on 2016/6/16.
 */
public class Uranus extends Role   {

    Uranus(){

        this.name="Uranus";
    }

    Uranus(String name,int image){
        this.name = name;
        this.image = image;
        this.HP = 50;
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

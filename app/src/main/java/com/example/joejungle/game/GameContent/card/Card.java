package com.example.joejungle.game.GameContent.card;

/**
 * Created by joejungle on 2016/6/16.
 */
abstract class Card {
    protected String Name;
    protected int Image;

    public int getImage() {
        return Image;
    }

    public  String getName() {
        return Name;
    }

    public int value_left(int origin_value, int minus_value ){
        int left_value=origin_value-minus_value;
        left_value=left_value<0? 0:left_value;
        return left_value;
    }
}

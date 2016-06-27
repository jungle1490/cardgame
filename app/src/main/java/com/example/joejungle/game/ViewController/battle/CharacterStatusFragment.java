package com.example.joejungle.game.ViewController.battle;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.card.Card;
import com.example.joejungle.game.R;


/**
 * Created by Apple on 2016/6/26.
 */
//Fragment 是窗格的概念，會依附在activity上。有點像是class 還有interface的關係
public class CharacterStatusFragment extends Fragment {


    private Card card;

    public CharacterStatusFragment() {

    }

    //把Card丟進去就可以創建一個fragment
    public static CharacterStatusFragment newInstance(Card card) {
        CharacterStatusFragment fragment = new CharacterStatusFragment();
        Bundle args = new Bundle();
        args.putSerializable("card", card);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            card = (Card) getArguments().getSerializable("card");
        }
    }

    @Override
    //顯示畫面
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.character_status_fragment, container, false);
        final ImageView c1 = (ImageView) view.findViewById(R.id.c1);
        final ImageView c2 = (ImageView) view.findViewById(R.id.c2);
        final ImageView c3 = (ImageView) view.findViewById(R.id.c3);
        final ImageView c4 = (ImageView) view.findViewById(R.id.c4);
        final ImageView c5 = (ImageView) view.findViewById(R.id.c5);

        c1.setImageResource(card.getImage());
        c2.setImageResource(card.getImage());
        c3.setImageResource(card.getImage());
        c4.setImageResource(card.getImage());
        c5.setImageResource(card.getImage());


        return view;
    }



}

package com.example.joejungle.game.ViewController.battle;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.GameContent.card.Card;
import com.example.joejungle.game.R;

import java.io.Serializable;

/**
 * Created by Apple on 2016/6/26.
 */
//Fragment 是窗格的概念，會依附在activity上。有點像是class 還有interface的關係
public class CharacterStatusFragment extends Fragment {

    private Role role;
    private Card card;

    public CharacterStatusFragment() {

    }

    public static CharacterStatusFragment newInstance(Card card) {
        CharacterStatusFragment fragment = new CharacterStatusFragment();
        Bundle args = new Bundle();
        args.putSerializable("card", (Serializable) card);
        fragment.setArguments(args);
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            card = (Card) getArguments().getSerializable("card");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.character_status_fragment, container, false);
        final ImageView c1 = (ImageView) view.findViewById(R.id.c1);
        c1.setImageResource(card.getImage());

        return view;
    }



}

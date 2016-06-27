package com.example.joejungle.game.ViewController.battle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v4.app.Fragment;

import com.example.joejungle.game.GameContent.Role.Role;
import com.example.joejungle.game.R;



public class RoleStatusFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match

    private Role role;



    public RoleStatusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment RoleStatusFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RoleStatusFragment newInstance(Role role) {
        RoleStatusFragment fragment = new RoleStatusFragment();
        Bundle args = new Bundle();
        args.putSerializable("role",role);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           role= (Role) getArguments().getSerializable("role");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_role_status,container,false);

        final ImageView ivRole=(ImageView) view.findViewById(R.id.ivRole);
        ivRole.setImageResource(role.getImage());

        // Inflate the layout for this fragment
        return view;


    }










}

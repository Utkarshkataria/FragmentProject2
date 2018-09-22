package com.example.utkarsh.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {

    Button btnClick;
    boolean flag = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        btnClick = view.findViewById(R.id.button);
        final FragmentActivity fragmentActivity = (FragmentActivity) getActivity();


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == false){
                FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                Fragment secondFragment = fragmentManager.findFragmentById(R.id.fragmentsecond);
                TextView textView = (TextView) secondFragment.getView().findViewById(R.id.textView);
                textView.setText("Button is clicked");
                flag = true;
           }

            else
                {
                    FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment secondFragment = fragmentManager.findFragmentById(R.id.fragmentsecond);
                    TextView textView = (TextView) secondFragment.getView().findViewById(R.id.textView);
                    textView.setText("Click the button");
                }

            }
        });

        return view;

    }





}

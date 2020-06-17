package com.example.androidtutor.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.androidtutor.AndroidWidgets.EditText;
import com.example.androidtutor.AndroidWidgets.TextViewFragment;
import com.example.androidtutor.R;
import com.example.androidtutor.TextView.TextViewExample;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment {


    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.activity_tutorial, container, false);
        Button textview = v.findViewById(R.id.t1);
        Button edittext = v.findViewById(R.id.t2);
        Button button = v.findViewById(R.id.t3);
        Button radiobutton = v.findViewById(R.id.t4);
        Button checkbox = v.findViewById(R.id.t5);
        Button ratingbar = v.findViewById(R.id.t6);
        Button prograssbar = v.findViewById(R.id.t7);
        Button seekbar = v.findViewById(R.id.t8);
        Button switch_ = v.findViewById(R.id.t9);
        Button togglebutton = v.findViewById(R.id.t10);
        Button spinner = v.findViewById(R.id.t11);
        Button autocomplete_textview = v.findViewById(R.id.t12);
        Button multiautocomplete_textview = v.findViewById(R.id.t13);
        Button checkedtextview = v.findViewById(R.id.t14);
        Button imageswitcher = v.findViewById(R.id.t15);
        Button adapterviewflipper = v.findViewById(R.id.t16);

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment to activity
                startActivity(new Intent(getContext(), TextViewFragment.class));
            }
        });
        edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), EditText.class));
            }
        });


    return v;
    }

}
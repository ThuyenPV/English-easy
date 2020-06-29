package com.thuyenpham.englishapp.view;


import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.englishapp.R;
import com.example.englishapp.databinding.FragmentExplanationBinding;
import com.thuyenpham.englishapp.presenter.ExplanationActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExplanationFragment extends Fragment implements View.OnClickListener {

    public static int COURSES_ONE = 0;
    public static int COURSES_TWO = 1;
    public static int COURSES_THREE = 2;
    public static int COURSES_FOUR = 3;
    public static int COURSES_FIVE = 4;
    public static int COURSES_SIX = 5;
    public static int COURSES_SEVEN = 6;
    public static int COURSES_EIGHT = 7;
    public static int COURSES_NINE = 8;
    public static int COURSES_TEN = 9;


    private LinearLayout expl1, expl2, expl3, expl4, expl5, expl6, expl7, expl8, expl9, expl10;

    public static int DEFAULT_COURSES = COURSES_ONE;

    public ExplanationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.fragment_explanation, container, false);
        FragmentExplanationBinding binding= DataBindingUtil.setContentView((Activity) getContext(),R.layout.fragment_explanation);


        binding.ex1.setOnClickListener(this);
        binding.ex2.setOnClickListener(this);
        binding.ex3.setOnClickListener(this);
        binding.ex4.setOnClickListener(this);
        binding.ex5.setOnClickListener(this);
        binding.ex6.setOnClickListener(this);
        binding.ex7.setOnClickListener(this);
        binding.ex8.setOnClickListener(this);
        binding.ex9.setOnClickListener(this);
        binding.ex10.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.ex1:
                DEFAULT_COURSES = COURSES_ONE;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex2:
                DEFAULT_COURSES = COURSES_TWO;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex3:
                DEFAULT_COURSES = COURSES_THREE;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex4:
                DEFAULT_COURSES = COURSES_FOUR;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex5:
                DEFAULT_COURSES = COURSES_FIVE;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex6:
                DEFAULT_COURSES = COURSES_SIX;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex7:
                DEFAULT_COURSES = COURSES_SEVEN;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex8:
                DEFAULT_COURSES = COURSES_EIGHT;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex9:
                DEFAULT_COURSES = COURSES_NINE;
                changeIntent(DEFAULT_COURSES);
                break;
            case R.id.ex10:
                DEFAULT_COURSES = COURSES_TEN;
                changeIntent(DEFAULT_COURSES);
                break;
        }
    }

    private void changeIntent(int COURSES) {
        Intent intent = new Intent(getContext(), ExplanationActivity.class);
        intent.putExtra("DEFAULT_CONVERT", COURSES);
        startActivity(intent);

    }
}

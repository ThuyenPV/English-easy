package com.example.englishapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


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

        expl1 = view.findViewById(R.id.ex1);
        expl2 = view.findViewById(R.id.ex2);
        expl3 = view.findViewById(R.id.ex3);
        expl4 = view.findViewById(R.id.ex4);
        expl5 = view.findViewById(R.id.ex5);
        expl6 = view.findViewById(R.id.ex6);
        expl7 = view.findViewById(R.id.ex7);
        expl8 = view.findViewById(R.id.ex8);
        expl9 = view.findViewById(R.id.ex9);
        expl10 = view.findViewById(R.id.ex10);

        addEvents();
        return view;
    }

    private void addEvents() {

        expl1.setOnClickListener(this);
        expl2.setOnClickListener(this);
        expl3.setOnClickListener(this);
        expl4.setOnClickListener(this);
        expl5.setOnClickListener(this);
        expl6.setOnClickListener(this);
        expl7.setOnClickListener(this);
        expl8.setOnClickListener(this);
        expl9.setOnClickListener(this);
        expl10.setOnClickListener(this);

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

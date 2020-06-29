package com.thuyenpham.englishapp.view;


import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.englishapp.R;
import com.example.englishapp.databinding.FragmentExplanationBinding;
import com.thuyenpham.englishapp.presenter.ExercisesActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExercisesFragment extends Fragment implements View.OnClickListener {
//    private LinearLayout level1, level2, level3, level4;

    public static int COURSES_ONE = 0;
    public static int COURSES_TWO = 1;
    public static int COURSES_THREE = 2;
    public static int COURSES_FOUR = 3;


    public static int DEFAULT_COURSES = COURSES_ONE;

    public ExercisesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.fragment_exercises, container, false);

        FragmentExplanationBinding binding= DataBindingUtil.setContentView((Activity) getContext(),R.layout.fragment_exercises);
        binding.level1.setOnClickListener(this);
        binding.level2.setOnClickListener(this);
        binding.level3.setOnClickListener(this);
        binding.level4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.level1:
                DEFAULT_COURSES = COURSES_ONE;
                IntentExpl(DEFAULT_COURSES);
                break;
            case R.id.level2:
                DEFAULT_COURSES = COURSES_TWO;
                IntentExpl(DEFAULT_COURSES);
                break;
            case R.id.level3:
                DEFAULT_COURSES = COURSES_THREE;
                IntentExpl(DEFAULT_COURSES);
                break;
            case R.id.level4:
                DEFAULT_COURSES = COURSES_FOUR;
                IntentExpl(DEFAULT_COURSES);
                break;
        }
    }

    private void IntentExpl(int DEFAULT_COURSES) {
        Intent intent = new Intent(getContext(), ExercisesActivity.class);
        intent.putExtra("DEFAULT_COURSES", DEFAULT_COURSES);
        startActivity(intent);
    }
}

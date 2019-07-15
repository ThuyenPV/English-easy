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
public class ExercisesFragment extends Fragment implements View.OnClickListener{
    private LinearLayout level1,level2,level3,level4;

    public static int COURSES_ONE = 0;
    public static int COURSES_TWO= 1;
    public static int COURSES_THREE = 2;
    public static int COURSES_FOUR = 3;


    public static int DEFAULT_COURSES= COURSES_ONE;

    public ExercisesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.fragment_exercises, container, false);

        level1 = view.findViewById(R.id.level1);
        level2 = view.findViewById(R.id.level2);
        level3 = view.findViewById(R.id.level3);
        level4 = view.findViewById(R.id.level4);

        addEvents();
        return view;
    }

    private void addEvents() {

        level1.setOnClickListener(this);
        level2.setOnClickListener(this);
        level3.setOnClickListener(this);
        level4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.level1) {
            DEFAULT_COURSES = COURSES_ONE;
            Intent intent = new Intent(getContext(), DetailLessonActivity.class);
            intent.putExtra("DEFAULT_CONVERT", DEFAULT_COURSES);
            startActivity(intent);
        }
        if (id == R.id.level2) {
            DEFAULT_COURSES = COURSES_TWO;
            Intent intent = new Intent(getContext(), DetailLessonActivity.class);
            intent.putExtra("DEFAULT_CONVERT", DEFAULT_COURSES);
            startActivity(intent);
        }
        if (id == R.id.level3) {
            DEFAULT_COURSES = COURSES_THREE;
            Intent intent = new Intent(getContext(), DetailLessonActivity.class);
            intent.putExtra("DEFAULT_CONVERT", DEFAULT_COURSES);
            startActivity(intent);
        }
        if (id == R.id.level4) {
            DEFAULT_COURSES = COURSES_FOUR;
            Intent intent = new Intent(getContext(), DetailLessonActivity.class);
            intent.putExtra("DEFAULT_CONVERT", DEFAULT_COURSES);
            startActivity(intent);
        }
    }
}

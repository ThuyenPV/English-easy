package com.example.englishapp.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.englishapp.presenter.DetailLessonActivity;
import com.example.englishapp.module.English;
import com.example.englishapp.module.EnglishAdapter;
import com.example.englishapp.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoursesFragment extends Fragment {
    //các thuộc tính để search
    private int NORMAL_MODE = 0;
    private int DISPLAY_MODE = 1;
    private int CURRENT_MODE = NORMAL_MODE;


    ListView lvLesson;
    public static ArrayList<English> arrayListLesson;

    public static ArrayList<English> arrSearch = new ArrayList<>();
    private EnglishAdapter englishAdapter;

    public CoursesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.fragment_courses, container, false);

        lvLesson = view.findViewById(R.id.lvLesson);
        arrayListLesson = new ArrayList<>();
        englishAdapter = new EnglishAdapter(getContext(), R.layout.custom_english, arrayListLesson);
        lvLesson.setAdapter(englishAdapter);

        emulatorEnglish();
        addEvents();
        return view;
    }


    private void emulatorEnglish() {
        arrayListLesson.add(new English(1, "Future Progressive Tense"));
        arrayListLesson.add(new English(2, "Present Continuous (Present Progressive) Tense"));
        arrayListLesson.add(new English(3, "Present Continuous Use (or Present Progressive Use)"));
        arrayListLesson.add(new English(4, "Present Simple Use"));
        arrayListLesson.add(new English(5, "present-simple"));
        arrayListLesson.add(new English(6, "Questions formed with _did_"));
        arrayListLesson.add(new English(7, "Simple Future and Future with 'Going To'"));
        arrayListLesson.add(new English(8, "The Future Continuous Tense"));
        arrayListLesson.add(new English(9, "The Future Perfect Continuous Tense in English"));
        arrayListLesson.add(new English(10, "The Future Perfect Tense in English"));
        arrayListLesson.add(new English(11, "The Future Perfect Tense"));
        arrayListLesson.add(new English(12, "The Past Continuous (or Past Progressive) Tense"));
        arrayListLesson.add(new English(13, "The Past Perfect Continuous Tense - When should we use it_"));
        arrayListLesson.add(new English(14, "The Past Perfect Continuous Tense"));
        arrayListLesson.add(new English(15, "The Past Perfect Tense"));
        arrayListLesson.add(new English(16, "The Past Simple (or Simple Past) Tense"));
        arrayListLesson.add(new English(17, "The Present Perfect Continuous (or Present Perfect Progressive) Tense"));
        arrayListLesson.add(new English(18, "The Present Perfect Tense"));
        arrayListLesson.add(new English(19, "The Simple Future Tense"));
        arrayListLesson.add(new English(20, "Using the past continuous (or past progessive) tense"));
        arrayListLesson.add(new English(21, "Using the Past Perfect Tense"));
        arrayListLesson.add(new English(22, "Using the Past Simple (or Simple Past) Tense"));
        arrayListLesson.add(new English(23, "Using the Present Perfect Continuous (or Progressive)"));
        arrayListLesson.add(new English(24, "Using The Present Perfect Tense in English"));

        englishAdapter.notifyDataSetChanged();

    }


    private void addEvents() {
        lvLesson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), DetailLessonActivity.class);
                intent.putExtra("lesson_id", position);
                startActivity(intent);
            }
        });
    }

}

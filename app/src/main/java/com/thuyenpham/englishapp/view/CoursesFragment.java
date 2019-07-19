package com.thuyenpham.englishapp.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.englishapp.R;
import com.thuyenpham.englishapp.module.English;
import com.thuyenpham.englishapp.module.EnglishAdapter;
import com.thuyenpham.englishapp.presenter.CoursesActivity;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoursesFragment extends Fragment {

    private ListView lvLesson;
    public static ArrayList<English> arrayListLesson;
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

    String[] arrayLesson={
            "Present Simple Form",
            "Present Simple Use",
            "Present Continuous Form",
            "Present Continuous Use",
            "Present Perfect Simple Form",
            "Present Perfect Simple Use",
            "Present Perfect Continuous Form",
            "Present Perfect Continuous Use",
            "Past Simple Form",
            "Past Simple Use",
            "Past Continuous Form",
            "Past Continuous Use",
            "Past Perfect Simple Form",
            "Past Perfect Simple Use",
            "Past Perfect Continuous Form",
            "Past Perfect Continuous Use",
            "Future Simple Form",
            "Future Simple Use",
            "Future Continuous Form",
            "Future Continuous Use",
            "Future Perfect Simple Form",
            "Future Perfect Simple Use",
            "Future Perfect Continuous Form",
            "Future Perfect Continuous Use",
            "How to choose: Future with 'will' or future with 'be going to'?",
            "How to choose: Present Perfect or Past Simple?",
            "How to choose: Present Simple or Present Continuous?",
            "How to choose: Present Perfect Simple or Present Perfect Continuous?",
    };


    private void emulatorEnglish() {
        for(int i=0;i<arrayLesson.length;i++){
            arrayListLesson.add(new English(i,arrayLesson[i]));
        }
        englishAdapter.notifyDataSetChanged();

    }

    private void addEvents() {
        lvLesson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), CoursesActivity.class);
                intent.putExtra("lesson_id", position);
                Log.d("position", "onItemClick: "+position);
                startActivity(intent);
            }
        });
    }

}

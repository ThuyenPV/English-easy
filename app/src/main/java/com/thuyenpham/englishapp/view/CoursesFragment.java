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
    String[] arrayLesson;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.fragment_courses, container, false);
        arrayLesson=getResources().getStringArray(R.array.arrLesson);

        lvLesson = view.findViewById(R.id.lvLesson);
        arrayListLesson = new ArrayList<>();
        englishAdapter = new EnglishAdapter(getContext(), R.layout.custom_english, arrayListLesson);
        lvLesson.setAdapter(englishAdapter);

        emulatorEnglish();
        addEvents();
        return view;
    }

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

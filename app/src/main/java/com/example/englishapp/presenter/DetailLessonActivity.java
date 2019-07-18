package com.example.englishapp.presenter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.englishapp.R;
import com.example.englishapp.module.DetailLessonAdapter;
import com.example.englishapp.view.CoursesFragment;

public class DetailLessonActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private DetailLessonAdapter detailLessonAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail_lesson);
        addControls();
    }

    private void addControls() {
        viewPager = findViewById(R.id.view_pager);
        detailLessonAdapter = new DetailLessonAdapter(this, CoursesFragment.arrayListLesson);
        viewPager.setAdapter(detailLessonAdapter);

        int id = getIntent().getExtras().getInt("lesson_id");
        viewPager.setCurrentItem(id);

    }
}

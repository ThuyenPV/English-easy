package com.thuyenpham.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;

public class ExercisesActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERTTYPE;
    String[] arrCourses={
            "https://perfect-english-grammar3.teachable.com/p/a1-a2-english-grammar-for-learners-of-english",
            "https://perfect-english-grammar3.teachable.com/p/level-1-phrasal-verbs",
            "https://perfect-english-grammar3.teachable.com/p/conditionals-complete-course-levels-1-3",
            "https://perfect-english-grammar3.teachable.com/p/30-day-challenge-phrasal-verbs"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        webView = findViewById(R.id.webView);
        addConvertType();
    }

    private void addConvertType() {
        CONVERTTYPE = getIntent().getIntExtra("DEFAULT_COURSES",0);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR
        LoadContentFromWebsite(arrCourses[CONVERTTYPE]);
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

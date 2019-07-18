package com.example.englishapp.presenter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;

public class ExercisesActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERTTYPE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        adControls();
        addConvertType();
    }

    private void adControls() {

        webView = findViewById(R.id.webView);
    }

    private void addConvertType() {
        CONVERTTYPE = getIntent().getIntExtra("DEFAULT_COURSES",0);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR
        switch (CONVERTTYPE) {
            case 0:
                LoadContentFromWebsite("https://perfect-english-grammar3.teachable.com/p/a1-a2-english-grammar-for-learners-of-english");
                break;
            case 1:
                LoadContentFromWebsite("https://perfect-english-grammar3.teachable.com/p/level-1-phrasal-verbs");
                break;
            case 2:
                LoadContentFromWebsite("https://perfect-english-grammar3.teachable.com/p/conditionals-complete-course-levels-1-3");
                break;
            case 3:
                LoadContentFromWebsite("https://perfect-english-grammar3.teachable.com/p/30-day-challenge-phrasal-verbs");
                break;
        }
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

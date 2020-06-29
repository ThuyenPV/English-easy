package com.thuyenpham.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;

public class ExercisesActivity extends AppCompatActivity {
    private WebView webView;
    private int convert_type;
    String[] arrCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        arrCourses=getResources().getStringArray(R.array.arrCourse);;

        webView = findViewById(R.id.webView);
        addConvertType();
    }

    private void addConvertType() {
        convert_type = getIntent().getIntExtra("DEFAULT_COURSES",0);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR
        LoadContentFromWebsite(arrCourses[convert_type]);
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

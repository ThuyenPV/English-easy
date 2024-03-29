package com.thuyenpham.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;

public class ExplanationActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERTTYPE;
    String[] arrExercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);
        arrExercises=getResources().getStringArray(R.array.arrExersise);
        webView = findViewById(R.id.expl_webview);
        addConvertType();
    }

    private void addConvertType() {
        CONVERTTYPE = getIntent().getIntExtra("DEFAULT_COURSES",0);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR
        LoadContentFromWebsite(arrExercises[CONVERTTYPE]);
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

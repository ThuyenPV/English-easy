package com.example.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;

public class ExplanationActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERTTYPE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        adControls();
        addConvertType();
    }

    private void adControls() {

        webView = findViewById(R.id.expl_webview);
    }

    private void addConvertType() {
        CONVERTTYPE = getIntent().getIntExtra("DEFAULT_COURSES",0);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR
        switch (CONVERTTYPE) {
            case 0:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/irregular-verbs-exercise-1.html");
                break;
            case 1:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/irregular-verbs-exercise-2.html");
                break;
            case 2:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/irregular-verbs-exercise-3.html");
                break;
            case 3:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/irregular-verbs-exercise-4.html");
                break;
            case 4:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-11.html");
                break;
            case 5:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-10.html");
                break;
            case 6:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-12.html");
                break;
            case 7:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-13.html");
                break;
            case 8:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-14.html");
                break;
            case 9:
                LoadContentFromWebsite("https://www.perfect-english-grammar.com/present-simple-exercise-15.html");
                break;
        }
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

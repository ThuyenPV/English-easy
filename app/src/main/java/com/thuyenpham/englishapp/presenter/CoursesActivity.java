package com.thuyenpham.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

        import com.example.englishapp.R;

public class CoursesActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERTTYPE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        adControls();
        addConvertType();
    }

    String[] arrayLink={
            "https://www.perfect-english-grammar.com/present-simple.html",
            "https://www.perfect-english-grammar.com/present-simple-use.html",
            "https://www.perfect-english-grammar.com/present-continuous.html",
            "https://www.perfect-english-grammar.com/present-continuous-use.html",
            "https://www.perfect-english-grammar.com/present-perfect.html",
            "https://www.perfect-english-grammar.com/present-perfect-use.html",
            "https://www.perfect-english-grammar.com/present-perfect-continuous.html",
            "https://www.perfect-english-grammar.com/present-perfect-continuous-use.html",
            "https://www.perfect-english-grammar.com/past-simple.html",
            "https://www.perfect-english-grammar.com/past-simple-use.html",
            "https://www.perfect-english-grammar.com/past-continuous.html",
            "https://www.perfect-english-grammar.com/past-continuous-use.html",
            "https://www.perfect-english-grammar.com/past-perfect.html",
            "https://www.perfect-english-grammar.com/past-perfect-use.html",
            "https://www.perfect-english-grammar.com/past-perfect-continuous.html",
            "https://www.perfect-english-grammar.com/past-perfect-continuous-use.html",
            "https://www.perfect-english-grammar.com/simple-future.html",
            "https://www.perfect-english-grammar.com/simple-future-use.html",
            "https://www.perfect-english-grammar.com/future-continuous.html",
            "https://www.perfect-english-grammar.com/future-progressive-tense-use.html",
            "https://www.perfect-english-grammar.com/future-perfect.html",
            "https://www.perfect-english-grammar.com/future-perfect-tense-use.html",
            "https://www.perfect-english-grammar.com/future-perfect-continuous.html",
            "https://www.perfect-english-grammar.com/future-perfect-continuous-use.html",
            "https://www.perfect-english-grammar.com/will-or-be-going-to.html",
            "https://www.perfect-english-grammar.com/present-perfect-or-past-simple.html",
            "https://www.perfect-english-grammar.com/present-simple-or-present-continuous.html",
            "https://www.perfect-english-grammar.com/present-perfect-simple-or-present-perfect-continuous.html",
            "https://www.perfect-english-grammar.com/grammar-exercises.html",
            "https://www.perfect-english-grammar.com/present-simple-spelling.html",
            "https://www.perfect-english-grammar.com/adverbs-of-frequency.html",
            "https://www.perfect-english-grammar.com/irregular-verbs.html",
            "https://www.perfect-english-grammar.com/how-to-pronounce-ed.html",
            "https://www.perfect-english-grammar.com/stative-verbs.html",
    };

    private void adControls() {
        webView = findViewById(R.id.courses_webview);
    }

    private void addConvertType() {
        CONVERTTYPE = getIntent().getIntExtra("lesson_id",1);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR

        LoadContentFromWebsite(arrayLink[CONVERTTYPE]);
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

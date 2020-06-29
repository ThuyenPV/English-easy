package com.thuyenpham.englishapp.presenter;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

        import com.example.englishapp.R;

public class CoursesActivity extends AppCompatActivity {
    private WebView webView;
    private int CONVERT_TYPE;
    String[] arrayLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        arrayLink=getResources().getStringArray(R.array.arrLink);;
        adControls();
        addConvertType();
    }


    private void adControls() {
        webView = findViewById(R.id.courses_webview);
    }

    private void addConvertType() {
        CONVERT_TYPE = getIntent().getIntExtra("lesson_id",1);
        //0: COURSES_ONE       //1: COURSES_TWO     //2: COURSES_THREE      //3: COURSES_FOUR

        LoadContentFromWebsite(arrayLink[CONVERT_TYPE]);
    }

    private void LoadContentFromWebsite(String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}

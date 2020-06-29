package com.thuyenpham.englishapp.view;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.englishapp.R;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TranslateFragment extends Fragment {
    private WebView webView;

    public TranslateFragment() {
        // Required empty public constructor
    }


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_translate,container,false);

        webView=view.findViewById(R.id.translate_webView);
        webView.loadUrl("https://translate.google.com");
        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        // Inflate the layout for this fragment
        return view;
    }

}

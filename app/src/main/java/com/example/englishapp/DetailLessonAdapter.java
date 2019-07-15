package com.example.englishapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;

public class DetailLessonAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<English> arrayListDetail;

    public DetailLessonAdapter(Context context, ArrayList<English> arrayListDetail) {
        this.context = context;
        this.arrayListDetail = arrayListDetail;
    }

    @Override
    public int getCount() {
        return arrayListDetail.size();
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return view==o;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        LayoutInflater layoutInflater=LayoutInflater.from(this.context);
        View view=layoutInflater.inflate(R.layout.lession_detail_item,container,false);

        //find view by id
        WebView webView=view.findViewById(R.id.webView);

        String url= "file:///android_asset/"+arrayListDetail.get(position).getNameLesson()+".html";
        url=url.replace(" ","%20");

        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
        //show zoom
        webView.getSettings().setBuiltInZoomControls(true);
        container.addView(view);
        return view;
    }
}

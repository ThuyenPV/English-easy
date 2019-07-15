package com.example.englishapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EnglishAdapter extends ArrayAdapter<English> {
    Context context;
    int resource;
    List<English> objects;

    public EnglishAdapter( Context context, int resource, List<English> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.custom_english,null);

        TextView txtLesson=convertView.findViewById(R.id.txtLesson);

        English english=this.objects.get(position);
        txtLesson.setText(english.getNameLesson());

        return convertView;
    }
}

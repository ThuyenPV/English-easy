package com.thuyenpham.englishapp.module;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.englishapp.R;

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

    public class ViewHolder{
        TextView txtLesson;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater layoutInflater= (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.custom_english,null);
            viewHolder.txtLesson=convertView.findViewById(R.id.txtLesson);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }

        English english=this.objects.get(position);
        viewHolder.txtLesson.setText(english.getNameLesson());

        return convertView;
    }
}

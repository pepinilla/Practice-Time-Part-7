package com.example.carolina.practicetime.SegundaActividad;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.carolina.practicetime.PrimerActividad.SecondList.FindDB;
import com.example.carolina.practicetime.PrimerActividad.SecondList.FindDBHelper;
import com.example.carolina.practicetime.R;

import java.util.List;

/**
 * Created by carolina on 23/07/17.
 */

public class CustomAdapter extends ArrayAdapter<FindDBHelper>{
    List<FindDBHelper> list;
    LayoutInflater inflater;
    public CustomAdapter(Context context, List<FindDBHelper> objects) {
        super(context, R.layout.item_secondactivty, objects);

        list = objects;
        inflater = LayoutInflater.from(context);


    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_secondactivty, parent, false);

        }

        TextView textView = (TextView) convertView.findViewById(R.id.textView2);

        FindDBHelper finddata = list.get(position);

        textView.setText(finddata.toString());

        return convertView;
        }

    }



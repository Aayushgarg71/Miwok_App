package com.example.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter <Word> {
    public WordAdapter(Activity numbers, ArrayList<Word> words) {
        super(numbers,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemview = convertView;
        if(listitemview == null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord=getItem(position);
        TextView nameTextView = (TextView) listitemview.findViewById(R.id.miwok);
        nameTextView.setText(currentWord.defaulttr());
        TextView nameTextView1 = (TextView) listitemview.findViewById(R.id.english);
        nameTextView1.setText(currentWord.miworktr());
        return listitemview;
    }
}

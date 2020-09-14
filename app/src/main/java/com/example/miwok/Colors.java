package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList <Word> words = new ArrayList <Word>();
        words.add( new Word("weṭeṭṭi","red"));
        words.add( new Word("chokokki","green"));
        words.add( new Word("ṭakaakki","brown"));
        words.add( new Word("ṭopoppi","gray"));
        words.add( new Word("kululli","black"));
        words.add( new Word("kelelli","white"));
        words.add( new Word("ṭopiisә","dusty yellow"));
        words.add( new Word("chiwiiṭә","mustard yellow"));
        WordAdapter items = new WordAdapter(this, words);
        ListView ls = (ListView) findViewById(R.id.colors);
        ls.setAdapter(items);
    }
}
package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word("әpә","father"));
        words.add( new Word("әṭa","mother"));
        words.add( new Word("angsi","son"));
        words.add( new Word("tune","daughter"));
        words.add( new Word("taachi","older brother"));
        words.add( new Word("chalitti","younger brother"));
        words.add( new Word("teṭe","older sister"));
        words.add( new Word("kolliti","younger sister"));
        words.add( new Word("ama","grandmother"));
        words.add( new Word("paapa","grandfather"));
        WordAdapter items = new WordAdapter(this, words);
        ListView ls = (ListView) findViewById(R.id.ll);
        ls.setAdapter(items);
    }
}
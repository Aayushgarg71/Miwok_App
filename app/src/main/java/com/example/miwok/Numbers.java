package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList <Word> words = new ArrayList<Word>();
        words.add( new Word("lutti","one"));
        words.add( new Word("otiiko","two"));
        words.add( new Word("tolookoshu","three"));
        words.add( new Word("oyyissa","four"));
        words.add( new Word("mashhokka","five"));
        words.add( new Word("temmokka","six"));
        words.add( new Word("kenekkaku","seven"));
        words.add( new Word("kawwinṭa","eight"));
        words.add( new Word("Wo'e","nine"));
        words.add( new Word("na’aacha","ten"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
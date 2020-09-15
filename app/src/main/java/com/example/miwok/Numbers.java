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
        words.add( new Word("lutti","one",R.drawable.number_one));
        words.add( new Word("otiiko","two",R.drawable.number_two));
        words.add( new Word("tolookoshu","three",R.drawable.number_three));
        words.add( new Word("oyyissa","four",R.drawable.number_four));
        words.add( new Word("mashhokka","five",R.drawable.number_five));
        words.add( new Word("temmokka","six",R.drawable.number_six));
        words.add( new Word("kenekkaku","seven",R.drawable.number_seven));
        words.add( new Word("kawwinṭa","eight",R.drawable.number_eight));
        words.add( new Word("Wo'e","nine",R.drawable.number_nine));
        words.add( new Word("na’aacha","ten",R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
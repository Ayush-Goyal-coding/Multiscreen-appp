package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("colors","iro"));
        words.add(new word("Red","aka"));
        words.add(new word("Blue","aao"));
        words.add(new word("Green","midori"));
        words.add(new word("Yellow","kiiro"));
        words.add(new word("Purple","Murasaki"));
        words.add(new word("Brown","chairo"));
        words.add(new word("Black","kuro"));
        words.add(new word("White","shiro"));
        words.add(new word("pink","pinku"));
        words.add(new word("Older Sister(someone's)","onee san"));


        // Find the root view so we can add child views to it
        //    LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);

        // Create a variable to keep track of the current index position


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        WordAdapter adapter = new WordAdapter (this,words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}


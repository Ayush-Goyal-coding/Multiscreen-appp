package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Father(own)","chichi"));
        words.add(new word("Mother(own)","Haha"));
        words.add(new word("Older Brother(own)","ani"));
        words.add(new word("Older Sister(own)","ane"));
        words.add(new word("Younger Brother(own)","otouto"));
        words.add(new word("Younger Sister(own)","imouto"));
        words.add(new word("in-law","giri no "));
        words.add(new word("Mother(someone's)","okaa san"));
        words.add(new word("Father(someone's)","otou san"));
        words.add(new word("Older Brother(someone's)","onii san"));
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


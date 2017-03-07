package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","ichi"));
        words.add(new word("two","ni"));
        words.add(new word("three","san"));
        words.add(new word("four","shi"));
        words.add(new word("five","go"));
        words.add(new word("six","roku"));
        words.add(new word("seven","nana"));
        words.add(new word("Eight","hachi"));
        words.add(new word("nine","ku"));
        words.add(new word("Ten","ju"));
        words.add(new word("Hundred","hyaku"));

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
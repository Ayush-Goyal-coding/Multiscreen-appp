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
        words.add(new word("one","ichi",R.drawable.number_one));
        words.add(new word("two","ni",R.drawable.number_two));
        words.add(new word("three","san",R.drawable.number_three));
        words.add(new word("four","shi",R.drawable.number_four));
        words.add(new word("five","go",R.drawable.number_five));
        words.add(new word("six","roku",R.drawable.number_six));
        words.add(new word("seven","nana",R.drawable.number_seven));
        words.add(new word("Eight","hachi",R.drawable.number_eight));
        words.add(new word("nine","ku",R.drawable.number_nine));
        words.add(new word("Ten","ju",R.drawable.number_ten));

        // Find the root view so we can add child views to it
    //    LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);

        // Create a variable to keep track of the current index position


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        WordAdapter adapter = new WordAdapter (this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter); 
    }
}
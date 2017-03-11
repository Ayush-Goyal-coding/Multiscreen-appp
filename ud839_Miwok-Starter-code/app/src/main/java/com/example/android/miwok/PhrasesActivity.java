package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Welcome","yōkoso",R.raw.phrase_are_you_coming));
        words.add(new word("Hello (General greeting)","konnichiwa"));
        words.add(new word("Please (requesting s'thing)","Kudasai"));
        words.add(new word("Please (offering s'thing)","Dozo"));
        words.add(new word("Sorry (mistake)","Gomen nasai"));
        words.add(new word("Thank you","Arigato"));
        words.add(new word("Thank you very much","Domo arigato gozaimasu"));
        words.add(new word("Excuse me (to get attention)","Sumimasen"));
        words.add(new word("Yes","hai"));
        words.add(new word("no","itte"));
        words.add(new word("Help!","tasukete!"));


        // Find the root view so we can add child views to it
        //    LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);

        // Create a variable to keep track of the current index position


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        WordAdapter adapter = new WordAdapter (this,words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}


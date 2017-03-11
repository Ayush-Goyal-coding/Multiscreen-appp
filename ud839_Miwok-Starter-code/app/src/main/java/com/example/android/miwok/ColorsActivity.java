package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("colors","iro"));
        words.add(new word("Red","aka",R.drawable.color_red,R.raw.color_red ));
        words.add(new word("yellow ocher","oudo iro",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow ));
        words.add(new word("Green","midori",R.drawable.color_green,R.raw.color_green ));
        words.add(new word("Yellow","kiiro",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow ));
        words.add(new word("Gray","Gure",R.drawable.color_gray,R.raw.color_gray ));
        words.add(new word("Brown","chairo",R.drawable.color_brown,R.raw.color_brown ));
        words.add(new word("Black","kuro",R.drawable.color_black,R.raw.color_black ));
        words.add(new word("White","shiro",R.drawable.color_white,R.raw.color_white ));
        words.add(new word("pink","pinku"));



        // Find the root view so we can add child views to it
        //    LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);

        // Create a variable to keep track of the current index position


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        WordAdapter adapter = new WordAdapter (this,words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}


package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StoryPage extends AppCompatActivity {

    TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory.setText(story);

    }
}
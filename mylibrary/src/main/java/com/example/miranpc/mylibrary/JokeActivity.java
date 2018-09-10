package com.example.miranpc.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeTv;
    public static final String JOKE="joke";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTv = findViewById(R.id.joke_textview);
        String joke = getIntent().getStringExtra(JOKE);
        jokeTv.setText(joke);

    }
}

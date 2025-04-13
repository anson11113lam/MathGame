package com.polyu.mobilegroupproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        // Set up back button
        findViewById(R.id.back_button).setOnClickListener(v -> finish());
        
        // Set up mute button (reset scores in this case)
        findViewById(R.id.mute_button).setOnClickListener(v -> {
            // Reset leaderboard scores here
        });
    }
} 
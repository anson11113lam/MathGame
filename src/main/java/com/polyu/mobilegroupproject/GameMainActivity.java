package com.polyu.mobilegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        // Set game name
        TextView gameName = findViewById(R.id.game_name);
        gameName.setText("Math Formula Game");

        // Set up click listeners
        findViewById(R.id.login_button).setOnClickListener(v -> {
            startActivity(new Intent(GameMainActivity.this, MenuActivity.class));
            finish();
        });

        findViewById(R.id.stage_button).setOnClickListener(v -> {
            startActivity(new Intent(GameMainActivity.this, GameSelectActivity.class));
        });

        findViewById(R.id.legend_board_button).setOnClickListener(v -> {
            startActivity(new Intent(GameMainActivity.this, LeaderboardActivity.class));
        });

        findViewById(R.id.settings_button).setOnClickListener(v -> {
            startActivity(new Intent(GameMainActivity.this, SettingsActivity.class));
        });
    }
} 
package com.polyu.mobilegroupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.polyu.mobilegroupproject.games.MathGameActivity;
import com.polyu.mobilegroupproject.games.MathGame2Activity;
import com.polyu.mobilegroupproject.games.MathGame3Activity;

public class GameSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_select);

        // Set up back button
        findViewById(R.id.back_button).setOnClickListener(v -> finish());
        
        // Set up math game buttons - use direct IDs
        Button mathLevel1 = findViewById(R.id.math_level1);
        Button mathLevel2 = findViewById(R.id.math_level2);
        Button mathLevel3 = findViewById(R.id.math_level3);
        Button mathLevel4 = findViewById(R.id.math_level4);
        
        // Set click listener for Level 1 (original math game)
        mathLevel1.setOnClickListener(v -> {
            Intent intent = new Intent(GameSelectActivity.this, MathGameActivity.class);
            intent.putExtra("difficulty", 1);
            startActivity(intent);
        });
        
        // Set click listener for Level 2 (math game with draggable button)
        mathLevel2.setOnClickListener(v -> {
            Intent intent = new Intent(GameSelectActivity.this, MathGame2Activity.class);
            intent.putExtra("difficulty", 2);
            startActivity(intent);
        });
        
        // Set click listener for Level 3 (math game with orientation change)
        mathLevel3.setOnClickListener(v -> {
            Intent intent = new Intent(GameSelectActivity.this, MathGame3Activity.class);
            intent.putExtra("difficulty", 3);
            startActivity(intent);
        });
        
        // For level 4, continue using the original math game with most difficult setting
        mathLevel4.setOnClickListener(v -> {
            Intent intent = new Intent(GameSelectActivity.this, MathGameActivity.class);
            intent.putExtra("difficulty", 4);
            startActivity(intent);
        });
    }
} 
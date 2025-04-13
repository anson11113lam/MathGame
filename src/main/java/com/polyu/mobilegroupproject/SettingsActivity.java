package com.polyu.mobilegroupproject;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private boolean isMuted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Set up back button
        findViewById(R.id.back_button).setOnClickListener(v -> finish());

        // Set up mute button
        Button muteButton = findViewById(R.id.mute_button);
        muteButton.setOnClickListener(v -> {
            isMuted = !isMuted;
            muteButton.setText(isMuted ? "Unmute" : "Mute");
            // Implement actual muting functionality here
        });
    }
} 
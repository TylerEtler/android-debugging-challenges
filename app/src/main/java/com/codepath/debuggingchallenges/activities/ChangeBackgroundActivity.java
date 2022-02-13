package com.codepath.debuggingchallenges.activities;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private int oldColor = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        findViewById(android.R.id.content).setBackgroundColor(getNextColor());
    }

    public void onGoClick(View view) {
        Log.d("ChangeBackground","clicked");
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        /*
        if (newColor == Color.BLUE) {
            oldColor = Color.RED;
        }
        else
        {
            oldColor = Color.BLUE;
        }
        */
        oldColor = newColor;
        return newColor;
    }
}

package com.example.studyspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RoomActivity extends AppCompatActivity {

    private Button button1;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        button1 = findViewById(R.id.anButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnalytics();
            }
        });


    }

    public void openAnalytics() {
        Intent intent = new Intent(this,AnalyticsActivity.class);
        startActivity(intent);

    }
}

package com.example.studyspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuildingsActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);

        button1 = findViewById(R.id.MCBbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFloorActivity();
            }
        });

        button2 = findViewById(R.id.NCBbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFloorActivity();
            }
        });

        button3 = findViewById(R.id.RANbutton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFloorActivity();
            }
        });

    }

    public void openFloorActivity() {
        Intent intent = new Intent(this,FloorActivity.class);
        startActivity(intent);

    }
}

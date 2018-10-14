package com.example.studyspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FloorActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);


        button1 = findViewById(R.id.floor1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoom();
            }
        });

        button2 = findViewById(R.id.floor2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoom();
            }
        });

        button3 = findViewById(R.id.floor3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoom();
            }
        });
    }


    public void openRoom() {
        Intent intent = new Intent(this,RoomActivity.class);
        startActivity(intent);

    }
}

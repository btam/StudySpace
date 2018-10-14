package com.example.studyspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewAlertsActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_alerts);


        button1 = findViewById(R.id.edit1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlerts();
            }
        });

        button2 = findViewById(R.id.edit2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlerts();
            }
        });
    }

    public void openAlerts() {
        Intent intent = new Intent(this,AlertsActivity.class);
        startActivity(intent);

    }
}

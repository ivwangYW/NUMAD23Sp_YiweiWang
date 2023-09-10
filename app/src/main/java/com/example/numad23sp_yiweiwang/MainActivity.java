package com.example.numad23sp_yiweiwang;




import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutMeButton = findViewById(R.id.button);

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace with your name and email
                String name = "Your Name";
                String email = "your.email@example.com";

                // Create and display the Toast message
                CharSequence text = "Name: " + name + "\nEmail: " + email;
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(getApplicationContext(), text, duration).show();
            }
        });

    }
}
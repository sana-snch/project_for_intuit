package com.example.margin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class introActivity extends AppCompatActivity {
    Button intro_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        intro_button = findViewById(R.id.intro_button);
        intro_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(introActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}

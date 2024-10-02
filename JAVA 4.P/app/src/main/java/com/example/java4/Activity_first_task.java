package com.example.java4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class Activity_first_task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt = new TextView(this);
        txt.setText("НА ТРОЙКУ НЕТ);
        txt.setTextSize(40); //
        txt.setGravity(Gravity.CENTER);


        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );


        Button backButton = new MaterialButton(this);
        backButton.setText("Вернуться");
        backButton.setLayoutParams(params);


        backButton.setGravity(Gravity.CENTER);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(txt);
        layout.addView(backButton);

        layout.setGravity(Gravity.CENTER);

        setContentView(layout);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_first_task.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
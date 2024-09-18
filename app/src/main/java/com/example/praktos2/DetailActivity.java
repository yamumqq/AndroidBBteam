package com.example.praktos2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        String name = getIntent().getStringExtra("name");
        String capital = getIntent().getStringExtra("capital");
        int flagResId = getIntent().getIntExtra("flag", -1);
        String description = getIntent().getStringExtra("description");


        ImageView flagImageView = findViewById(R.id.detail_flag);
        TextView nameTextView = findViewById(R.id.detail_name);
        TextView capitalTextView = findViewById(R.id.detail_capital);
        TextView descriptionTextView = findViewById(R.id.detail_description);
        Button backButton = findViewById(R.id.back_button);


        flagImageView.setImageResource(flagResId);
        nameTextView.setText(name);
        capitalTextView.setText(capital);
        descriptionTextView.setText(description);


        backButton.setOnClickListener(v -> finish());
    }
}

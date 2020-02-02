package com.example.auduvidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TranslateText extends AppCompatActivity
{
    private Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_text);

        Home = findViewById(R.id.btnReturn);

        Home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(TranslateText.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

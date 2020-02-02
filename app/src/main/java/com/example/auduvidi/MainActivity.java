package com.example.auduvidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button TTS;
    private Button STT;
    private Button TT;
    private Button TS;
    private Button TA;
    private Button IR;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TTS = findViewById(R.id.btnTTS);
        STT = findViewById(R.id.btnSTT);
        TT = findViewById(R.id.btnTT);
        TS = findViewById(R.id.btnTS);
        TA = findViewById(R.id.btnTA);
        IR = findViewById(R.id.btnIR);

        TTS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, TextToSpeech.class);
                startActivity(intent);
            }
        });

        STT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SpeechToText.class);
                startActivity(intent);
            }
        });

        TT.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, TranslateText.class);
                startActivity(intent);
            }
        });

        TS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, TranslateSpeech.class);
                startActivity(intent);
            }
        });

        TA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, ToneAnalyzer.class);
                startActivity(intent);
            }
        });

        IR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, ImageRecognition.class);
                startActivity(intent);
            }
        });

    }
}

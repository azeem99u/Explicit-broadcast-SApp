package com.example.android.explicitbroadcastsenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName("com.example.android.explicitbroadcastreciverapp","com.example.android.explicitbroadcastreciverapp.MyReceiver");
            intent.setComponent(componentName);
            sendBroadcast(intent);
        });
    }
}
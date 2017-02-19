package com.vsk.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
        Intent intent = new Intent(this, BuckysIntentService.class);
        startService(intent);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Oranges.class);

        final EditText applesInput = (EditText) findViewById(R.id.applesInput);
        String userMessage = applesInput.getText().toString();
        i.putExtra("applesMessage", userMessage);

        startActivity(i);
    }
}

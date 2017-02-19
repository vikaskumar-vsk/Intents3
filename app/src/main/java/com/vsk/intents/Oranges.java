package com.vsk.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class Oranges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oranges);

        Bundle applesData = getIntent().getExtras();
        if (applesData==null){
            return;
        }
        String applesMessage = applesData.getString("applesMessage");
        final TextView orangesText = (TextView) findViewById(R.id.orangesText);
        orangesText.setText(applesMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Apples.class);
        startActivity(i);
    }

}

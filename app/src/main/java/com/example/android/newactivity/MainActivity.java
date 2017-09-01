package com.example.android.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }

    public void OnClickButtonListener(){
        button_sbm = (Button) findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //help to open new Activity Intent
                        Intent intent = new Intent("com.example.android.newactivity.SecondActivity");
                        //takes package name of SecondActivity!
                        startActivity(intent);
                    }
                }
        );

    }
}

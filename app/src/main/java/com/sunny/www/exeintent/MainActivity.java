package com.sunny.www.exeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonsimple = findViewById(R.id.buttonsimple);
        buttonsimple.setOnClickListener(this);
        Button buttonresult = findViewById(R.id.buttonresult);
        buttonresult.setOnClickListener(this);
        Button buttonlistview = findViewById(R.id.buttonlistview);
        buttonlistview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.buttonsimple:

                Intent intent = null;
                intent = new Intent(this, sub1.class);
                startActivity(intent);
                break;
            case R.id.buttonresult:
                Intent intent2 = null;
                intent2 = new Intent(this, sub2.class);
                startActivity(intent2);
                break;
            case R.id.buttonlistview:
                Intent intent3 = null;
                intent3 = new Intent(this, sub3.class);
                startActivity(intent3);
                break;
        }

    }
}

package com.example.desyntakarmilas.resepku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.desyntakarmilas.resepku.MenuActivity.GO_HOME;
import static com.example.desyntakarmilas.resepku.MenuActivity.GUDEG;
import static com.example.desyntakarmilas.resepku.MenuActivity.TO_DETAIL;

public class MinumanActivity extends AppCompatActivity implements View.OnClickListener{

    Button dawet, ronde, eskrim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        dawet = (Button) findViewById(R.id.btn_dawet);
        dawet.setOnClickListener(this);

        ronde = (Button) findViewById(R.id.btn_ronde);
        ronde.setOnClickListener(this);

        eskrim = (Button) findViewById(R.id.btn_eskrim);
        eskrim.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_dawet :
                Intent intent = new Intent(MinumanActivity.this, dawet.class);
                startActivity(intent);
                break;

            case R.id.btn_ronde:
                Intent intent2 = new Intent(MinumanActivity.this, ronde.class);
                startActivity(intent2);
                break;

            case R.id.btn_eskrim:
                Intent intent3 = new Intent(MinumanActivity.this, eskrim.class);
                startActivity(intent3);
                break;

        }

    }
}

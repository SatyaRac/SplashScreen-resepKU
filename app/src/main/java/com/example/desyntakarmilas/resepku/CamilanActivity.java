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

public class CamilanActivity extends AppCompatActivity implements View.OnClickListener{

    Button durian, bika, tempe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camilan);

        durian = (Button) findViewById(R.id.btn_pancake);
        durian.setOnClickListener(this);

        bika = (Button) findViewById(R.id.btn_bika);
        bika.setOnClickListener(this);

        tempe = (Button) findViewById(R.id.btn_kripik);
        tempe.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_pancake :
                Intent intent = new Intent(CamilanActivity.this, durian.class);
                startActivity(intent);
                break;

            case R.id.btn_bika:
                Intent intent2 = new Intent(CamilanActivity.this, bika.class);
                startActivity(intent2);
                break;

            case R.id.btn_kripik:
                Intent intent3 = new Intent(CamilanActivity.this, tempe.class);
                startActivity(intent3);
                break;

        }

    }
}

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

public class MasakanActivity extends AppCompatActivity implements View.OnClickListener{

    Button gudeg, rendang, tengkleng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masakan);

        gudeg = (Button) findViewById(R.id.btn_gudeg);
        gudeg.setOnClickListener(this);

        rendang = (Button) findViewById(R.id.btn_rendang);
        rendang.setOnClickListener(this);

        tengkleng = (Button) findViewById(R.id.btn_tengkleng);
        tengkleng.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_gudeg :
                Intent intent = new Intent(MasakanActivity.this, DetailActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_rendang:
                Intent intent2 = new Intent(MasakanActivity.this, rendang.class);
                startActivity(intent2);
                break;

            case R.id.btn_tengkleng:
                Intent intent3 = new Intent(MasakanActivity.this, tengkleng.class);
                startActivity(intent3);
                break;

        }

    }
}

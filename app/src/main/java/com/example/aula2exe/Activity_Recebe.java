package com.example.aula2exe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Recebe extends AppCompatActivity {

    private TextView txtGraus;
    private Float calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe);

        Intent intentRecebe = getIntent();

        Bundle parametro = intentRecebe.getExtras();

        if(parametro != null){
            Float graus = parametro.getFloat("chave_graus");

            calculo = ((graus * 9) / 5) + 32;

            TextView edt = (TextView) findViewById(R.id.txtGraus);

            edt.setText(calculo.toString());
        }
    }

}

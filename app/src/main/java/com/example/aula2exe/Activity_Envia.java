package com.example.aula2exe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Activity_Envia extends AppCompatActivity {

    private EditText edtGraus;
    private final String TAG = "Erro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGraus = (EditText) findViewById(R.id.edtGraus);
    }

    public void onClickBtnEnviar(View view){
        float graus = Float.parseFloat(edtGraus.getText().toString());

        Intent intentEnvia = new Intent(Activity_Envia.this, Activity_Recebe.class);
        Bundle parametro   = new Bundle();

        parametro.putFloat("chave_graus", graus);

        intentEnvia.putExtras(parametro);

        startActivity(intentEnvia);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy");
    }

    public void clickButton1(View view) {
        Log.v("TAG", "" + 1);
    }
}

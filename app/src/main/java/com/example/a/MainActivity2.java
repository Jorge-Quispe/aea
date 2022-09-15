package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    private EditText txt1, txt2;
        private EditText num1;
        private TextView txxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = (EditText) findViewById(R.id.txtuuser);
        txt2 = (EditText) findViewById(R.id.txtpass);
        num1 = (EditText) findViewById(R.id.txtraiz);
        txxt2 = findViewById(R.id.textView2);



    }
    public void ingresar(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();

        startActivity(i);
    }

}
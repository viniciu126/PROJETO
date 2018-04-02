package com.projeto.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tela_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_chat);
    }

    public void enviarParaContato(View view){
        Intent intent = new Intent(this, tela_contato.class);
        startActivity(intent);
    }
}

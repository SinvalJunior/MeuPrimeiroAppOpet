package com.example.opet.meuprimeiroappopet;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

    }

    public void clique(View view) {
        String texto = editText.getText().toString();
        if(view.getId() == R.id.btnClique){
            Toast.makeText(context: this, texto, Toast.LENGTH_SHORT).show();
        }
    }
}

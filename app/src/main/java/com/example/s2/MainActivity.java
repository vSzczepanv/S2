package com.example.s2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.email);
        EditText haslo = findViewById(R.id.haslo);
        EditText haslo2 = findViewById(R.id.haslo2);
        TextView show = findViewById(R.id.komunikat);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!email.getText().toString().contains("@"))
                    show.setText("Nieprawidłowy adres e-mai");
                else {
                    if(!haslo.getText().toString().equals(haslo2.getText().toString()) || haslo.getText().toString().isEmpty() || haslo2.getText().toString().isEmpty())
                        show.setText("Hasła się różnią");
                    else
                        show.setText("Witaj "+email.getText().toString());
            }
            }
        });
    }
}
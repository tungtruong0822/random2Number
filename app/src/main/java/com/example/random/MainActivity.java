package com.example.random;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtNumber;
    Button btnRandom;
    EditText edtNumber1, edtNumber2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnRandom.setOnClickListener(view -> {
            try {
                int min = Integer.parseInt(edtNumber1.getText().toString());
                int max = Integer.parseInt(edtNumber2.getText().toString());
                if (min >= max) {
                    Toast.makeText(this, "Nhập số thứ 1 < số thứ 2", Toast.LENGTH_SHORT).show();
                } else {
                    int number = new Random().nextInt(max - min + 1) + min;
                    txtNumber.setText(String.valueOf(number));
                }
            } catch (Exception ex) {
                Toast.makeText(this, "Nhập số thứ 1&2", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa() {
        txtNumber = findViewById(R.id.textViewNumber);
        btnRandom = findViewById(R.id.buttonRandom);
        edtNumber1 = findViewById(R.id.editTextNumberOne);
        edtNumber2 = findViewById(R.id.editTextNumberTwo);
    }
}
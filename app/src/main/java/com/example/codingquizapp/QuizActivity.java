package com.example.codingquizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizlayout);

    }

    public void submit(View view) {
        float i = 0;
        CheckBox true1 = findViewById(R.id.true1_1);
        CheckBox true2 = findViewById(R.id.true1_2);
        CheckBox true3 = findViewById(R.id.true1_3);
        RadioButton falseRadio2_2 = findViewById(R.id.falseRadio2_2);
        EditText editText3_1 = findViewById(R.id.editText3_1);
        RadioButton false4_2 = findViewById(R.id.false4_2);
        if (true1.isChecked() && true2.isChecked() && true3.isChecked()) {
            i += 1;
        }
        if (falseRadio2_2.isChecked()) {
            i += 1;
        }

        if (editText3_1.getText().toString().equals("void") || editText3_1.getText().toString().equals("Void") || editText3_1.getText().toString().equals("VOID")) {
            i += 1;
        }
        if (false4_2.isChecked()) {
            i += 1;
        }

        String toast = "You Scored " + (i / 4) * 100 + "% out and got " + i + " of the 4 Question's Correct";


        Toast.makeText(QuizActivity.this, toast, Toast.LENGTH_SHORT).show();


    }
}

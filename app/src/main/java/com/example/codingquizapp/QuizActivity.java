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
        float score = 0;
        CheckBox checkBox1_1 = findViewById(R.id.true1_1);
        CheckBox checkBox1_2 = findViewById(R.id.true1_2);
        CheckBox checkBox1_3 = findViewById(R.id.true1_3);
        RadioButton falseRadio2_2 = findViewById(R.id.falseRadio2_2);
        EditText editText3_1 = findViewById(R.id.editText3_1);
        RadioButton falseRadio4_2 = findViewById(R.id.falseRadio4_2);
        RadioButton trueRadio4_1 = findViewById(R.id.trueRadio4_1);
        RadioButton trueRadio2_1 = findViewById(R.id.trueRadio2_1);
        if (checkBox1_1.isChecked() && checkBox1_2.isChecked() && checkBox1_3.isChecked()) {
            score += 1;
        }
        if (falseRadio2_2.isChecked() && !trueRadio2_1.isChecked()) {
            score += 1;
        }

        if (editText3_1.getText().toString().equals("void") || editText3_1.getText().toString().equals("Void") || editText3_1.getText().toString().equals("VOID")) {
            score += 1;
        }
        if (falseRadio4_2.isChecked() && !trueRadio4_1.isChecked()) {
            score += 1;
        }

        String toast = "You Scored " + (score / 4) * 100 + "% out and got " + score + " of the 4 Question's Correct";


        Toast.makeText(QuizActivity.this, toast, Toast.LENGTH_SHORT).show();


    }
}

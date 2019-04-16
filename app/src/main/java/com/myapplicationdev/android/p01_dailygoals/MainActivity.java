package com.myapplicationdev.android.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup rg0 = findViewById(R.id.radioGrp0);
                int selectedButtonId0 = rg0.getCheckedRadioButtonId();
                RadioButton rb0 = findViewById(selectedButtonId0);



                RadioGroup rg1 = findViewById(R.id.radioGrp1);
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(selectedButtonId1);


                RadioGroup rg2 = findViewById(R.id.radioGrp2);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selectedButtonId2);

                EditText etText = findViewById(R.id.editText3);
                String[] info = {rb0.getText().toString(),rb1.getText().toString(),rb2.getText().toString(),etText.getText().toString()};

                Intent i = new Intent(MainActivity.this,Summary.class);

                i.putExtra("info",info);
                startActivity(i);


            }
        });

    }
}

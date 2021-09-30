package com.example.standardtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        TextView textView1 = findViewById(R.id.textView);

        EditText editText1 = findViewById(R.id.editText1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setTextColor(Color.argb(255,255,0,0));
                Toast.makeText(getApplicationContext(),"RED로 변경됨",Toast.LENGTH_LONG).show();
            }
        });

        CheckBox checkBox = findViewById(R.id.checkBox);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int[] one = new int[4];

                one[0] = 10;
                one[3] = 20;

                int[][] two = new int[3][4];

                two[0][0] = 100;
                two[2][3] = 200;

                try {
                    for(int i = 0; i<one.length; i++) {
                        Toast.makeText(getApplicationContext(),one[i],Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Resources.NotFoundException notFoundException) {
                    for(int i = 0; i<one.length; i++) {
                        Toast.makeText(getApplicationContext(),Integer.toString(one[i]),Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e) {
                    Log.i("MainActivity", "Another Exception");
                    e.printStackTrace();
                }

                try{
                    for(int i : one) {
                        Toast.makeText(getApplicationContext(),i,Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e) {
                    for(int i : one) {
                        Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (button3.isEnabled() == true) {
                        button2.setVisibility(View.INVISIBLE);
                        button3.setClickable(true);
                    }
                    button3.setEnabled(true);
                }
                catch (Exception e) {

                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                String string1 = editText1.getText().toString();
                Toast.makeText(getApplicationContext(), string1, Toast.LENGTH_SHORT).show();
                }

                catch (Exception e) {

                }
            }
        });
        
    }
}
package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    private TextView gpa;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gpa=(TextView)findViewById(R.id.textView11);

        String gpa1,comments1;
        gpa1=getIntent().getExtras().getString("value");
        gpa.setText(gpa1);


    }

}

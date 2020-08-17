package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    String [] listofgrades={"Select","S","A","B","C","D","E","F"};
    final String [] text=new String[9];
    float gpa;
    private Button calculate;
    DecimalFormat precision=new DecimalFormat("0.00");
    public void result()
    {


            float grades[]=new float[9];
            for(int i=0;i<9;i++)
            {
                switch(text[i])
                {
                    case "S":grades[i]=10;break;
                    case "A":grades[i]=9;break;
                    case "B":grades[i]=8;break;
                    case "C":grades[i]=7;break;
                    case "D":grades[i]=6;break;
                    case "E":grades[i]=5;break;
                    case "F":grades[i]=0;break;
                    default:grades[i]=0;break;

                }
            }
            gpa= (float) (((grades[0]*3.0)+(grades[1]*3.0)+(grades[2]*4.0)+(grades[3]*3.0)+(grades[4]*4.0)+(grades[5]*3)+(grades[6]*1)+(grades[7]*1.5)+(grades[8]*1.5))/(24.0));


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=(Button)findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,listofgrades);
        Spinner spinner1=findViewById(R.id.spin_text1);
        Spinner spinner2=findViewById(R.id.spin_text2);
        Spinner spinner3=findViewById(R.id.spin_text3);
        Spinner spinner4=findViewById(R.id.spin_text4);
        Spinner spinner5=findViewById(R.id.spin_text5);
        Spinner spinner6=findViewById(R.id.spin_text6);
        Spinner spinner7=findViewById(R.id.spin_text7);
        Spinner spinner8=findViewById(R.id.spin_text8);
        Spinner spinner9=findViewById(R.id.spin_text9);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               @Override
                                               public void onItemSelected(AdapterView<?> spinner1, View view, int position, long id) {
                                                   text[0]=spinner1.getItemAtPosition(position).toString();
                                                   Toast.makeText(spinner1.getContext(),text[0],Toast.LENGTH_SHORT).show();

                                               }


                                               public void onNothingSelected(AdapterView<?> parent) {

                                               }
                                           });
                spinner2.setAdapter(arrayAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[1]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[1],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3.setAdapter(arrayAdapter);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[2]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[2],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner4.setAdapter(arrayAdapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[3]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[3],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner5.setAdapter(arrayAdapter);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[4]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[4],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner6.setAdapter(arrayAdapter);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[5]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[5],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner7.setAdapter(arrayAdapter);
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[6]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[6],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner8.setAdapter(arrayAdapter);
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[7]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[7],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner9.setAdapter(arrayAdapter);
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text[8]=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),text[8],Toast.LENGTH_SHORT).show();
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void openActivity2(){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        result();
        intent.putExtra("value", String.valueOf(precision.format(gpa)));
        startActivity(intent);

    }


}

package com.example.splashscreen_animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {
    EditText name,email,password,phone;
    Spinner spin;
    String[] Countries = { "India", "USA", "Australia", "UK", "Italy", "Ireland", "Africa" };
    String[] users = { "David", "TOM", "Gorge", "Peter", "Steve" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.editText4);
        email=findViewById(R.id.editText5);
        password=findViewById(R.id.editText6);
        phone=findViewById(R.id.editText7);
        spin=findViewById(R.id.spinr);
//        AutoCompleteTextView
        ArrayAdapter<String> adapter=new ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,Countries);
        AutoCompleteTextView atc=findViewById(R.id.autoCompleteTextView2);
        atc.setThreshold(1);
        atc.setAdapter(adapter);
        atc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selected Item:"+parent.getSelectedItem(),Toast.LENGTH_LONG).show();
            }
        });
//        AutoCompleteTextView
//        ToggleButton
        final ToggleButton tb=findViewById(R.id.toggleButton2);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tb.setTextOn("ONN");
                    Toast.makeText(getApplicationContext(),"IS ON",Toast.LENGTH_SHORT).show();
                }else{
                    tb.setTextOff("OFF");
                    Toast.makeText(getApplicationContext(),"IS Off",Toast.LENGTH_SHORT).show();
                }
            }
        });
//        RadioButton

        RadioButton male,female;
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        RadioGroup rad=findViewById(R.id.radgrp);
        rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb=(RadioButton)findViewById(checkedId);
                Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
//        Spinner
        ArrayAdapter<String> spinr=new ArrayAdapter <>(this,android.R.layout.simple_spinner_item,users);
        spinr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(spinr);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Selected User: "+users[position] ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView <?> parent) {

            }
        });
        Button btn=findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Constraint.class);
                startActivity(i);
            }
        });
//        Switch
        Switch swtch=findViewById(R.id.switch2);
        swtch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(),"Switch is On",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Switch is OFF",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
//    RadioGroup Method
//    public void onRadioButtonClick(View view){
//        boolean checked = ((RadioButton) view).isChecked();
//        String str="";
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.male:
//                if(checked)
//                    str = "Male";
//                break;
//            case R.id.female:
//                if(checked)
//                    str = "Female";
//                break;
//        }
//        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
//    }


    }


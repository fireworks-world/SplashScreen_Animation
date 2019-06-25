package com.example.splashscreen_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
String[] phones={"MI", "SAMSUNG", "NOKIA", "OPPO", "ACER", "ASUS", "ITECH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       ArrayAdapter<String> list=new ArrayAdapter <String>(this,R.layout.list_view,phones);
       ListView listvw=(ListView) findViewById(R.id.list_view);
       listvw.setAdapter(list);

    }
}

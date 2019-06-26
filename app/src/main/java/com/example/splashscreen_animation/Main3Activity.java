package com.example.splashscreen_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
String[] phones={"MI", "SAMSUNG", "NOKIA", "OPPO", "ACER", "ASUS", "ITECH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       ArrayAdapter<String> list=new ArrayAdapter <String>(this,R.layout.list_view,phones);
       ListView listvw=(ListView) findViewById(R.id.list_view);
       listvw.setAdapter(list);

        GridView gridview=findViewById(R.id.gridView);
        gridview.setAdapter(new AdapterForImage(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Position "+position,Toast.LENGTH_LONG).show();
            }
        });

    }
}

package com.sonukumariit8.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"This is ","Item","Item2","Another item","mail1","mail2","mail4","mail5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        // using built in array adapter
       // ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
       // listView.setAdapter(ad);

        // Using our custom adaptor
        KabeerAdapter ad=new KabeerAdapter(this,R.layout.my_kabeer_layout,arr);
        listView.setAdapter(ad);
        //Listener on arrayAdapter Listview
    //    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    //        @Override
    //        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    //            Toast.makeText(MainActivity.this, "You Clicked On:"+ position, Toast.LENGTH_SHORT).show();
    //        }
    //    });
    }
}
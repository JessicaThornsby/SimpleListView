package com.jessicathornsby.listview;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    String[] countryArray = {"Argentina" , "Armenia", "Australia", "Belgium" ,"Brazil" ,"Canada" , "China" ,
            "Denmark" , "Estonia" , "Finland" , "France" , "Greece" , "Hungary" , "Iceland" , "India" ,
            "Indonesia" , "Italy" , "Japan" , "Kenya" , "Latvia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView)findViewById(R.id.myListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, countryArray);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "You've selected \n" + parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_LONG).show();

            }
        }
        )
                ;
    }}

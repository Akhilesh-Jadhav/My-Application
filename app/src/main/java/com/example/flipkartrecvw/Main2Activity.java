package com.example.flipkartrecvw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    GridView gridView;
    String[] Categories={"Electronics","Furniture","Clothing","Baggry"};
    int[] categoryimage={R.drawable.electronics,R.drawable.furniture,R.drawable.clothing,R.drawable.baggry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView=findViewById(R.id.grid_view);
        MainAdapter adapter=new MainAdapter(Main2Activity.this,Categories,categoryimage);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You clicked"+Categories[+position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}

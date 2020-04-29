package com.example.flipkartrecvw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerview=findViewById(R.id.recyclerView);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        myAdapter=new MyAdapter(this,getMyList());
        mRecyclerview.setAdapter(myAdapter);
    }
    private ArrayList<Model>getMyList(){
        ArrayList<Model> models=new ArrayList<>();
        Model m=new Model();
        m.setTitle("Bagrry's Corn Flakes Plus Original and Healthier");
        m.setPrice("Rs230");
        m.setWeight("800 g Pouch");
        m.setImg(R.drawable.cornflakes);
        m.setStrikePrice("330");
        models.add(m);


        Model m1=new Model();
        m1.setTitle("Bagrry's Crunchy Muesli Fruit and Nut with Cranberries");
        m1.setPrice("Rs299");
        m1.setWeight("750 g Pouch");
        m1.setImg(R.drawable.crunchymuseli);
        m1.setStrikePrice("470");
        models.add(m1);


        Model m2=new Model();
        m2.setTitle("Bagrry's No Added Sugar Crunchy Muesli");
        m2.setPrice("Rs425");
        m2.setWeight("1 kg Plastic Bottle");
        m2.setImg(R.drawable.jar);
        m2.setStrikePrice("575");
        models.add(m2);
        return models;


    };
}

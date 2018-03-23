package com.org.curesoft.recyclerviewrrevktm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<ProgrammingLanguage> pl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.recycle);
        pl=new ArrayList<ProgrammingLanguage>();
        ProgrammingLanguage a=new ProgrammingLanguage(R.drawable.image1,"Asp.Net");
        ProgrammingLanguage php=new ProgrammingLanguage(R.drawable.image2,"php");
        ProgrammingLanguage java=new ProgrammingLanguage(R.drawable.image3,"java");
        pl.add(a);
        pl.add(php);
        pl.add(java);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new CustomAdapter(pl,getApplicationContext()));


    }
}

package com.example.qube.gitworkflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Actor> arrayList = new ArrayList<>();

        arrayList.add(new Actor("one", "two", "three"));
        arrayList.add(new Actor("one", "two", "three"));
        arrayList.add(new Actor("one", "two", "three"));
        arrayList.add(new Actor("one", "two", "three"));
        arrayList.add(new Actor("one", "two", "three"));
        arrayList.add(new Actor("one", "two", "three"));

        ListView listView = (ListView) findViewById(R.id.main_listView);

        ActorAdapter actorAdapter = new ActorAdapter(MainActivity.this, R.layout.list_object, arrayList);

        listView.setAdapter(actorAdapter);

    }
}

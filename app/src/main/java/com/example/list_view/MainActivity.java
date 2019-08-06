package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //a List of type hero for holding list items
    List<Hero> heroList;

    //the listview
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));

        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.costum, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);

        //ListView yourListView = (ListView) findViewById(R.id.itemListView);

        // get data from the table by the ListAdapter

        //ListAdapter customAdapter = new ListAdapter(this, R.layout.itemlistrow, List<yourItem>);

        //yourListView .setAdapter(customAdapter);
    }
}
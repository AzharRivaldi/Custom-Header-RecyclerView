package com.azhar.headerrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TypeListItem> items = new ArrayList<>();
    DataAdapter dataAdapter;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItems = findViewById(R.id.rvItems);
        rvItems.setHasFixedSize(true);
        rvItems.setLayoutManager(new LinearLayoutManager(this));

        dataAdapter = new DataAdapter(items);
        rvItems.setAdapter(dataAdapter);

        items.add(new ModelHeader("Header 1"));
        items.add(new ModelItem("Item 1"));
        items.add(new ModelItem("Item 2"));
        items.add(new ModelItem("Item 3"));
        items.add(new ModelItem("Item 4"));
        items.add(new ModelItem("Item 5"));
        items.add(new ModelItem("Item 6"));

        items.add(new ModelHeader("Header 2"));
        items.add(new ModelItem("Item 7"));
        items.add(new ModelItem("Item 8"));
        items.add(new ModelItem("Item 9"));
        items.add(new ModelItem("Item 10"));
        items.add(new ModelItem("Item 11"));
        items.add(new ModelItem("Item 12"));

        items.add(new ModelHeader("Header 3"));
        items.add(new ModelItem("Item 13"));
        items.add(new ModelItem("Item 14"));
        items.add(new ModelItem("Item 15"));
        items.add(new ModelItem("Item 16"));
        items.add(new ModelItem("Item 17"));
        items.add(new ModelItem("Item 18"));

        items.add(new ModelHeader("Header 4"));
        items.add(new ModelItem("Item 19"));
        items.add(new ModelItem("Item 20"));
        items.add(new ModelItem("Item 21"));
        items.add(new ModelItem("Item 22"));
        items.add(new ModelItem("Item 23"));
        items.add(new ModelItem("Item 24"));

        dataAdapter.notifyDataSetChanged();
    }
}
package com.example.dilwar.textwatcherrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        rcyAdapter adapter = new rcyAdapter(makeDummyData());
        recyclerView.setAdapter(adapter);
    }

    private List<Names> makeDummyData() {
        List<Names> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add(new Names("", false));
        }
        return names;
    }
}

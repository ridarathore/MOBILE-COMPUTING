package com.example.recyclerview_191086_rida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView_191086);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter(getLayoutInflater(),getItems()));
    }
    private ArrayList<String> getItems() {
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add("Item "+(i+1));
        }
        return items;
    }
}

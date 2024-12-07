package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lview);

        ArrayList<String> language=new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("C");
        language.add("C++");
        language.add("JavaScript");
        language.add("Kotlin");
        language.add("HTML");
        language.add("CSS");
        language.add("PHP");
        language.add("XML");
        language.add("C#");
        language.add("React");
        language.add("Go (Golang)");
        language.add("Rust");
        language.add("SQL");
        language.add("Dart");
        language.add("Ruby");
        language.add("TypeScript");
        language.add("R");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,language);
        listView.setAdapter(adapter);


    }
}
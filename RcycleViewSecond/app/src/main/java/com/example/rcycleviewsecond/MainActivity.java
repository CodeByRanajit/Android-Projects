package com.example.rcycleviewsecond;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    MyAdapter adapter;

    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        rv=findViewById(R.id.rv);
       //rv.setLayoutManager(new LinearLayoutManager(this));

//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        rv.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rv.setLayoutManager(gridLayoutManager);
        adapter=new MyAdapter(list(),getApplicationContext());
        rv.setAdapter(adapter);


        searchView=findViewById(R.id.srv);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String quary) {
                adapter.getFilter().filter(quary);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nt) {

                adapter.getFilter().filter(nt);
                return false;
            }
        });


        
    }
    public ArrayList<Model> list(){
        ArrayList<Model> al=new ArrayList<>();

        Model m1=new Model();
        m1.setTx1("java");
        m1.setTx2("programming language");
        m1.setImv(R.drawable.download);
        al.add(m1);

        Model m2=new Model();
        m2.setTx1("java");
        m2.setTx2("programming language");
        m2.setImv(R.drawable.download);
        al.add(m2);

        Model m3=new Model();
        m3.setTx1("c++");
        m3.setTx2("programming language");
        m3.setImv(R.drawable.download);
        al.add(m3);

        Model m4=new Model();
        m4.setTx1("Python");
        m4.setTx2("programming language");
        m4.setImv(R.drawable.download);
        al.add(m4);

        Model m5=new Model();
        m5.setTx1("c");
        m5.setTx2("programming language");
        m5.setImv(R.drawable.download);
        al.add(m5);
        Model m6=new Model();
        m6.setTx1("java");
        m6.setTx2("programming language");
        m6.setImv(R.drawable.download);
        al.add(m6);


        Model m7=new Model();
        m7.setTx1("java");
        m7.setTx2("programming language");
        m7.setImv(R.drawable.download);
        al.add(m7);

        Model m8=new Model();
        m8.setTx1("HTML");
        m8.setTx2("programming language");
        m8.setImv(R.drawable.download);
        al.add(m8);

        Model m9=new Model();
        m9.setTx1("Kotlin");
        m9.setTx2("programming language");
        m9.setImv(R.drawable.download);
        al.add(m9);

        Model m10=new Model();
        m10.setTx1("Python");
        m10.setTx2("programming language");
        m10.setImv(R.drawable.download);
        al.add(m10);

        return al;


    }
}
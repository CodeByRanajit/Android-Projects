package com.example.vmarket;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class HomePAge extends AppCompatActivity {
    EditText your_location;

    RecyclerView rv,home_rv;
    MenuAdapter menuAdapter;
    HomeAdapter homeAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        your_location=findViewById(R.id.urLoc);
        your_location.setText(String.valueOf(getIntent().getStringExtra("location")));


        rv=findViewById(R.id.rv);
        home_rv=findViewById(R.id.home_rv);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(linearLayoutManager);
        menuAdapter=new MenuAdapter(list(),getApplicationContext());
        rv.setAdapter(menuAdapter);


        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        home_rv.setLayoutManager(gridLayoutManager);
        homeAdapter=new HomeAdapter(list1(),getApplicationContext());
        home_rv.setAdapter(homeAdapter);


    }

    public ArrayList<MenuModel> list() {
        ArrayList<MenuModel> al = new ArrayList<>();

        MenuModel m1 = new MenuModel();
        m1.setMenu_img(R.drawable.cat1);
        m1.setMenu_desc("Vagetable");
        al.add(m1);

        MenuModel m2 = new MenuModel();
        m2.setMenu_img(R.drawable.cat2);
        m2.setMenu_desc("Fruits");
        al.add(m2);

        MenuModel m3 = new MenuModel();
        m3.setMenu_img(R.drawable.cat3);
        m3.setMenu_desc("Dairy");
        al.add(m3);

        MenuModel m4 = new MenuModel();
        m4.setMenu_img(R.drawable.cat4);
        m4.setMenu_desc("Drinks");
        al.add(m4);

        MenuModel m5= new MenuModel();
        m5.setMenu_img(R.drawable.cat5);
        m5.setMenu_desc("Grairy");
        al.add(m5);

        return al;

    }

    public ArrayList<HomeModel> list1() {
        ArrayList<HomeModel> all = new ArrayList<>();

        HomeModel m1 = new HomeModel();
        m1.setHome_img(R.drawable.grapes);
        m1.setHome_desc1("Fresh Grapes");
        m1.setHome_desc2("120/kg");
        all.add(m1);

        HomeModel m2 = new HomeModel();
        m2.setHome_img(R.drawable.orange);
        m2.setHome_desc1("Fresh Orange");
        m2.setHome_desc2("80/kg");
        all.add(m2);

        HomeModel m3 = new HomeModel();
        m3.setHome_img(R.drawable.berry);
        m3.setHome_desc1("Fresh Berry");
        m3.setHome_desc2("60/kg");
        all.add(m3);

        HomeModel m4= new HomeModel();
        m4.setHome_img(R.drawable.pineaplle);
        m4.setHome_desc1("Fresh Pineapple");
        m4.setHome_desc2("100/kg");
        all.add(m4);

        HomeModel m5= new HomeModel();
        m5.setHome_img(R.drawable.watermelon);
        m5.setHome_desc1("Fresh Watermelom");
        m5.setHome_desc2("50/kg");
        all.add(m5);

        HomeModel m6 = new HomeModel();
        m6.setHome_img(R.drawable.strawberry);
        m6.setHome_desc1("Fresh Strawberry");
        m6.setHome_desc2("150/kg");
        all.add(m6);

        HomeModel m7= new HomeModel();
        m7.setHome_img(R.drawable.pineaplle);
        m7.setHome_desc1("Fresh Pneapple");
        m7.setHome_desc2("100/kg");
        all.add(m7);

        HomeModel m8= new HomeModel();
        m8.setHome_img(R.drawable.apple);
        m8.setHome_desc1("Fresh Apple");
        m8.setHome_desc2("90/kg");
        all.add(m8);


        HomeModel m9= new HomeModel();
        m9.setHome_img(R.drawable.mango);
        m9.setHome_desc1("Fresh Mango");
        m9.setHome_desc2("50/kg");
        all.add(m9);


        HomeModel m10= new HomeModel();
        m10.setHome_img(R.drawable.papaya);
        m10.setHome_desc1("Fresh Papaya");
        m10.setHome_desc2("40/kg");
        all.add(m10);




        return all;

    }
}
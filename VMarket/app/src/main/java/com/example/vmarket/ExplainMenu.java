package com.example.vmarket;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExplainMenu extends AppCompatActivity {
    SearchView srv;
    String category;
    RecyclerView rcv;
    ExplainAdapter explainAdapter;
    ImageView back_to_home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_explain_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        back_to_home=findViewById(R.id.back_to_home);
        back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ExplainMenu.this, HomePAge.class);
                startActivity(intent);
            }
        });


        srv=findViewById(R.id.srvv);
        rcv=findViewById(R.id.rvv);

        category = String.valueOf(getIntent().getStringExtra("CATEGORY"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
        explainAdapter=new ExplainAdapter(listt(),getApplicationContext());
        rcv.setAdapter(explainAdapter);


    }

    public ArrayList<ExplainModel> listt() {
        ArrayList<ExplainModel> al = new ArrayList<>();
        switch (category) {
            case "Vagetable":
                ExplainModel m1 = new ExplainModel();
                m1.setExplain_img(R.drawable.onion_leaves);
                m1.setExplain_desc1("Fresh Oninon Leaves");
                m1.setExplain_desc2("$40/kg");
                al.add(m1);

                ExplainModel m2 = new ExplainModel();
                m2.setExplain_img(R.drawable.cabage);
                m2.setExplain_desc1("Fresh Cabage");
                m2.setExplain_desc2("$80/kg");
                al.add(m2);

                ExplainModel m3 = new ExplainModel();
                m3.setExplain_img(R.drawable.lemon);
                m3.setExplain_desc1("Fresh Lemon");
                m3.setExplain_desc2("$8/pice");
                al.add(m3);

                ExplainModel m4 = new ExplainModel();
                m4.setExplain_img(R.drawable.white_radish);
                m4.setExplain_desc1("Fresh White Radish");
                m4.setExplain_desc2("$50/brunch");
                al.add(m4);

                ExplainModel m5 = new ExplainModel();
                m5.setExplain_img(R.drawable.garlic);
                m5.setExplain_desc1("Fresh Garlic");
                m5.setExplain_desc2("$230/kg");
                al.add(m5);

                ExplainModel m6 = new ExplainModel();
                m6.setExplain_img(R.drawable.spinach);
                m6.setExplain_desc1("Fresh Spinach");
                m6.setExplain_desc2("$20/brunch");
                al.add(m6);

                ExplainModel m7 = new ExplainModel();
                m7.setExplain_img(R.drawable.potato);
                m7.setExplain_desc1("Fresh Potato");
                m7.setExplain_desc2("$360/kg");
                al.add(m7);

                ExplainModel m8 = new ExplainModel();
                m8.setExplain_img(R.drawable.beans);
                m8.setExplain_desc1("Fresh Beans");
                m8.setExplain_desc2("$53/kg");
                al.add(m8);

                ExplainModel m9 = new ExplainModel();
                m9.setExplain_img(R.drawable.bit);
                m9.setExplain_desc1("Fresh Bit");
                m9.setExplain_desc2("$48/kg");
                al.add(m9);

                ExplainModel m10= new ExplainModel();
                m10.setExplain_img(R.drawable.cilantro);
                m10.setExplain_desc1("Fresh Cilantro");
                m10.setExplain_desc2("$80/kg");
                al.add(m10);

                ExplainModel m11 = new ExplainModel();
                m11.setExplain_img(R.drawable.cauliflower);
                m11.setExplain_desc1("Fresh Cauli Flower");
                m11.setExplain_desc2("$100/kg");
                al.add(m11);

                ExplainModel m12 = new ExplainModel();
                m12.setExplain_img(R.drawable.ginger);
                m12.setExplain_desc1("Fresh Ginger");
                m12.setExplain_desc2("$65/kg");
                al.add(m12);

                ExplainModel m13= new ExplainModel();
                m13.setExplain_img(R.drawable.dynasyies);
                m13.setExplain_desc1("Fresh Dynasyies");
                m13.setExplain_desc2("$55/kg");
                al.add(m13);

                ExplainModel m14 = new ExplainModel();
                m14.setExplain_img(R.drawable.tomato);
                m14.setExplain_desc1("Fresh Tomato");
                m14.setExplain_desc2("$60/kg");
                al.add(m14);

                ExplainModel m15= new ExplainModel();
                m15.setExplain_img(R.drawable.carrot);
                m15.setExplain_desc1("Fresh Carrot");
                m15.setExplain_desc2("$40/kg");
                al.add(m15);

                ExplainModel m16 = new ExplainModel();
                m16.setExplain_img(R.drawable.brinjal);
                m16.setExplain_desc1("Fresh Brinjal");
                m16.setExplain_desc2("$65/kg");
                al.add(m16);

                ExplainModel m17= new ExplainModel();
                m17.setExplain_img(R.drawable.onion);
                m17.setExplain_desc1("Fresh Cabage");
                m17.setExplain_desc2("$80/kg");
                al.add(m17);



                break;

            case "Fruits":

                ExplainModel mf1 = new ExplainModel();
                mf1.setExplain_img(R.drawable.apple);
                mf1.setExplain_desc1("Fresh Apple");
                mf1.setExplain_desc2("120/kg");
                al.add(mf1);

                ExplainModel mf2 = new ExplainModel();
                mf2.setExplain_img(R.drawable.orange);
                mf2.setExplain_desc1("Fresh Orange");
                mf2.setExplain_desc2("80/kg");
                al.add(mf2);

                ExplainModel mf3 = new ExplainModel();
                mf3.setExplain_img(R.drawable.berry);
                mf3.setExplain_desc1("Fresh Berry");
                mf3.setExplain_desc2("60/kg");
                al.add(mf3);

                ExplainModel mf4= new ExplainModel();
                mf4.setExplain_img(R.drawable.pineaplle);
                mf4.setExplain_desc1("Fresh Pineapple");
                mf4.setExplain_desc2("100/kg");
                al.add(mf4);

                ExplainModel mf5= new ExplainModel();
                mf5.setExplain_img(R.drawable.watermelon);
                mf5.setExplain_desc1("Fresh Watermelom");
                mf5.setExplain_desc2("50/kg");
                al.add(mf5);

                ExplainModel mf6 = new ExplainModel();
                mf6.setExplain_img(R.drawable.strawberry);
                mf6.setExplain_desc1("Fresh Strawberry");
                mf6.setExplain_desc2("150/kg");
                al.add(mf6);

                ExplainModel mf7= new ExplainModel();
                mf7.setExplain_img(R.drawable.pineaplle);
                mf7.setExplain_desc1("Fresh Pneapple");
                mf7.setExplain_desc2("100/kg");
                al.add(mf7);

                ExplainModel mf8= new ExplainModel();
                mf8.setExplain_img(R.drawable.grapes);
                mf8.setExplain_desc1("Fresh Grapes");
                mf8.setExplain_desc2("90/kg");
                al.add(mf8);


                ExplainModel mf9= new ExplainModel();
                mf9.setExplain_img(R.drawable.mango);
                mf9.setExplain_desc1("Fresh Mango");
                mf9.setExplain_desc2("50/kg");
                al.add(mf9);


                ExplainModel mf10= new ExplainModel();
                mf10.setExplain_img(R.drawable.papaya);
                mf10.setExplain_desc1("Fresh Papaya");
                mf10.setExplain_desc2("40/kg");
                al.add(mf10);


                break;

            case "Dairy":

                break;

            case "Drinks":

                break;

            case "Grairy":

                break;

        }



        return al;
    }
    }
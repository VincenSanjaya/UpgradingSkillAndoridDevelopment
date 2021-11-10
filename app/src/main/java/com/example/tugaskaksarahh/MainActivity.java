package com.example.tugaskaksarahh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMakanan adapter;
    private ArrayList<ModelMakanan> orangArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.rltopup);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TopUpPage.class));
            }
        });


        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rvlistcontent);

        adapter = new AdapterMakanan(orangArrayList);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        orangArrayList = new ArrayList<>();
        orangArrayList.add(new ModelMakanan("Seblak", "Enak Pokoknya Mah", "4.5"));
        orangArrayList.add(new ModelMakanan("Martabak Telor", "Muantep Sip Dikit Minyak", "4.0"));
        orangArrayList.add(new ModelMakanan("Soto Kebo", "Kebo-nya Empuk Sekali", "4.8"));
        orangArrayList.add(new ModelMakanan("Bakso Urat", "Daging Lebih Banyak", "5.0"));
    }
}

package com.saroj.recycleremailviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        List<Gmails> gmailsList =new ArrayList<>();
        gmailsList.add(new Gmails("Tony Kroos","00000",R.drawable.football,"21:00"));
        gmailsList.add(new Gmails("Iker Casillas","00000",R.drawable.volleyball,"10:38"));
        gmailsList.add(new Gmails("Marcelo","00000",R.drawable.basketball,"15:20"));

        GmailAdapter gmailAdapter =new GmailAdapter(this, gmailsList);
        recyclerView.setAdapter(gmailAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}

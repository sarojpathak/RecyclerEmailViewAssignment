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
        gmailsList.add(new Gmails("Obama","This is test message",R.drawable.obama,"21:00"));
        gmailsList.add(new Gmails("Trump","This is test message",R.drawable.trump,"10:38"));
        gmailsList.add(new Gmails("Newton","This is test message",R.drawable.newton,"15:20"));

        GmailAdapter gmailAdapter =new GmailAdapter(this, gmailsList);
        recyclerView.setAdapter(gmailAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}

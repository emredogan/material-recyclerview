package com.emredogan.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    String [] name = {

            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",


    };

    String [] desc = {

            "Desc1",
            "Desc2",
            "Desc3",
            "Desc4",
            "Desc5",
            "Desc6",


    };


    int [] image = {

            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_id);

        setSupportActionBar(toolbar);

        List<User> sampleUser = new ArrayList<>();

        for(int i=0;i<name.length;i++) {

            User user = new User();
            user.username = name[i];
            user.userDescription = desc[i];
            user.userImage = image[i];

            sampleUser.add(user);

        }


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext(),sampleUser));
    }
}

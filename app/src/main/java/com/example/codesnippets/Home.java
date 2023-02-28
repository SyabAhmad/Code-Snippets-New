package com.example.codesnippets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Home extends AppCompatActivity {

    protected RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<post> post = new ArrayList<>();
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 21, 131));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 21, 131));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.carbon, R.drawable.like1, R.drawable.dislike1,R.drawable.download, 321, 1123));
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new adopter(getApplicationContext(), post));


    }
}
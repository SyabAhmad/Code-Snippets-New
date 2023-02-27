package com.example.codesnippets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    protected RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        List<post> post = new ArrayList<>();
        post.add(new post(R.drawable.post1, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post1, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.post1, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 21, 131));
        post.add(new post(R.drawable.post1, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post3, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 333));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 21, 131));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        post.add(new post(R.drawable.post4, R.drawable.like, R.drawable.dislike,R.drawable.download, 621, 193));
        post.add(new post(R.drawable.post2, R.drawable.like, R.drawable.dislike,R.drawable.download, 321, 1123));
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adopter(getApplicationContext(), post));



    }
}
package com.example.codesnippets;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class holder extends RecyclerView.ViewHolder {

    ImageView postimg;
    ImageView likeimg;
    ImageView dislikeimg;
    ImageView downloadImg;
    TextView likeValue;
    TextView dislikeValue;
    public holder(@NonNull View itemView) {
        super(itemView);

        postimg = itemView.findViewById(R.id.postImg);
        likeimg = itemView.findViewById(R.id.like1);
        dislikeimg = itemView.findViewById(R.id.dislike1);
        downloadImg = itemView.findViewById(R.id.download);
        likeValue = itemView.findViewById(R.id.likeValue);
        dislikeValue = itemView.findViewById(R.id.dislikeValue);
    }
}

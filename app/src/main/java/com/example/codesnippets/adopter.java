package com.example.codesnippets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adopter extends RecyclerView.Adapter<holder> {

    Context context;
    List<post> list;

    public adopter(Context context, List<post> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new holder(LayoutInflater.from(context).inflate(R.layout.postview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.postimg.setImageResource(list.get(position).getPostImg());
        holder.likeimg.setImageResource(list.get(position).getLikesImg());
        holder.dislikeimg.setImageResource(list.get(position).getDislikesImg());
        holder.downloadImg.setImageResource(list.get(position).getDownloadImg());
//        holder.likeValue.setText(list.get(position).getLikesValue());
//        holder.dislikeValue.setText(list.get(position).getDislikesValue());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

package com.example.recyclerview;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Student> student;

    public Adapter(ArrayList<Student> student) {
        this.student = student;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView ok = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new ViewHolder(ok);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.imageView);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), student.get(position).getImage());
        imageView.setImageDrawable(drawable);
        TextView name, lastName;
        name = (TextView) cardView.findViewById(R.id.textView);
        lastName = (TextView) cardView.findViewById(R.id.textView2);
        name.setText("Name - " + student.get(position).getName());
        lastName.setText("Last name - " + student.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;


        public ViewHolder(@NonNull CardView itemView) {
            super(itemView);
            cardView = itemView;
        }
    }
}

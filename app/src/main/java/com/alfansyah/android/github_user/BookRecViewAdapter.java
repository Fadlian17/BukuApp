package com.alfansyah.android.github_user;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookRecViewAdapter extends RecyclerView.Adapter<BookRecViewAdapter.viewHolder> {
    private static final String TAG = "BookRecViewAdapter";


    private ArrayList<Book> books = new ArrayList<>();
    private Context mContext;

    public BookRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_box,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder:Called");
        holder.txtName.setText(books.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public BookRecViewAdapter(ArrayList<Book> books) {
        this.books = books;
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView imgBook;
        private TextView txtName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            //desc
            parent = itemView.findViewById(R.id.parent);
            imgBook =  itemView.findViewById(R.id.imgBook);
            txtName = itemView.findViewById(R.id.txtBookName);
        }
    }
}

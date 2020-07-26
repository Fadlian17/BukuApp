package com.alfansyah.android.github_user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this,2));


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"A123B","Boy Chandra",145,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.blanja.com%2Fkatalog%2Fp%2Fhob%2F-paket-hemat-novel-malik-elsa-malik-elsa-2-boy-candra-100-original--25850190&psig=AOvVaw0_Whhn8dzITBCaMA7tonkg&ust=1595856916561000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNDvrLuE6-oCFQAAAAAdAAAAABAD"
        ,"Belive the Truth","Long Description"));
        adapter.setBooks(books);
    }
}
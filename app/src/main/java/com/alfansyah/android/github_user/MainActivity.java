package com.alfansyah.android.github_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAll,btnAlready,btnWant,btnCurrent,btnFav,btnAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews(){
        btnAll = findViewById(R.id.btn_All);
        btnAlready = findViewById(R.id.btn_Already);
        btnWant = findViewById(R.id.btn_Want);
        btnCurrent = findViewById(R.id.btn_Currently);
        btnFav = findViewById(R.id.btn_Fav);
        btnAbout = findViewById(R.id.btn_About);
    }
}
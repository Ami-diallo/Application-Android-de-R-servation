package com.example.a2905devoir3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
    }

    public void Back(View v) {
        Intent I = new Intent(getApplicationContext(), Recherche.class);
        startActivity(I);
    }
}
package com.example.a2905devoir3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RechercheAvancee extends AppCompatActivity {
    Dialog myDialog;
    BottomNavigationView bottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recherche_avancee);
        myDialog = new Dialog(this);

        bottomNav = (BottomNavigationView)findViewById(R.id.bottomView);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent I;
                switch(item.getItemId()){
                    case R.id.bottom_search:
                        I = new Intent(getApplicationContext(), Recherche.class);
                        startActivity(I);
                        return true;

                    case R.id.bottom_horaire:
                        I = new Intent(getApplicationContext(), Horaire.class);
                        startActivity(I);
                        return true;
/*
                    case R.id.bottom_messages:
                        Intent I = new Intent(getApplicationContext(), Messages.class);
                        startActivity(I);
                        return true;

                    case R.id.bottom_horaire:
                        Intent I = new Intent(getApplicationContext(), Horaire.class);
                        startActivity(I);
                        return true;

                    case R.id.bottom_cart:
                        Intent I = new Intent(getApplicationContext(), Panier.class);
                        startActivity(I);
                        return true;
*/
                }
                return false;
            }
        });
    }


    public void BackToResearch(View v) {
        Intent I = new Intent(getApplicationContext(), Recherche.class);
        startActivity(I);
    }

    // source : https://stackoverflow.com/questions/22217059/display-dialog-box-on-top-right-corner-in-android-activity
    public void ShowPopup(View v) {
        Window window = myDialog.getWindow();

        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.gravity = Gravity.RIGHT;

        window.setAttributes(wlp);

        myDialog.setContentView(R.layout.sidebar);
        myDialog.show();
    }



    public void to_MesCours(View v) {
        Intent I = new Intent(getApplicationContext(), MesCours.class);
        startActivity(I);
    }

    public void to_MesFavoris(View v) {
        Intent I = new Intent(getApplicationContext(), Favoris.class);
        startActivity(I);
    }

    public void showProfile(View v) {
        Intent I = new Intent(getApplicationContext(), Profil.class);
        startActivity(I);
    }


}
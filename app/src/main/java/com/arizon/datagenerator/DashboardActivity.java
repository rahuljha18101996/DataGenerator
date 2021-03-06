package com.arizon.datagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void finishApp(View view) {
        finish();
    }

    public void newRecipe(View view) {
        startActivity(new Intent(DashboardActivity.this,NewRecipeActivity.class));
    }
}
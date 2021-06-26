package com.upc.appservicio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_perfil:
                Intent intent_p = new Intent(HomeActivity.this, PerfilActivity.class);
                startActivity(intent_p);
                return true;

            case R.id.menu_logout:
                Intent intent_l = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent_l);
                return true;

            case R.id.menu_calificar:
                Intent intent_c = new Intent(HomeActivity.this, CalificarActivity.class);
                startActivity(intent_c);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
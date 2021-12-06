package com.example.ret1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        actionBar=getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.iconoprincipal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(getApplicationContext(), "Opcion 1 En construccion", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(splash.this,Productos.class);
                startActivity(intent1);
                return true;

            case R.id.option2:
                Toast.makeText(getApplicationContext(), "Opcion 2 En construccion", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(splash.this,Servicios.class);
                startActivity(intent2);
                return true;

            case R.id.option3:
                Toast.makeText(getApplicationContext(), "Opcion 3 En construccion", Toast.LENGTH_SHORT).show();
                Intent intent3=new Intent(splash.this,Sucursales.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
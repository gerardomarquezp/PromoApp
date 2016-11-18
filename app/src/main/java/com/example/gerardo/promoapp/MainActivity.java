package com.example.gerardo.promoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button btnPixel= (Button) findViewById(R.id.btnpromo1);
        final Button btnIphone= (Button) findViewById(R.id.btnpromo2);
        final ImageView imagen=(ImageView)  findViewById(R.id.imageView);
        final TextView texto=(TextView) findViewById(R.id.texto);
        final TextView descripcion=(TextView) findViewById(R.id.descripcion);

        btnPixel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.pixel);
                texto.setText("Google Pixel");
                descripcion.setText("Meet Pixel, Phone by Google. It has the highest rated smartphone camera. Ever. A battery that lasts all day. Unlimited storage for all your photos and videos.");
            }
        });

        btnIphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.iphone);
                texto.setText("Apple iPhone 7");
                descripcion.setText("El iPhone 7 llega con un rendimiento y una duración de batería incomparables, bocinas en estéreo, nuevos acabados, y es resistente al agua.");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

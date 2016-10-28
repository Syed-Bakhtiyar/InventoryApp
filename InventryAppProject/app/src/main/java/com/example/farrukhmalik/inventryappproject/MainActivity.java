package com.example.farrukhmalik.inventryappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btns, btnp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           btns = (Button) findViewById(R.id.sdetail);
           btns.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   startActivity(new Intent(getApplicationContext(), SalesMainActivity.class));
               }
           });


           btnp = (Button) findViewById(R.id.pdetail);


           btnp.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   startActivity(new Intent(getApplicationContext(), SalesMainActivity.class));
               }
           });



    }
}

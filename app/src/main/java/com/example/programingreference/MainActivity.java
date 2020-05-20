package com.example.programingreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_book1,btn_book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_book1=(Button) findViewById(R.id.book1);
        btn_book2=(Button) findViewById(R.id.book2);


        btn_book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent( MainActivity.this,Book1.class);
                startActivity(i);

            }
        });

        btn_book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2=new Intent( MainActivity.this,Book2.class);
                startActivity(i2);

            }
        });
    }
}

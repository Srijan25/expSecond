package com.srijan.secondexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    Button lgn;
    static String con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=findViewById(R.id.contact);
        lgn=findViewById(R.id.login);
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                EditText editText = (EditText) findViewById(R.id.contact);
                String message = editText.getText().toString();
                intent.putExtra(con, message);
                startActivity(intent);


            }
        });
    }

}
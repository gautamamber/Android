package com.wordpress.ambergautam.fbclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_new_account extends AppCompatActivity {
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
        b2 = (Button)findViewById(R.id.next);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Create_new_account.this,Name.class);
                        startActivity(i);
                    }
                }

        );
    }
}

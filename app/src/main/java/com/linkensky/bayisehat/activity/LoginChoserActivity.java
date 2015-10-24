package com.linkensky.bayisehat.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.linkensky.bayisehat.R;

public class LoginChoserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_choser);

        Button loginIbu = (Button)findViewById(R.id.bloginIbu);
        Button loginBayi = (Button) findViewById(R.id.bloginBayi);

        loginIbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(LoginChoserActivity.this, LoginActivity.class);
//                intent.putExtra("mode", "ibu");
//                startActivity(intent);
            }
        });

        loginBayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(LoginChoserActivity.this, LoginActivity.class);
//                intent.putExtra("mode", "bayi");
//                startActivity(intent);
            }
        });
    }
}

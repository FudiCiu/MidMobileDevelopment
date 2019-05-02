package com.latihanandroid.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BukaAktivityKubus(View view) {
        Intent intent = new Intent(MainActivity.this,KubusActivity.class);
        startActivity(intent);
    }

    public void BukaAktivityBalok(View view) {
        Intent intent = new Intent(MainActivity.this,BalokActivity.class);
        startActivity(intent);
    }

    public void BukaAktivityBola(View view) {
        Intent intent= new Intent(MainActivity.this,BolaActivity.class);
        startActivity(intent);
    }
}

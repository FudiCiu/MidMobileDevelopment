package com.latihanandroid.midmobiledevelopment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class BolaActivity extends AppCompatActivity {
    private EditText edtJari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        edtJari= (EditText) findViewById(R.id.edtJari);
    }

    public void HitungVolumeBola(View view) {
        Double jari= Double.parseDouble(edtJari.getText().toString());

        Double vol= (4*3.14*jari*jari*jari)/3;
        Intent intent = new Intent(BolaActivity.this,HasilActivity.class);
        intent.putExtra("vol",vol);
        startActivity(intent);
    }
}

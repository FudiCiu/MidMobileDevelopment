package com.latihanandroid.midmobiledevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BalokActivity extends AppCompatActivity {
    private EditText edtPanjangBalok,edtLebarBalok,edtTinggiBalok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        edtPanjangBalok=(EditText) findViewById(R.id.edtPanjangBalok);
        edtLebarBalok=(EditText) findViewById(R.id.edtLebarBalok);
        edtTinggiBalok=(EditText) findViewById(R.id.edtTinggiBalok);

    }

    public void HitungVolumeBalok(View view) {
        Double panjang= Double.parseDouble(edtPanjangBalok.getText().toString());
        Double lebar= Double.parseDouble(edtLebarBalok.getText().toString());
        Double tinggi= Double.parseDouble(edtTinggiBalok.getText().toString());
        Double vol= panjang*lebar*tinggi;
        Intent intent= new Intent(BalokActivity.this,HasilActivity.class);
        intent.putExtra("vol",vol);
        startActivity(intent);
    }
}

package com.latihanandroid.midmobiledevelopment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class KubusActivity extends AppCompatActivity {
    private EditText edtPanjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        edtPanjang= (EditText)findViewById(R.id.edtPanjang);
    }

    public void HitungVolumeKubus(View view) {
        Double sisi= Double.parseDouble(edtPanjang.getText().toString())  ;
        Double vol= sisi*sisi*sisi;
        Intent intent = new Intent(KubusActivity.this,HasilActivity.class);
        intent.putExtra("vol",vol);
        startActivity(intent);
    }
}

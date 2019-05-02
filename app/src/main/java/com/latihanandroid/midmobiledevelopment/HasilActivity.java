package com.latihanandroid.midmobiledevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class HasilActivity extends AppCompatActivity {
    private EditText edtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        edtHasil=(EditText) findViewById(R.id.edtHasil);
        Double vol= getIntent().getDoubleExtra("vol",0);
        edtHasil.setText(String.valueOf(vol));
    }
}

package com.example.sinki.bai23radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radTuyetVoi,radTot,radTam,radTe;
    Button btnDanhGia;
    TextView txtDanhGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnDanhGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyBinhChon();
            }
        });
        radTuyetVoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,radTuyetVoi.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        radTam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,radTam.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        radTot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,radTot.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        radTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,radTe.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void xuLyBinhChon() {
        String kq="";
        if(radTuyetVoi.isChecked())
        {
            kq=radTuyetVoi.getText().toString();
        }
        if(radTot.isChecked())
        {
            kq=radTot.getText().toString();
        }
        if(radTam.isChecked())
        {
            kq=radTam.getText().toString();
        }
        if(radTe.isChecked())
        {
            kq=radTe.getText().toString();
        }
        Toast.makeText(MainActivity.this,"Bạn chọn: "+kq,Toast.LENGTH_SHORT).show();
    }

    private void addControls() {
        radTuyetVoi = (RadioButton) findViewById(R.id.radTuyetVoi);
        radTot = (RadioButton) findViewById(R.id.radTot);
        radTam = (RadioButton) findViewById(R.id.radTam);
        radTe = (RadioButton) findViewById(R.id.radTe);
        btnDanhGia= (Button) findViewById(R.id.btnDanhGia);
        txtDanhGia = (TextView) findViewById(R.id.txtDanhGia);
    }
}

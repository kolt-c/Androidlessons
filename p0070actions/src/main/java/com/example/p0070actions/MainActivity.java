package com.example.p0070actions;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView tvOut;
Button btnOk;
Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //searching for our objects
        tvOut=(TextView)findViewById(R.id.tvOut);
        btnOk=(Button)findViewById(R.id.btnOk);
        btnCancel=(Button)findViewById(R.id.btnCancel);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed OK button");
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed Cancel button");
            }
        };

        //присвоим обработчик кнопке ОК
        btnOk.setOnClickListener(oclBtnOk);
        //присвоим обработчик кнопке Cancel
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}

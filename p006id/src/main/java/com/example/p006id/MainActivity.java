package com.example.p006id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView= (TextView)findViewById(R.id.myText);
        myTextView.setText("New text in TextView");
        Button button=(Button)findViewById(R.id.button);
        button.setText("My button");
        button.setEnabled(false);
        CheckBox myChb=(CheckBox)findViewById(R.id.mmyChb);
        myChb.setChecked(true);
    }
}

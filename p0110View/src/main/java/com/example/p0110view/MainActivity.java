package com.example.p0110view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        etName = (EditText) findViewById(R.id.etName);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
switch(v.getId()){
    case R.id.btnCreate:
        // Создание LayoutParams c шириной и высотой по содержимому
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(wrapContent,wrapContent);
        // переменная для хранения значения выравнивания
        // по умолчанию пусть будет LEFT
        int btnGravity = Gravity.LEFT;
        // определяем, какой RadioButton "чекнут" и
        // соответственно заполняем btnGravity
        switch(rgGravity.getCheckedRadioButtonId()){
            case R.id.rbLeft:
                btnGravity = Gravity.LEFT;
                break;
            case R.id.rbCenter:
                btnGravity = Gravity.CENTER;
                break;
            case R.id.rbRight:
                btnGravity = Gravity.RIGHT;
                break;
        }
        //ереносим полученное значение в LayoutParams
        lParams.gravity = btnGravity;
        //сооздаем Баттон и добавляем в LinearLayout
        Button btnNew = new Button(this);
        btnNew.setText(etName.getText().toString());
        llMain.addView(btnNew,lParams);
        break;
    case R.id.btnClear:
        llMain.removeAllViews();
        Toast.makeText(this,"Уддалено",Toast.LENGTH_SHORT).show();
        break;


}
    }
}

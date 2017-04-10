package com.example.mobilebeginning_lab1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText coffee, cocoa, icetea;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    public void init(){
        coffee = (EditText)findViewById(R.id.et_coffee);
        cocoa = (EditText)findViewById(R.id.et_cocoa);
        icetea = (EditText)findViewById(R.id.et_icetea);
        tv = (TextView)findViewById(R.id.tv);
    }
    public void onClick(View v){
        int coffee_num =Integer.parseInt( coffee.getText().toString() );
        int cocoa_num = Integer.parseInt(cocoa.getText().toString());
        int icetea_num = Integer.parseInt(icetea.getText().toString());
        int sum = coffee_num * 1000 + icetea_num * 1500 + cocoa_num *700;
        tv.setText("총 가격은 "+sum+ "입니다");
    }
}
